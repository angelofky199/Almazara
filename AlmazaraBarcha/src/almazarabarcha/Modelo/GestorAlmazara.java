package almazarabarcha.Modelo;

import java.util.ArrayList;

public class GestorAlmazara {
    Cliente cliente = new Cliente(null, null, null, null, null, null);
    ArrayList clientes;
    ArrayList compras;
    ArrayList molturaciones;

    public GestorAlmazara() {
      
    }
    public void AnyadirClientes(Cliente c){
        clientes = new ArrayList();
        clientes.add(c);
    }
    public void AnyadirMolturaciones(Molturacion molturacion){
        molturacion = new Molturacion();
        molturaciones.add(molturacion);
    }
    
    public void AnyadirCompras(Compra compra){
        compras = new ArrayList();
        compras.add(compra);
    }
    
}
