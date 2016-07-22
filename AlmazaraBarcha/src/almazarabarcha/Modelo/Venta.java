package almazarabarcha.Modelo;

public class Venta {
    private boolean factura_realizada;
    private String observaciones;
    
    private static final String[] TIPOS_ACEITES = {"Lampante","Extra","Arberquina", "Bote Flor", "Bote Extra"};
    private static final String[] TIPOS_ENVASES = {"0.75L","5L","10L","25L"};
    private static final float[] PRECIO_ACEITES = {(float)1.25,(float)5.0,(float)6.0,(float)7.0,(float)5.0};
    private static final float[] PRECIO_ENVASES = {1, 2, 3, 0};
    
    private boolean regalar_envases;
    private int[] num_envases = {0,0,0,0};
    private float[] num_litros_aceite = {0,0,0,0,0};
    
    private float precio_total_envases;
    private float precio_total_litros;
    
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
        
        if(cantidad>0 && tipo>=0 && tipo<4){
            num_envases[tipo] += cantidad;
            
            if(!regalar_envases)
                precio_total_envases += num_envases[tipo]*PRECIO_ENVASES[tipo];
        }else
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
        
        if(cantidad>0 && tipo>=0 && tipo<5){
           
            precio_total_litros += cantidad*PRECIO_ACEITES[tipo];
            
            if(tipo < 3)
                num_litros_aceite[tipo] += cantidad;
            else
                num_litros_aceite[tipo] += cantidad*(float)0.75; //los botellines son de 0.75L
        }else
            ok = false;
        
        return ok;
    }
  
    /**
     * Total de litros de un tipo de aceite
     * @param tipo 0 - Lampante, 1 - Extra, 2 - Arberquina, 3 - Bote Flor, 4 - Bote Extra
     * @return devuelve el total de un tipo de aceite
     */
    public float getTotalLitrosTipoAceite(int tipo){
        return num_litros_aceite[tipo];
    }
    
    /**
     * Total de litros
     * @return devuelve el total de litros vendidos
     */
    public float getTotalLitros(){
        int i;
        float total = 0;
        
        for(i = 0; i < num_litros_aceite.length; i++)
            total += getTotalLitrosTipoAceite(i);
        
        return total;
    }
    /**
     * Devuelve el precio total de los litros y de los envases
     * @return 
     */
    public float getTotalPrecio(){
        return precio_total_envases+precio_total_litros;
    }

    public float getPrecio_total_envases() {
        return precio_total_envases;
    }

    public float getPrecio_total_litros() {
        return precio_total_litros;
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
    
    
    
    
   
}
