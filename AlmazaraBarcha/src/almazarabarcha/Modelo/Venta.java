package almazarabarcha.Modelo;

import almazarabarcha.Modelo.Inventario.TipoAceite;
import almazarabarcha.Modelo.Inventario.TipoEnvase;

import java.util.ArrayList;

public class Venta {
    private boolean factura_realizada;
    private String observaciones;
    private ArrayList<TipoAceite> tiposaceites;
    private ArrayList<TipoEnvase> tiposenvases;
    private boolean regalar_envases;
    public static int cont_id;  //variable compartida por todas las ventas
    int id;
    


    public Venta() {
        id = 0;
        
        tiposaceites.add(new TipoAceite("Lampante",(float) 1.25, false));
        tiposaceites.add(new TipoAceite("Extra",(float) 5.0, false));
        tiposaceites.add(new TipoAceite("Arberquina",(float) 6.0, false));
        tiposaceites.add(new TipoAceite("Bote Flor",(float) 7.0, true));
        tiposaceites.add(new TipoAceite("Bote Extra",(float) 5.0, true));
        
        tiposenvases.add(new TipoEnvase((float)5.0,(float)1.0));
        tiposenvases.add(new TipoEnvase((float)10.0,(float)2.0));
        tiposenvases.add(new TipoEnvase((float)25.0,(float)3.0));
    }
       
    /**********************VenderProductos*********************/
    /**
     * Realiza una venta de envases de un cierto tamaño
     * 
     * @param tipo      Es el tipo del envase 0 - 0.75L(Cristal), 1 - 5L, 2 - 10L, 3 - 25L
     * @param cantidad  Es la cantidad de envases a vender
     * 
     * @return devuelve si se puede realizar la venta
     */
    public boolean venderEnvase(int tipo, int cantidad){
        boolean ok = true;
        
        if(cantidad>0 && tipo>=0 && tipo<tiposenvases.size())
            tiposenvases.get(tipo).add(cantidad);
        else
            ok = false;
        
        return ok;
    }
    
    /**
     * Vende una cierta cantidad de litros de un tipo de aceite
     * 
     * @param tipo 0 - Lampante, 1 - Extra, 2 - Arberquina, 3 - Bote Flor, 4 - Bote Extra
     * @param cantidad En litros, excepto en los botes
     * 
     * @return devuelve si se puede realizar la venta
     */
    public boolean venderAceite(int tipo, float cantidad){
        boolean ok = true;
        
        if(cantidad>0 && tipo>=0 && tipo<tiposaceites.size())
            tiposaceites.get(tipo).addCantidad(cantidad);
        else
            ok = false;
        
        return ok;
    }
  
    /****************************Gettters**********************/
    /**
     * Total de litros de un tipo de aceite
     * @param tipo 0 - Lampante, 1 - Extra, 2 - Arberquina, 3 - Bote Flor, 4 - Bote Extra
     * @return devuelve el total de un tipo de aceite
     */
    public float getTotalLitrosTipoAceite(int tipo){
        return tiposaceites.get(tipo).getLitros();
    }
    
    /**
     * Total de litros
     * @return devuelve el total de litros vendidos
     */
    public float getTotalLitros(){
        int i;
        float total = 0;
        
        for(i = 0; i < tiposaceites.size(); i++)
            total += getTotalLitrosTipoAceite(i);
        
        return total;
    }
    

    public float getPrecioTotal_envases() {
        float precioTotal = 0;
        int i;
        
        if(!regalar_envases)
            for(i = 0; i < tiposenvases.size();i++)
                precioTotal += tiposenvases.get(i).CalcularValor();
        
        return precioTotal;
    }

    public float getPrecioTotal_tipos_aceite() {
        float precio_total_litros = 0;
        int i;
        
        for(i = 0; i < tiposaceites.size(); i++)
            precio_total_litros += tiposaceites.get(i).CalcularValor();
        
        return precio_total_litros;
    }
    
    /**
     * Devuelve el precio total de los litros y de los envases
     * @return 
     */
    public float getTotalPrecio(){
        return getPrecioTotal_envases()+getPrecioTotal_tipos_aceite();
    }
    
    public boolean isRegalar_envases() {
        return regalar_envases;
    }

    public void setRegalar_envases(boolean regalar_envases) {
        this.regalar_envases = regalar_envases;
    }

    public boolean isFactura_realizada() {
        return factura_realizada;
    }

    public void setFactura_realizada(boolean factura_realizada) {
        this.factura_realizada = factura_realizada;
    }
    
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getId() {
        return id;
    }

    /**
     * Incrementa el Id a partir del último id insertado
     */
    public void increaseId() {
        cont_id++;
        id = cont_id;
    }
}
