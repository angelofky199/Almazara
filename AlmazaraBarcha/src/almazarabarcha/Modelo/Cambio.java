/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almazarabarcha.Modelo;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Cambio {
    
    private float kg_oliva;
    private float aceite_cambio;
    private float aceite_retirar;
    private float rendimiento;
    private float ingreso_molturacion;
    private float maquila;
    private float tanto_maquila;
    private Date fecha;
    private String observacones;
    private boolean pagado;
    private boolean subecionado;
    private boolean declara;
    private boolean factura;

    public Cambio() {
    }

    public float getKg_oliva() {
        return kg_oliva;
    }

    public float getAceite_cambio() {
        return aceite_cambio;
    }

    public float getAceite_retirar() {
        return aceite_retirar;
    }

    public float getRendimiento() {
        return rendimiento;
    }

    public float getIngreso_molturacion() {
        return ingreso_molturacion;
    }

    public float getMaquila() {
        return maquila;
    }

    public float getTanto_maquila() {
        return tanto_maquila;
    }

    public Date getFecha() {
        return fecha;
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

    public void setAceite_cambio(float aceite_cambio) {
        this.aceite_cambio = aceite_cambio;
    }

    public void setAceite_retirar(float aceite_retirar) {
        this.aceite_retirar = aceite_retirar;
    }

    public void setRendimiento(float rendimiento) {
        this.rendimiento = rendimiento;
    }

    public void setIngreso_molturacion(float ingreso_molturacion) {
        this.ingreso_molturacion = ingreso_molturacion;
    }

    public void setMaquila(float maquila) {
        this.maquila = maquila;
    }

    public void setTanto_maquila(float tanto_maquila) {
        this.tanto_maquila = tanto_maquila;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
      
    public float getLitrosParaCambio(){
        aceite_cambio = kg_oliva / 100;
        return aceite_cambio;
    }
    
    public float getLitrosParaRetirar(){
        if(maquila > 0)
        {
            aceite_retirar = aceite_cambio - (maquila * kg_oliva);
        }
        else
            ingreso_molturacion = (float) (kg_oliva * 0.15); //El 0.15 es la cte de la maquila
        
        return aceite_retirar;
        
    }
    
}
