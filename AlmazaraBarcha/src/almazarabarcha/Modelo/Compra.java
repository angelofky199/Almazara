package almazarabarcha.Modelo;

import java.util.Date;

public class Compra {
    private int id;
    private float kg_oliva;
    private float precio_kg_oliva;
    private String observaciones;
    private Date fecha_compra;
    private boolean pagado;
    private boolean subencionado;
    private boolean declara;
    private boolean factura;
    private static int cont_id;

    public Compra(){
        int id = 0;
        this.kg_oliva = 0;
        this.precio_kg_oliva = (float) 0.25;    //0.25€/kg por defecto
        this.observaciones = "";
        //this.fecha_compra = new Date();
        this.pagado = false;
        this.subencionado = false;
        this.declara = false;
        this.factura = false;
    }

    /*******************Getters**************************/
    
    public float getKg_oliva() {
        return kg_oliva;
    }

    public float getPrecio_kg_oliva() {
        return precio_kg_oliva;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public String getObservaciones() {
        return observaciones;
    }
    
    public int getId() {
        return id;
    }
    
    

    /*******************Is**************************/
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
    /*******************Setters**************************/
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public void setSubecionado(boolean subecionado) {
        this.subencionado = subecionado;
    }

    public void setDeclara(boolean declara) {
        this.declara = declara;
    }

    public void setFactura(boolean factura) {
        this.factura = factura;
    }
    
    public void setKg_oliva(float kg_oliva) {
        this.kg_oliva = kg_oliva;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public void setPrecio_kg_oliva(float precio_kg_oliva) {
        this.precio_kg_oliva = precio_kg_oliva;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    /*******************Cálculos**************************/
    
    /**
    * Calcula la maquila a reflejar de una compra
    *   Si se ha realziado factura se refleja un 15% de maquila(kg oliva * 0.15)
    *   Si no se factura y sí se declara se refleja 0% de maquila(kg oliva * 0.04)
    *   Si no se realiza y tampoco declara se refleja un 4% de maquila
     * @return devuelve la maquila reflejada
    */
    public float CalcularMaquilaReflejar(){
        float maquila_reflejada;
        
        if(factura)
        {
            maquila_reflejada = (float) (kg_oliva * 0.15);
        }
        else if(declara)
        {
            maquila_reflejada = (float) (kg_oliva * 0.04);
        }
        else
            maquila_reflejada = 0;
        
        return maquila_reflejada;
    }
    
    /**
     * Calcula el valor ganado en las compras
     * @return devuelve el valor ganado en la compra en €
     */
    public float TotalCompras(){
        return kg_oliva * precio_kg_oliva;
    }
    
    public void increaseId() {
        cont_id++;
        id = cont_id;
    }
    
}

