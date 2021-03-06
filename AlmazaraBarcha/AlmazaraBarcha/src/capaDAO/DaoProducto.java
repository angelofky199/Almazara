package capaDAO;

import excepciones.BusinessException;
import hibernate.UtilesHibernate;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import pojos.Producto;

public class DaoProducto {
    
    public static boolean insertar(Producto p) throws BusinessException {
        boolean result = false;
        Session s = UtilesHibernate.getSession();

        try {
            s.save(p);
            result = true;
        } catch (Exception e) {
            Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE,
                            "Error al insertar producto", e);
            throw new BusinessException("Error al insertar producto");
        }

        return result;
    }
}
