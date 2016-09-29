package almazarabarcha.Modelo;

import excepciones.BusinessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GestorAlmazara {
    //private ArrayList<Cliente> clientes;

    private Connection con;

    public GestorAlmazara() {
        //clientes = new ArrayList<>();
    }

    public void conectar(String usr, String pwd) throws BusinessException {
        String DRIVER = "com.mysql.jdbc.Driver";
        String URL = "jdbc:mysql://localhost:3306/almazaradb";

        try {
            Class.forName(DRIVER).newInstance();
            con = DriverManager.getConnection(URL, usr, pwd);
        } catch (InstantiationException e) {
            e.printStackTrace();
            throw new BusinessException(
                    "Error en conexion. Problema con el driver");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new BusinessException(
                    "Error en conexion. Problema con el driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new BusinessException(
                    "Error en conexion. Problema con el driver");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new BusinessException("Error en conexion.");
        }
    }

    public void desconectar() throws BusinessException {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new BusinessException("Error en desconexion.");

        }
    }

    public Connection getCon() {
        return con;
    }

    /**
     * ***********************Adders***********************************
     */
    /**
     * Añade un cliente en el caso de que no exista ninguno con el mismo nombre
     *
     * @param c cliente a añadir
     * @return devuelve un valor booleano en función si se ha podido añadir o no
     */
    /*public boolean addCliente(Cliente c){
     boolean ok = true;
        
     if(buscarCliente(c.getNombre_cliente()) >= 0)
     ok = false;
     else
     clientes.add(c);
        
     return ok;
     }
    
     /**
     * Añade un molturación aun cliente
     * @param venta
     * @param nombre_cliente
     * @return devuelve true si existe el cliente
     */
    /*public boolean addVenta(Venta venta, String nombre_cliente){
     boolean ok = true;
     int pos;
       
     pos = buscarCliente(nombre_cliente);
        
     if(pos == -1)
     ok = false;
     else{
     venta.increaseId();
     clientes.get(pos).addVenta(venta);
     }
            
        
     return ok;
     }
    
     /**
     * Añade una molturación a un cliente
     * @param molturacion
     * @param nombre_cliente
     * @return devuelve true si existe el cliente
     */
    /*public boolean addMolturacion(Molturacion molturacion, String nombre_cliente){
     boolean ok = true;
     int pos;
       
     pos = buscarCliente(nombre_cliente);
    
     if(pos == -1)
     ok = false;
     else{
     molturacion.increaseId();
     clientes.get(pos).addMolturacion(molturacion);
     System.out.println(clientes.get(pos).getNombre_cliente());
     }
            
        
     return ok;
       
     }
    
     /**
     * Añade una compra a un cliente
     * @param compra
     * @param nombre_cliente
     * @return devuelve true si existe el cliente
     */
    /*public boolean addCompra(Compra compra, String nombre_cliente){
     boolean ok = true;
     int pos;
       
     pos = buscarCliente(nombre_cliente);
        
     if(pos == -1)
     ok = false;
     else{
     compra.increaseId();
     clientes.get(pos).addCompra(compra);
     }
            
        
     return ok;
     }
    
     /**
     * Añade un cambio a un cliente
     * @param cambio
     * @param nombre_cliente
     * @return devuelve true si existe el cliente
     */
    /*public boolean addCambio(Cambio cambio, String nombre_cliente){
     boolean ok = true;
     int pos;
       
     pos = buscarCliente(nombre_cliente);
        
     if(pos == -1)
     ok = false;
     else{
     cambio.increaseId();
     clientes.get(pos).addCambio(cambio); 
     }
            
        
     return ok;
     }
    
     /****************************Getters****************************/
    /*public ArrayList<Cambio> getCambiosActivosCliente(String nombre){
     int pos;
        
     pos = buscarCliente(nombre);
        
     if(pos >  0)
     return clientes.get(pos).getCambiosActivos();
     else
     return new ArrayList<>();
     }
    
     public ArrayList<Compra> getComprasActivasCliente(String nombre){
     int pos;
        
     pos = buscarCliente(nombre);
        
     if(pos >  0)
     return clientes.get(pos).getComprasActivas();
     else
     return new ArrayList<>();
     }
    
     public ArrayList<Molturacion> getMolturacionesActivasCliente(String nombre){
     int pos;
        
     pos = buscarCliente(nombre);
        
     if(pos >  0)
     return clientes.get(pos).getMolturacionesActivas();
     else
     return new ArrayList<>();
     }
    
     public ArrayList<Venta> getVentasActivasCliente(String nombre){
     int pos;
        
     pos = buscarCliente(nombre);
        
     if(pos >  0)
     return clientes.get(pos).getVentasActivas();
     else
     return new ArrayList<>();
     }
    
    
    
     /*************************Operaciones****************************/
    /**
     * Busca un cliente en el arraylist clientes
     *
     * @param nombre nombre del cliente a buscar
     * @return posición del cliente en el arraylist, devuelve -1 si no existe
     */
    /*public int buscarCliente(String nombre){
     int i;
     int pos = -1;
        
     for(i = 0; i < clientes.size() && pos == -1; i++)
     if (nombre.equals(clientes.get(i).getNombre_cliente()))
     pos = i;

     return pos;
     }
     public boolean eliminarCliente(String nombre){
     int i;
     int pos = -1;
     boolean ok = false;
        
     for(i = 0; i < clientes.size() && pos == -1; i++)
     if (nombre.equals(clientes.get(i).getNombre_cliente()))
     {
     clientes.remove(i);
     ok = true;
     }
                
     return ok;
     }
    
    
     public String mostrar(){
     //System.out.println("Cliente: " + clientes.get(0).getNombre_cliente());
     return (clientes.get(1).getNombre_cliente());   
     }
    
     public ArrayList<Cliente> getClientes(){
     return clientes;
     }*/
}
