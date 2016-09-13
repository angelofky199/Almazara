package pojos;
// Generated 13-sep-2016 20:37:20 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Compra generated by hbm2java
 */
@Entity
@Table(name="compra"
    ,catalog="almazaradb"
)
public class Compra  implements java.io.Serializable {


     private int idCompra;
     private Cliente cliente;
     private Usuario usuario;
     private float kgOliva;
     private float precioKg;
     private float totalCompra;
     private boolean pagado;
     private boolean declara;
     private boolean factura;
     private float maquilaReflejada;
     private String observaciones;

    public Compra() {
    }

	
    public Compra(int idCompra, Cliente cliente, Usuario usuario, float kgOliva, float precioKg, float totalCompra, boolean pagado, boolean declara, boolean factura, float maquilaReflejada) {
        this.idCompra = idCompra;
        this.cliente = cliente;
        this.usuario = usuario;
        this.kgOliva = kgOliva;
        this.precioKg = precioKg;
        this.totalCompra = totalCompra;
        this.pagado = pagado;
        this.declara = declara;
        this.factura = factura;
        this.maquilaReflejada = maquilaReflejada;
    }
    public Compra(int idCompra, Cliente cliente, Usuario usuario, float kgOliva, float precioKg, float totalCompra, boolean pagado, boolean declara, boolean factura, float maquilaReflejada, String observaciones) {
       this.idCompra = idCompra;
       this.cliente = cliente;
       this.usuario = usuario;
       this.kgOliva = kgOliva;
       this.precioKg = precioKg;
       this.totalCompra = totalCompra;
       this.pagado = pagado;
       this.declara = declara;
       this.factura = factura;
       this.maquilaReflejada = maquilaReflejada;
       this.observaciones = observaciones;
    }
   
     @Id 

    
    @Column(name="idCompra", unique=true, nullable=false)
    public int getIdCompra() {
        return this.idCompra;
    }
    
    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Cliente_idCliente", nullable=false)
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Usuario_idUsuario", nullable=false)
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    @Column(name="kgOliva", nullable=false, precision=12, scale=0)
    public float getKgOliva() {
        return this.kgOliva;
    }
    
    public void setKgOliva(float kgOliva) {
        this.kgOliva = kgOliva;
    }

    
    @Column(name="precioKg", nullable=false, precision=12, scale=0)
    public float getPrecioKg() {
        return this.precioKg;
    }
    
    public void setPrecioKg(float precioKg) {
        this.precioKg = precioKg;
    }

    
    @Column(name="totalCompra", nullable=false, precision=12, scale=0)
    public float getTotalCompra() {
        return this.totalCompra;
    }
    
    public void setTotalCompra(float totalCompra) {
        this.totalCompra = totalCompra;
    }

    
    @Column(name="pagado", nullable=false)
    public boolean isPagado() {
        return this.pagado;
    }
    
    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    
    @Column(name="declara", nullable=false)
    public boolean isDeclara() {
        return this.declara;
    }
    
    public void setDeclara(boolean declara) {
        this.declara = declara;
    }

    
    @Column(name="factura", nullable=false)
    public boolean isFactura() {
        return this.factura;
    }
    
    public void setFactura(boolean factura) {
        this.factura = factura;
    }

    
    @Column(name="maquilaReflejada", nullable=false, precision=12, scale=0)
    public float getMaquilaReflejada() {
        return this.maquilaReflejada;
    }
    
    public void setMaquilaReflejada(float maquilaReflejada) {
        this.maquilaReflejada = maquilaReflejada;
    }

    
    @Column(name="observaciones", length=100)
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }




}


