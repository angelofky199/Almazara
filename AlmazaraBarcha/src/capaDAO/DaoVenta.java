/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaDAO;

import almazarabarcha.Modelo.Molturacion;
import almazarabarcha.Modelo.Venta;
import excepciones.BusinessException;
import hibernate.UtilesHibernate;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;

/**
 *
 * @author Usuario
 */
public class DaoVenta {
    
     public static boolean insertar(Venta v) throws BusinessException {
		boolean result = false;
		Session s = UtilesHibernate.getSession();
		
		try {
			s.save(v);
			result = true;
			

		} catch (Exception e) {
			Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE,
					"Error al insertar venta", e);
			throw new BusinessException("Error al insertar venta");
		}
		
		return result;
    }
    
}
