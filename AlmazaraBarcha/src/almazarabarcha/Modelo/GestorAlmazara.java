package almazarabarcha.Modelo;

import java.util.ArrayList;

public class GestorAlmazara {
    Cliente c = new Cliente(null, null, null, null, null, null);
    ArrayList clientes;

    public GestorAlmazara(Cliente c, ArrayList clientes) {
        this.c = c;
        this.clientes = clientes;
    }
    public void AnyadirClientes(Cliente c){
        clientes = new ArrayList();
        clientes.add(c);
    }
    
    
}
