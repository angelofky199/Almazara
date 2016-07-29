package almazarabarcha.Modelo;

import java.util.ArrayList;

public class GestorAlmazara {
    ArrayList<Cliente> clientes;
    
    public GestorAlmazara(){
        clientes = new ArrayList<>();
    }
    
    public int buscarCliente(String nombre_cliente){
        int pos = -1;
        int i;
        boolean existe = false;
        
        for(i = 0; i < clientes.size() && !existe; i++)
            if(nombre_cliente.equals(clientes.get(i).getNombre_cliente())){
                pos = i;
                existe = true;
            }

        return pos;
    }
    
    public boolean addCliente(String nombre_cliente, String dni, String direccion, String poblacion, String telefono){
        boolean ok;
        int i;
        
       if(buscarCliente(nombre_cliente) == -1){
           clientes.add(new Cliente(
                    nombre_cliente,
                    dni,
                    direccion,
                    poblacion,
                    telefono));
           
           ok = true;
       }else
           ok = false;
        
        return ok;
    }
    
    public boolean addCambioCliente(String nombre_cliente, Cambio cambio){
        boolean ok;
        int pos_cliente;
        
        pos_cliente = buscarCliente(nombre_cliente);
          
        if(pos_cliente >= 0){
            cambio.setId(clientes.get(pos_cliente).sizeCambios());
            clientes.get(pos_cliente).AddCambios(cambio);
            ok = true;
        }else
            ok =false;
            
        return ok;
    }
    
    public boolean addCompraCliente(String nombre_cliente, Cambio compra){
        boolean ok;
        int pos_cliente;
        
        pos_cliente = buscarCliente(nombre_cliente);
          
        if(pos_cliente >= 0){
            compra.setId(clientes.get(pos_cliente).sizeCambios());
            clientes.get(pos_cliente).AddCambios(compra);
            ok = true;
        }else
            ok =false;
            
        return ok;
    }
    
    public boolean addMolturacionCliente(String nombre_cliente, Molturacion molturacion){
        boolean ok;
        int pos_cliente;
        
        pos_cliente = buscarCliente(nombre_cliente);
          
        if(pos_cliente >= 0){
            molturacion.setId(clientes.get(pos_cliente).sizeMolturaciones());
            clientes.get(pos_cliente).addMolturacion(molturacion);
            ok = true;
        }else
            ok =false;
            
        return ok;
    }
    
    public boolean addVentaCliente(String nombre_cliente, Venta venta){
        boolean ok;
        int pos_cliente;
        
        pos_cliente = buscarCliente(nombre_cliente);
          
        if(pos_cliente >= 0){
            venta.setId(clientes.get(pos_cliente).sizeVentas());
            clientes.get(pos_cliente).addVenta(venta);
            ok = true;
        }else
            ok =false;
            
        return ok;
    }
    
    /*
    
        Problema, si eliminamos una venta (por ejemplo) se volverian locas las id
            * Solucion 
                    tener una variable en esta clase para cada id (hay huecos en las id)
                    actualizar todos los id al borrar uno (no hay huecos en las id)
    */
    
}
