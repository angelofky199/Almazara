/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaDAO;

import excepciones.BusinessException;
import hibernate.UtilesHibernate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.query.Query;
import pojos.Cliente;


/**
 *
 * @author Usuario
 */
public class DaoCliente {
    /**
	 * M�todo que, dado un Cliente, lo inserte.
	 * 
	 * @param c
	 * @throws BusinessException
	 */
	public static boolean insertar(Cliente c) throws BusinessException {
		boolean result = false;
		Session s = UtilesHibernate.getSession();
		
		try {
			s.save(c);
			result = true;
			

		} catch (Exception e) {
			Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE,
					"Error al insertar cliente", e);
			throw new BusinessException("Error al insertar cliente");
		}
		
		return result;
	}
        
        public static List<Cliente> getClientes() throws BusinessException {

		String hql = "SELECT c FROM Cliente c";

		try {
			List<Cliente> lista = (List<Cliente>) UtilesHibernate.getSession()
					.createQuery(hql).list();

			return lista;
		} catch (Exception e) {
			Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE,
					"Error al consultar la lista de los clientes", e);
			throw new BusinessException("Error al consultar lista de clientes");
                }
        }   
        
        public static Cliente getCliente(String nombre) throws BusinessException {
        Session s = UtilesHibernate.getSession();
        Cliente c;
        
        try {
                String sql = "SELECT c FROM Cliente c WHERE c.nombre LIKE :nombre";
                Query q = s.createQuery(sql).setParameter("nombre", nombre);

                if (nombre != null)
                {
                        q.setString("nombre", nombre);
                }

                c = (Cliente) q.uniqueResult();

                return c;
            } catch (Exception e) {
                    Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE,
                                    "Error al consultar los cliente", e);
                    throw new BusinessException(
                                    "Error al consultar usuarios por cliente");
            }
	}
        
        public static boolean borrarCliente(int id_cliente) throws BusinessException {
		boolean result = false;
		Session s = UtilesHibernate.getSession();

		try {

			String borrarCliente = "DELETE FROM Cliente WHERE idCli = :id";

			Query q = s.createQuery(borrarCliente);

			q.setInteger("id", id_cliente);

			q.executeUpdate();

			result = true;

		} catch (Exception e) {

			Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE,
					"Error al borrar cliente", e);

			throw new BusinessException("Error al borrar cliente");
		}

		return result;
	}
        
        
        	public static boolean update(Cliente c) throws BusinessException {
		boolean result = false;
		Session s = UtilesHibernate.getSession();
		
		try {
			s.update(c);
			result = true;
			

		} catch (Exception e) {
			Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE,
					"Error al actualizar cliente", e);
			throw new BusinessException("Error al actualizar cliente");
		}
		
		return result;
	}
                
}
