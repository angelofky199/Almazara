package almazarabarcha.Modelo;

import java.util.Date;

public class Molturacion {
    
    private float kg_oliva;
    private float aceite_producido;
    private float orujo;
    private float rendimiento;
    private float ingreso_molturacion;
    private float maquila;
    private float tanto_maquila;
    private Date fecha_moturacion;
    private String observacones;
    private boolean pagado;
    private boolean subecionado;
    private boolean declara;
    private boolean factura;
    
    
    public Molturacion() {
    }

    public float getKg_oliva() {
        return kg_oliva;
    }

    public float getAceite_producido() {
        return aceite_producido;
    }

    public Date getFecha_moturacion() {
        return fecha_moturacion;
    }

    public float getOrujo() {
        return orujo;
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
    
    public void setFecha_moturacion(Date fecha_moturacion) {
        this.fecha_moturacion = fecha_moturacion;
    }
    
    public void setTantoMaquila(float tanto_maquila){
        this.tanto_maquila = tanto_maquila;
    }

    public void setKg_oliva(float kg_oliva) {
        this.kg_oliva = kg_oliva;
    }

    public void setAceite_producido(float aceite_producido) {
        this.aceite_producido = aceite_producido;
    }

    public void CalcularOrujo() {
        orujo = this.kg_oliva * (float)0.3;
    }

    public void CalcularRendimiento() {
        if(this.kg_oliva > 0)
        {
            rendimiento = this.aceite_producido / this.kg_oliva;
        }
        
    }
    
     public void CalcularMaquila() {
        maquila = this.kg_oliva * (float)tanto_maquila; //La maquila es el 4% del los kg molturados
     }
     
    public void setIngreso_molturacion(float ingreso_molturacion) {
        this.ingreso_molturacion = ingreso_molturacion;
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
    
    
}
