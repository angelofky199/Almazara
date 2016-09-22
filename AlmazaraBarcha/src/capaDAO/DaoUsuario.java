/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaDAO;

import excepciones.BusinessException;
import hibernate.UtilesHibernate;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Cliente;
import pojos.Usuario;
import pojos.Venta;

/**
 *
 * @author Usuario
 */
public class DaoUsuario {

    public static boolean insertar(Usuario u) throws BusinessException {
        boolean result = false;
        Session s = UtilesHibernate.getSession();
        Transaction tx = s.beginTransaction();
        try {
            s.save(u);
            result = true;

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE,
                    "Error al insertar usuario", e);
            throw new BusinessException("Error al insertar usuario");
        }

        return result;
    }

    public static boolean isAdmin(String contrasenya) throws BusinessException {
        Session s = UtilesHibernate.getSession();
        boolean result = false;

        try {
            String sql = "SELECT idUsuario FROM Usuario u WHERE u.usuario LIKE 'admin' and u.contrasenya LIKE :contrasenya ";

            if (contrasenya != null) {
                if ((s.createQuery(sql).setParameter("contrasenya", contrasenya)).uniqueResult() != null) {
                    result = true;
                }

            }
        } catch (Exception e) {

            Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE,
                    "Error al consultar los cliente", e);
            throw new BusinessException(
                    "Error al consultar usuarios por cliente");

        }

        return result;
        
    }     

    public static boolean isUsuario(String nombre, String contrasenya) throws BusinessException {
        Session s = UtilesHibernate.getSession();
        boolean result = false;

        try {
            String sql = "SELECT idUsuario FROM Usuario u WHERE u.usuario LIKE :nombre and u.contrasenya LIKE :contrasenya ";

            if (contrasenya != null) {
                if ((s.createQuery(sql).setParameter("nombre", nombre).setParameter("contrasenya", contrasenya)).uniqueResult() != null) {
                    result = true;
                }

            }
        } catch (Exception e) {

            Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE,
                    "Error al consultar los cliente", e);
            throw new BusinessException(
                    "Error al consultar usuarios por cliente");

        }

     return result;
    
    }
}

