package almazarabarcha.Modelo;

import java.util.Date;

public class Cliente {
    
    
    private String nombre_cliente;  //*
    private String dni;
    private String direccion;
    private String poblacion;
    private String telefono;
    private Date fecha;
    

    public Cliente(String nombre_cliente, String dni, String direccion, String poblacion, String telefono, Date fecha) {
        this.nombre_cliente = nombre_cliente;
        this.dni = dni;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.telefono = telefono;
        this.fecha = fecha;
    }
    
    public Cliente() {
        this.nombre_cliente = "";
        this.dni = "";
        this.direccion = "";
        this.poblacion = "";
        this.telefono = "";
        //this.fecha = fecha;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
 
}
