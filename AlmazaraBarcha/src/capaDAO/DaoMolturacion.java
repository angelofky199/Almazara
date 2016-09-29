package capaDAO;

import excepciones.BusinessException;
import hibernate.UtilesHibernate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Cliente;
import pojos.Molturacion;

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
    
    public static Molturacion getMolturacion(Cliente c,Date fecha, float kgOliva) throws BusinessException {

        Session s = UtilesHibernate.getSession();

        Molturacion m;
        String hql = "SELECT m FROM Molturacion m WHERE Cliente_idCliente = :idcliente AND fecha = :fecha AND kgOliva = :kgOliva";
        
        try {
            m = (Molturacion) s.createQuery(hql).setParameter("idcliente", c.getIdCliente()).setParameter("fecha", fecha).setParameter("kgOliva", kgOliva).uniqueResult();

        } catch (Exception e) {

            Logger.getLogger(DaoMolturacion.class.getName()).log(Level.SEVERE,
                    "Error al consultar la molturacion", e);
            throw new BusinessException("Error al consultar molturacion");
        }

        return m;

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
    
    public static boolean update(Molturacion m) throws BusinessException {
        boolean result = false;
        Session s = UtilesHibernate.getSession();
        Transaction tx = s.beginTransaction();
        try {
            
            s.update(m);
            tx.commit();
            result = true;

        } catch (Exception e) {
            tx.rollback();
            Logger.getLogger(DaoMolturacion.class.getName()).log(Level.SEVERE,
                    "Error al actualizar la molturacion", e);
            throw new BusinessException("Error al actualizar la molturacion");
        }

        return result;
    }

    public static List<Molturacion> getMolturacionesNoPagadas(Cliente c) throws BusinessException {
        Session s = UtilesHibernate.getSession();

        List<Molturacion> lista = new ArrayList<>();
        String hql = "SELECT m FROM Molturacion m WHERE Cliente_idCliente = "
                + "(SELECT idCliente FROM Cliente c WHERE nombre LIKE :nombre) AND Pagada = 0";

        try {
            lista = (List<Molturacion>) s.createQuery(hql).setParameter("nombre", c.getNombre()).list();

        } catch (Exception e) {

            Logger.getLogger(DaoMolturacion.class.getName()).log(Level.SEVERE,
                    "Error al consultar la lista de molturaciones", e);
            throw new BusinessException("Error al consultar lista de molturaciones");
        }

        return lista;
    }

    public static List<Molturacion> getMolturacionesPagadas(Cliente c) throws BusinessException {
        Session s = UtilesHibernate.getSession();

        List<Molturacion> lista = new ArrayList<>();
        String hql = "SELECT m FROM Molturacion m WHERE Cliente_idCliente = "
                + "(SELECT idCliente FROM Cliente c WHERE nombre LIKE :nombre) AND Pagada = 1";

        try {
            lista = (List<Molturacion>) s.createQuery(hql).setParameter("nombre", c.getNombre()).list();

        } catch (Exception e) {

            Logger.getLogger(DaoMolturacion.class.getName()).log(Level.SEVERE,
                    "Error al consultar la lista de molturaciones", e);
            throw new BusinessException("Error al consultar lista de molturaciones");
        }

        return lista;
    }

}
