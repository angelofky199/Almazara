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
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;

/**
 *
 * @author Usuario
 */
public class DaoCambio {
    
       public static boolean insertar(Cambio c) throws BusinessException {
		boolean result = false;
		Session s = UtilesHibernate.getSession();
		
		try {
			s.save(c);
			result = true;
			

		} catch (Exception e) {
			Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE,
					"Error al insertar cambio", e);
			throw new BusinessException("Error al insertar cambio");
		}
		
		return result;
    }
}
