package almazarabarcha.Modelo;

import java.util.ArrayList;

public class GestorAlmazara {
    Cliente cliente = new Cliente(null, null, null, null, null, null);
    Molturacion molturacion;
    ArrayList clientes;
    ArrayList molturaciones;

    public GestorAlmazara(Cliente c, ArrayList clientes) {
        this.cliente = c;
        this.clientes = clientes;
    }
    public void AnyadirClientes(Cliente c){
        clientes = new ArrayList();
        clientes.add(c);
    }
    
    
}
