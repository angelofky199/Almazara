package pojos;
// Generated 15-sep-2016 21:42:28 by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * VentaHasProducto generated by hbm2java
 */
@Entity
@Table(name="venta_has_producto"
    ,catalog="almazaradb"
)
public class VentaHasProducto  implements java.io.Serializable {


     private VentaHasProductoId id;
     private Producto producto;
     private Venta venta;
     private int cantidad;
     private float precio;
     private float precioTotal;

    public VentaHasProducto() {
    }

    public VentaHasProducto(VentaHasProductoId id, Producto producto, Venta venta, int cantidad, float precio, float precioTotal) {
       this.id = id;
       this.producto = producto;
       this.venta = venta;
       this.cantidad = cantidad;
       this.precio = precio;
       this.precioTotal = precioTotal;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="ventaIdVenta", column=@Column(name="Venta_idVenta", nullable=false) ), 
        @AttributeOverride(name="productoIdProducto", column=@Column(name="Producto_idProducto", nullable=false) ) } )
    public VentaHasProductoId getId() {
        return this.id;
    }
    
    public void setId(VentaHasProductoId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Producto_idProducto", nullable=false, insertable=false, updatable=false)
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Venta_idVenta", nullable=false, insertable=false, updatable=false)
    public Venta getVenta() {
        return this.venta;
    }
    
    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    
    @Column(name="cantidad", nullable=false)
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    @Column(name="precio", nullable=false, precision=12, scale=0)
    public float getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    
    @Column(name="precioTotal", nullable=false, precision=12, scale=0)
    public float getPrecioTotal() {
        return this.precioTotal;
    }
    
    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }




}


