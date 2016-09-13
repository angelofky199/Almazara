package pojos;
// Generated 13-sep-2016 20:37:20 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Producto generated by hbm2java
 */
@Entity
@Table(name="producto"
    ,catalog="almazaradb"
)
public class Producto  implements java.io.Serializable {


     private int idProducto;
     private String nombre;
     private float cantidad;
     private Set ventaHasProductos = new HashSet(0);

    public Producto() {
    }

	
    public Producto(int idProducto, String nombre, float cantidad) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    public Producto(int idProducto, String nombre, float cantidad, Set ventaHasProductos) {
       this.idProducto = idProducto;
       this.nombre = nombre;
       this.cantidad = cantidad;
       this.ventaHasProductos = ventaHasProductos;
    }
   
     @Id 

    
    @Column(name="idProducto", unique=true, nullable=false)
    public int getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    
    @Column(name="nombre", nullable=false, length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="cantidad", nullable=false, precision=12, scale=0)
    public float getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="producto")
    public Set getVentaHasProductos() {
        return this.ventaHasProductos;
    }
    
    public void setVentaHasProductos(Set ventaHasProductos) {
        this.ventaHasProductos = ventaHasProductos;
    }




}


