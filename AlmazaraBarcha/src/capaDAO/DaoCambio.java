/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaDAO;

import almazarabarcha.Modelo.Cambio;
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
public class DaoCambio {

    public static List<Cambio> getCambios(Cliente c) throws BusinessException {

        Session s = UtilesHibernate.getSession();

        List<Cambio> lista = new ArrayList<>();
        String hql = "SELECT idCambio, kgOliva, fecha FROM Cambio c WHERE c.Cliente_idCliente = "
                + "(SELECT idCliente FROM Cliente WHERE nombre = :nombre";

        try {
            lista = (List<Cambio>) s.createQuery(hql).setParameter("nombre", c.getNombre()).list();

        } catch (Exception e) {

            Logger.getLogger(DaoMolturacion.class.getName()).log(Level.SEVERE,
                    "Error al consultar la lista de cambios", e);
            throw new BusinessException("Error al consultar lista de cambios");
        }

        return lista;

    }

    public static boolean insertar(Cambio c) throws BusinessException {
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
                    "Error al insertar cambio", e);
            throw new BusinessException("Error al insertar cambio");
        }

        return result;

    }
}
