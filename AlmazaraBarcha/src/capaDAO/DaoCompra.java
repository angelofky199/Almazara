/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaDAO;

import almazarabarcha.Modelo.Compra;
import almazarabarcha.Modelo.Molturacion;
import excepciones.BusinessException;
import hibernate.UtilesHibernate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Cliente;

/**
 *
 * @author Usuario
 */
public class DaoCompra {
    
   public static List<Compra> getCompras(Cliente c) throws BusinessException {

        Session s = UtilesHibernate.getSession();

        List<Compra> lista = new ArrayList<>();
        String hql = "SELECT idCompra, kgOliva, precioKg, fecha FROM Compra c WHERE c.Cliente_idCliente = "
                + "(SELECT idCliente FROM Cliente WHERE nombre = :nombre";

        try {
            lista = (List<Compra>) s.createQuery(hql).setParameter("nombre", c.getNombre()).list();

        } catch (Exception e) {

            Logger.getLogger(DaoCompra.class.getName()).log(Level.SEVERE,
                    "Error al consultar la lista de compras", e);
            throw new BusinessException("Error al consultar lista de compras");
        }

        return lista;

    }

    public static boolean insertar(Compra c) throws BusinessException {
        boolean result = false;
        Session s = UtilesHibernate.getSession();
        Transaction tx = s.beginTransaction();
        try {
            s.save(c);
            result = true;

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE,
                    "Error al insertar compra", e);
            throw new BusinessException("Error al insertar compra");
        }

        return result;

    }
}
