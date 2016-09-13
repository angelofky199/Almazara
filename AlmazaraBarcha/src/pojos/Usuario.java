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
 * Usuario generated by hbm2java
 */
@Entity
@Table(name="usuario"
    ,catalog="almazaradb"
)
public class Usuario  implements java.io.Serializable {


     private int idUsuario;
     private String nombre;
     private String usuario;
     private String contrasenya;
     private Set molturacions = new HashSet(0);
     private Set compras = new HashSet(0);
     private Set ventas = new HashSet(0);
     private Set cambios = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(int idUsuario, String nombre, String usuario, String contrasenya) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasenya = contrasenya;
    }
    public Usuario(int idUsuario, String nombre, String usuario, String contrasenya, Set molturacions, Set compras, Set ventas, Set cambios) {
       this.idUsuario = idUsuario;
       this.nombre = nombre;
       this.usuario = usuario;
       this.contrasenya = contrasenya;
       this.molturacions = molturacions;
       this.compras = compras;
       this.ventas = ventas;
       this.cambios = cambios;
    }
   
     @Id 

    
    @Column(name="idUsuario", unique=true, nullable=false)
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    
    @Column(name="nombre", nullable=false, length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="usuario", nullable=false, length=45)
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
    @Column(name="contrasenya", nullable=false, length=45)
    public String getContrasenya() {
        return this.contrasenya;
    }
    
    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="usuario")
    public Set getMolturacions() {
        return this.molturacions;
    }
    
    public void setMolturacions(Set molturacions) {
        this.molturacions = molturacions;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="usuario")
    public Set getCompras() {
        return this.compras;
    }
    
    public void setCompras(Set compras) {
        this.compras = compras;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="usuario")
    public Set getVentas() {
        return this.ventas;
    }
    
    public void setVentas(Set ventas) {
        this.ventas = ventas;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="usuario")
    public Set getCambios() {
        return this.cambios;
    }
    
    public void setCambios(Set cambios) {
        this.cambios = cambios;
    }




}


