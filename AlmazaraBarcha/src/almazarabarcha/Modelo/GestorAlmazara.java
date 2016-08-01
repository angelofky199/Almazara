package almazarabarcha.Modelo;

import java.util.ArrayList;

public class GestorAlmazara {
    private ArrayList<Cliente> clientes;


    public GestorAlmazara() {
        clientes = new ArrayList<>();
    }
 
    
    /*************************Adders************************************/
    /**
     * Añade un cliente en el caso de que no exista ninguno con el mismo nombre
     * @param c cliente a añadir
     * @return devuelve un valor booleano en función si se ha podido añadir o no
     */
    public boolean addCliente(Cliente c){
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
    public boolean addVenta(Venta venta, String nombre_cliente){
        
    }
    
    /**
     * Añade una molturación a un cliente
     * @param molturacion
     * @param nombre_cliente
     * @return devuelve true si existe el cliente
     */
    public boolean addMolturacion(Molturacion molturacion, String nombre_cliente){
        boolean ok = true;
        int pos;
       
        pos = buscarCliente(nombre_cliente);
        
        if(pos >= 0)
            ok = false;
        else
            clientes.get(pos).addMolturacion(molturacion);
        
        return ok;
       
    }
    
    public boolean addCompra(Compra compra, String nombre_cliente){
        boolean ok = true;
        int pos;
       
        pos = buscarCliente(nombre_cliente);
        
        if(pos >= 0)
            ok = false;
        else
            clientes.get(pos).addCompra(compra);
        
        return ok;
    }
    
    public boolean
    
    
    
    /*************************Operaciones****************************/
    /**
     * Busca un cliente en el arraylist clientes
     * @param nombre nombre del cliente a buscar
     * @return posición del cliente en el arraylist, devuelve -1 si no existe
     */
    public int buscarCliente(String nombre){
        int i;
        int pos = -1;
        
        for(i = 0; i < clientes.size() && pos == -1; i++)
            if (nombre.equals(clientes.get(i).getNombre_cliente()))
                pos = i;

        return pos;
    }
    
    public String mostrar(){
        
       
         return (clientes.get(0).getNombre_cliente());
        
    }
}
