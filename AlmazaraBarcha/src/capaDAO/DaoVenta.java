/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaDAO;

import excepciones.BusinessException;
import hibernate.UtilesHibernate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Cliente;
import pojos.Venta;

/**
 *
 * @author Usuario
 */
public class DaoVenta {

    public static List<Venta> getVentas(Cliente c) throws BusinessException {

        Session s = UtilesHibernate.getSession();

        List<Venta> lista = new ArrayList<>();
        String hql = "SELECT idVenta, totalVenta, fecha FROM Venta v WHERE v.Cliente_idCliente = "
                + "(SELECT idCliente FROM Cliente WHERE nombre = :nombre";

        try {
            lista = (List<Venta>) s.createQuery(hql).setParameter("nombre", c.getNombre()).list();

        } catch (Exception e) {

            Logger.getLogger(DaoMolturacion.class.getName()).log(Level.SEVERE,
                    "Error al consultar la lista de ventas", e);
            throw new BusinessException("Error al consultar lista de ventas");
        }

        return lista;

    }

    public static boolean insertar(Venta v) throws BusinessException {
        boolean result = false;
        Session s = UtilesHibernate.getSession();
        Transaction tx = s.beginTransaction();
        try {
            s.save(v);
            result = true;

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE,
                    "Error al insertar venta", e);
            throw new BusinessException("Error al insertar venta");
        }

        return result;

    }
}
