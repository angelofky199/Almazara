package almazarabarcha.Modelo;

import java.util.Date;

public class Molturacion {
    public static float RENDIMIENTO_ORUJO_KG = (float)0.3;
    public static float RENDIMIENTO_MAQUILA_KG = (float)0.04;
    public static float RENDIMIENTO_MULTURACION_ECONOMICO = (float)0.15; //€
    int id;
    private float kg_oliva;
    private float aceite_producido;
    private Date fecha_moturacion;
    private String observacones;
    private boolean pagado;
    private boolean subencionado;
    private boolean declara;
    private boolean factura;
    private static int cont_id;
    
    public Molturacion() {
        id = 0;
        this.kg_oliva = 0;
        this.aceite_producido = 0;
        //this.fecha_moturacion = new Date();
        this.observacones = "";
        this.pagado = false;
        this.subencionado = false;
        this.declara = false;
        this.factura = false;
    }

   
    
/************************Getters************************************/
    public float getKg_oliva() {
        return kg_oliva;
    }

    public float getAceite_producido() {
        return aceite_producido;
    }

    public Date getFecha_moturacion() {
        return fecha_moturacion;
    }

    public String getObservacones() {
        return observacones;
    }
    
    public int getId() {
        return id;
    }

 /************************IS************************************/
    
    public boolean isPagado() {
        return pagado;
    }

    public boolean isSubencionado() {
        return subencionado;
    }

    public boolean isDeclara() {
        return declara;
    }

    public boolean isFactura() {
        return factura;
    }
/***********************Setters*******************************/
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setFecha_moturacion(Date fecha_moturacion) {
        this.fecha_moturacion = fecha_moturacion;
    }

    public void setKg_oliva(float kg_oliva) {
        this.kg_oliva = kg_oliva;
    }

    public void setAceite_producido(float aceite_producido) {
        this.aceite_producido = aceite_producido;
    }

    public void setObservacones(String observacones) {
        this.observacones = observacones;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public void setSubecionado(boolean subencionado) {
        this.subencionado = subencionado;
    }

    public void setDeclara(boolean declara) {
        this.declara = declara;
    }

    public void setFactura(boolean factura) {
        this.factura = factura;
    }
/*********************Cálculos******************************/
    /**
     * Calcula el orujo obtenido
     * @return devuelve el orujo obtenido en kg
     */
    public float CalcularOrujo() {     
        return this.kg_oliva * RENDIMIENTO_ORUJO_KG;
    }

    /**
     * Calcula el rendimiento del aceite producido respecto a los kg oliva ingresados
     * @return devuelve porcentaje del rendimiento
     */
    public float CalcularRendimientoAceite() {
        float rendimiento = 0;
        
        if(this.kg_oliva > 0)
            rendimiento = this.aceite_producido / this.kg_oliva;
        
        return rendimiento;
    }
    
    /**
     * Calcula el precio económico en € de la multuración
     * @return devuelve el dinero en € que cuesta la multuración 
     */
    public float CalcularPrecioMulturacion(){
        return this.kg_oliva * RENDIMIENTO_MULTURACION_ECONOMICO;
    }
    
    /**    Puede ser sustituida, y comprobar desde fuera si se ha pagado
     * Calcula el dinero recibido de la multuración
     * @return devuelve lo que se ha ingresado
     */
    public float CalcularIngresoObtenidoMulturacion(){
        if(pagado)
            return CalcularPrecioMulturacion();
        else
            return 0;
    }
    
    /**
     * Calcula una estimación de la maquila obtenida
     * @return maquila a reflejar expresada en kg
     */
    public float CalcularMaquila() {
        return this.kg_oliva * RENDIMIENTO_MAQUILA_KG; 
    }
    
    /**
     * Calcula los Kg de Oliva que se reflejan en la declaración, depende
     * si declaran o no
     * @return kg_oliva reflejados
     */
    public float CalcularKgOlivaReflejados(){
        if(declara)
            return kg_oliva;
        else
            return 0;
    }
    
    public void increaseId() {
        cont_id++;
        id = cont_id;
    }
    
    
}
