/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almazarabarcha.Modelo;

/**
 *
 * @author Usuario
 */
public class Compra {
        
    private float kg_oliva;
    private float precio_kg_oliva;
    private float maquila_reflejada; 
    private float total_compras;
    //Si el cliente factura se refleja un 15% de maquila (kg oliva * 015)
    //Si el cliente no declara de refleja un 4% de maquila (kg oliva * 0.04)
    private String observacones;
    private boolean pagado;
    private boolean subecionado;
    private boolean declara;
    private boolean factura;

    public Compra() {
    }

    public float getKg_oliva() {
        return kg_oliva;
    }

    public float getPrecio_kg_oliva() {
        return precio_kg_oliva;
    }

    public float getMaquila_reflejada() {
        return maquila_reflejada;
    }

    public float getTotal_compras() {
        return total_compras;
    }

    public String getObservacones() {
        return observacones;
    }

    public boolean isPagado() {
        return pagado;
    }

    public boolean isSubecionado() {
        return subecionado;
    }

    public boolean isDeclara() {
        return declara;
    }

    public boolean isFactura() {
        return factura;
    }

    public void setKg_oliva(float kg_oliva) {
        this.kg_oliva = kg_oliva;
    }

    public void setPrecio_kg_oliva(float precio_kg_oliva) {
        this.precio_kg_oliva = precio_kg_oliva;
    }

    public void setMaquila_reflejada(float maquila_reflejada) {
        this.maquila_reflejada = maquila_reflejada;
    }

    public void setTotal_compras(float total_compras) {
        this.total_compras = total_compras;
    }

    public void setObservacones(String observacones) {
        this.observacones = observacones;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public void setSubecionado(boolean subecionado) {
        this.subecionado = subecionado;
    }

    public void setDeclara(boolean declara) {
        this.declara = declara;
    }

    public void setFactura(boolean factura) {
        this.factura = factura;
    }
    
    public void CalcularMaquila(){
        
        if(factura)
        {
            maquila_reflejada = (float) (kg_oliva * 0.15);
        }
        else if(!declara)
        {
            maquila_reflejada = (float) (kg_oliva * 0.04);
        }
        else
            maquila_reflejada = 0;
            
    }
    
    public float TotalCompras(){
        total_compras = kg_oliva * precio_kg_oliva;
        return total_compras;
    }
    
}

