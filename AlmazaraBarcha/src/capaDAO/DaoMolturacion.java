/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaDAO;

import almazarabarcha.Modelo.Molturacion;
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
public class DaoMolturacion {
    
    
    public static List<Molturacion> getMolturaciones(Cliente c) throws BusinessException {
                

		String hql = "SELECT idMolturacion, kgOliva, fecha FROM Molturacion m WHERE m.Cliente_idCliente = "
                        + "(SELECT idCliente FROM Cliente WHERE nombre = :nombre";
                
		try {
			List<Molturacion> lista = (List<Molturacion>) UtilesHibernate.getSession()
                        .createQuery(hql).setParameter("nombre", c.getNombre()).list();

			return lista;
		} catch (Exception e) {
			Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE,
					"Error al consultar la lista de molturaciones", e);
			throw new BusinessException("Error al consultar lista de molturaciones");
                }
    }
    public static boolean insertar(Molturacion m) throws BusinessException {
		boolean result = false;
		Session s = UtilesHibernate.getSession();
		
		try {
			s.save(m);
			result = true;
			

		} catch (Exception e) {
			Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE,
					"Error al insertar molturacion", e);
			throw new BusinessException("Error al insertar molturacion");
		}
		
		return result;
    }
    
    
    
    
}
