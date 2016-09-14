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
}
