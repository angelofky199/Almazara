/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaDAO;

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
public class DaoMolturacion {

    public static List<Molturacion> getMolturaciones(Cliente c) throws BusinessException {

        Session s = UtilesHibernate.getSession();

        List<Molturacion> lista = new ArrayList<>();
        String hql = "SELECT idMolturacion, kgOliva, fecha FROM Molturacion m WHERE m.Cliente_idCliente = "
                + "(SELECT idCliente FROM Cliente WHERE nombre = :nombre";

        try {
            lista = (List<Molturacion>) s.createQuery(hql).setParameter("nombre", c.getNombre()).list();

        } catch (Exception e) {

            Logger.getLogger(DaoMolturacion.class.getName()).log(Level.SEVERE,
                    "Error al consultar la lista de molturaciones", e);
            throw new BusinessException("Error al consultar lista de molturaciones");
        }

        return lista;

    }

    public static boolean insertar(Molturacion m) throws BusinessException {
        boolean result = false;
        Session s = UtilesHibernate.getSession();
        Transaction tx = s.beginTransaction();
        try {
            s.save(m);
            result = true;

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE,
                    "Error al insertar molturacion", e);
            throw new BusinessException("Error al insertar molturacion");
        }

        return result;

    }

}
