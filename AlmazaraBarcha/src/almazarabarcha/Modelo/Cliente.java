package almazarabarcha.Modelo;

import java.util.ArrayList;

public class Cliente {
    private String nombre_cliente;  //*
    private String dni;
    private String direccion;
    private String poblacion;
    private String telefono;
    private int repeticiones;
    
    private ArrayList<Cambio> cambios;
    private ArrayList<Compra> compras;
    private ArrayList<Molturacion> molturaciones;
    private ArrayList<Venta> ventas;
    
    

    public Cliente(String nombre_cliente, String dni, String direccion, String poblacion, String telefono) {
        this.nombre_cliente = nombre_cliente;
        this.dni = dni;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.telefono = telefono;
        
        cambios = new ArrayList<>();
        compras = new ArrayList<>();
        molturaciones = new ArrayList<>();
        ventas = new ArrayList<>();
        
    }
    
    public Cliente() {
        this.nombre_cliente = "";
        this.dni = "";
        this.direccion = "";
        this.poblacion = "";
        this.telefono = "";
        //this.fecha = fecha;
    }
/************************Getters************************/
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

    public ArrayList<Cambio> getCambios() {
        return cambios;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public ArrayList<Molturacion> getMolturaciones() {
        return molturaciones;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }
    
    

/************************Setters************************/
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

    /***************Adders**************************/
    
    public void addCambio(Cambio cambio){
        cambios.add(cambio);
    }
    public void addCompra(Compra compra){
        compras.add(compra);
    }
    
    public void addMolturacion(Molturacion molt){//(float kg_oliva, float aceite_producido, String observaciones, boolean pagado, boolean subencionado, boolean declara, boolean factura){
        
        molturaciones.add(molt);
        /*Molturacion molt = new Molturacion();
        
        molt.setKg_oliva(kg_oliva);
        molt.setAceite_producido(aceite_producido);
        molt.setObservaciones(observaciones);
        molt.setPagado(pagado);
        molt.setSubencionado(subencionado);
        molt.setDeclara(declara);
        molt.setFactura(factura);*/
        
        
    }
    
    public void addVenta(Venta venta){
        ventas.add(venta);
    }
    
    /******************Sizers**********************/
    public int sizeCambios(){
        return cambios.size();
    }
    
    public int sizeCompras(){
        return compras.size();
    }
    
    public int sizeMolturaciones(){
        return molturaciones.size();
    }
    
    public int sizeVentas(){
        return ventas.size();
    }
    
    /*****************Buscadores*********************/
    /**
     * Busca una venta por id
     * @param id
     * @return Devuelve un resultado mayor que -1 si exista la venta
     */
    public int buscarVenta(int id){
         int i;
        int pos = -1;
        
        for(i = 0; i < ventas.size() && pos == -1; i++)
            if (id == ventas.get(i).getId());
                pos = i;

        return pos;
    }
    /*****************Modifiers***********************/

}
