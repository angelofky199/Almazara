package almazarabarcha.Modelo;

import java.util.Date;

public class Cambio {
    private static final float RENTABILIDAD_CAMBIO = (float)0.01;           //Lo mismo que dividir entre 100
    private static final float RENDIMIENTO_MULTURACION_ECONOMICO = (float)0.15;    //€
    private static final float RENDIMIENTO_MAQUILA_KG = (float)0.04;               //Sirve para calcular la maquila a reflejar          
    
    private Date fecha;
    private float kg_oliva;
    private boolean paga;
    private boolean retira;
    private float rendimiento;
    private float rentabilidad_maquila;
    private boolean subencionado;
    private boolean declara;
    //private boolean factura;
    private float precio_oliva;
    private String observaciones;
    private float total_real_pagar;
    
    public Cambio() {
        kg_oliva = 0;
        paga = false;
        retira = false;
        rendimiento = (float) 0.12;             //por defecto es del 12%
        rentabilidad_maquila = (float) 0.04;    //por defecto es del 4%
        subencionado = false;
        declara = false;
        precio_oliva = (float) 0.26;            //por defecto es 0.26 €
        observaciones = "";
        total_real_pagar = (float)0.0;
    }

    /********************Getters***************************/
    public Date getFecha() {
        return fecha;
    }

    public float getKg_oliva() {
        return kg_oliva;
    }

    public float getRendimiento() {
        return rendimiento;
    }

    public float getRentabilidad_maquila() {
        return rentabilidad_maquila;
    }
    
    public float getPrecio_oliva() {
        return precio_oliva;
    }

    public String getObservacones() {
        return observacones;
    }

    public float getTotal_real_pagar() {
        return total_real_pagar;
    }
    
    
    /********************IS***************************/
    public boolean isPaga() {
        return paga;
    }

    public boolean isRetira() {
        return retira;
    }
    
    public boolean isSubencionado() {
        return subencionado;
    }

    public boolean isDeclara() {
        return declara;
    }
    
    /********************Setters***************************/

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setKg_oliva(float kg_oliva) {
        this.kg_oliva = kg_oliva;
    }

    public void setPaga(boolean paga) {
        this.paga = paga;
    }

    public void setRetira(boolean retira) {
        this.retira = retira;
    }

    public void setRendimiento(float rendimiento) {
        this.rendimiento = rendimiento;
    }

    public void setRentabilidad_maquila(float rentabilidad_maquila) {
        this.rentabilidad_maquila = rentabilidad_maquila;
    }

    public void setSubencionado(boolean subencionado) {
        this.subencionado = subencionado;
    }

    public void setDeclara(boolean declara) {
        this.declara = declara;
    }

    public void setPrecio_oliva(float precio_oliva) {
        this.precio_oliva = precio_oliva;
    }

    public void setObservacones(String observacones) {
        this.observacones = observacones;
    }

    public void setTotal_real_pagar(float total_real_pagar) {
        this.total_real_pagar = total_real_pagar;
    }
  
    /********************Cálculos***************************/
    /**
     * Los litros estimados para realizar el cambio
     * @return litros para cambio
     */
    public float CalcularLitrosAceiteParaCambio(){
        return rendimiento * (float) (kg_oliva * RENTABILIDAD_CAMBIO);
    }
    
    /**
     * Calcula el valor ganado en maquila
     * @return devuelve la maquila que se quedan
     */
    public float CalcularMaquila(){
        return kg_oliva*rentabilidad_maquila;
    }
    
    /**
     * Calcula el aceite que puede retirar
     * @return devuelve lo que queda del aceite restando la maquila que se quedan
     */
    public float CalcularLitrosParaRetirar(){      
        return CalcularLitrosAceiteParaCambio() - CalcularMaquila();
    }
    /**
     * Calcula el valor ganado estimado en las compras
     * @return 
     */
    public float CalcularTotalCompras(){
        return kg_oliva * precio_oliva;
    }

    /**
     * Si se quedan un rendimiento de maquila superior a 0 no se cobra la multuración
     * @return precio de la multuración
     */
    public float CalcularPrecioMulturacion(){
        float precio;
        
        if(rentabilidad_maquila > 0)
            precio = 0;
        else
            precio = kg_oliva*RENDIMIENTO_MULTURACION_ECONOMICO;
        
        return precio;
    }
    
    /**
     * Calcula el aceite que retira el cliente, si se da el caso
     * @return aceite retirado
     */
    public float CalcularAceiteRealRetirado(){
        if(retira)
            return CalcularLitrosParaRetirar();
        else
            return 0;
    }
    
    /**
     * Calcula los kg molturados a reflejar
     * @return kg de oliva molturados a reflejar
     */
    public float CalcularKgMolturadosReflejar(){
        if(!declara)
            return 0;
        else
            return kg_oliva;
    }
    
    /**
     * Calcula kg de maquila a reflejar
     * @return kg de maquila a reflejar
     */
    public float CalcularMaquilaReflejar(){
        return CalcularKgMolturadosReflejar()*RENDIMIENTO_MAQUILA_KG;
    }
}
