package almazarabarcha.Modelo;

public class Venta {
    private static final String[] TIPOS_ACEITES = {"Lampante","Extra","Arberquina", "Bote Flor", "Bote Extra"};
    private static final String[] TIPOS_ENVASES = {"5L","10L","25L"};
    private static final float[] PRECIO_ACEITES = {(float)1.25,(float)5.0,(float)6.0,(float)7.0,(float)5.0};
    private static final float[] PRECIO_ENVASES = {1, 2, 3};
    
    private boolean regalar_envases;
    private float litros_aceite;
    private int[] num_envases = {0,0,0};
    
    private float precio_total;
    
    /**
     * Realiza una venta de envases
     * 
     * @param tipo      Es el tipo del envase 1 - 5L, 2 - 10L, 3 - 25L
     * @param cantidad  Es la cantidad de envases a vender
     * 
     * @return devuelve si se puede realizar la venta
     */
    public boolean venderEnvase(int tipo, int cantidad){
        boolean ok = true;
        
        if(cantidad>0 && tipo<0 && tipo>2){
            num_envases[tipo] += cantidad;
        }else
            ok = false;
        
        return ok;
    }
    
    public boolean venderAceite(){
        boolean ok = true;
        
        
        return ok;
    }

    public boolean isRegalar_envases() {
        return regalar_envases;
    }

    public void setRegalar_envases(boolean regalar_envases) {
        this.regalar_envases = regalar_envases;
    }
    
    
    
}
