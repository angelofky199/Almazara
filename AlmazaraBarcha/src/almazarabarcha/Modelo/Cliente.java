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
        
        cambios = new ArrayList<>();
        compras = new ArrayList<>();
        molturaciones = new ArrayList<>();
        ventas = new ArrayList<>();
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
    
    /**
     * Devuelve las ventas no facturadas como ventas activas
     * @return ventas activas
     */
    public ArrayList<Venta> getVentasActivas(){
        int i;
        ArrayList<Venta> ventas_activas = new ArrayList<>();
                
        for(i = 0; i < ventas.size(); i++)
            if(!ventas.get(i).isFactura_realizada()) //Selecciona las ventas no facturadas
                ventas_activas.add(ventas.get(i));
            
        return ventas_activas;
    }
    
    /**
     * Devuelve las molturaciones no facturadas como molturaciones activas
     * @return molturaciones activas
     */
    public ArrayList<Molturacion> getMolturacionesActivas(){
        int i;
        ArrayList<Molturacion> molturaciones_activas = new ArrayList<>();
                
        for(i = 0; i < molturaciones.size(); i++)
            if(!molturaciones.get(i).isFactura()) //Selecciona las molturaciones no facturadas
                molturaciones_activas.add(molturaciones.get(i));
            
        return molturaciones_activas;
    }
    
    /**
     * Devuelve las compras no facturadas como compras activas
     * @return molturaciones activas
     */
    public ArrayList<Compra> getComprasActivas(){
        int i;
        ArrayList<Compra> compras_activas = new ArrayList<>();
                
        for(i = 0; i < compras.size(); i++)
            if(!compras.get(i).isFactura()) //Selecciona las compras no facturadas
                compras_activas.add(compras.get(i));
            
        return compras_activas;
    }
    
    /**
     * Devuelve los cambios no facturados como cambios activos
     * @return molturaciones activas
     */
    public ArrayList<Cambio> getCambiosActivos(){
        int i;
        ArrayList<Cambio> cambios_activos = new ArrayList<>();
                
        for(i = 0; i < cambios.size(); i++)
            if(!cambios.get(i).isFactura()) //Selecciona los cambios no facturados
                cambios_activos.add(cambios.get(i));
            
        return cambios_activos;
    }
    
    

/************************Setters************************/

    /**
     * Setters
     * @param nombre_cliente
     */
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
     * Busca un cambio por id
     * @param id
     * @return Devuelve un resultado mayor que -1 si exite el cambio
     */
    public int buscarCambio(int id){
         int i;
        int pos = -1;
        
        for(i = 0; i < cambios.size() && pos == -1; i++)
            if (id == cambios.get(i).getId());
                pos = i;

        return pos;
    }
    
    /**
     * Busca una compra por id
     * @param id
     * @return Devuelve un resultado mayor que -1 si existe la compra
     */
    public int buscarCompra(int id){
         int i;
        int pos = -1;
        
        for(i = 0; i < compras.size() && pos == -1; i++)
            if (id == compras.get(i).getId());
                pos = i;

        return pos;
    }
    
    /**
     * Busca una venta por id
     * @param id
     * @return Devuelve un resultado mayor que -1 si existe la venta
     */
    public int buscarVenta(int id){
         int i;
        int pos = -1;
        
        for(i = 0; i < ventas.size() && pos == -1; i++)
            if (id == ventas.get(i).getId());
                pos = i;

        return pos;
    }
    
    /**
     * Busca una molturación por id
     * @param id
     * @return Devuelve un resultado mayor que -1 si existe la venta
     */
    public int buscarMolturacion(int id){
         int i;
        int pos = -1;
        
        for(i = 0; i < molturaciones.size() && pos == -1; i++)
            if (id == molturaciones.get(i).getId());
                pos = i;

        return pos;
    }
    
    
    
    
/*****************Modifiers***********************/
    public boolean modifyCambio(Cambio cambio){
        boolean ok = false;
        int i;
        
        for(i = 0; i < cambios.get(i).getId() && !ok; i++)
            if(cambio.getId() == cambios.get(i).getId())
                if(!cambios.get(i).isFactura()){
                    cambios.set(i, cambio);
                    ok = true;
                }
        
        return ok;
    }
    
    public boolean modifyCompra(Compra compra){
        boolean ok = false;
        int i;
        
        
        
        for(i = 0; i < compras.get(i).getId() && !ok; i++)
            if(compra.getId() == compras.get(i).getId())
                if(!compras.get(i).isFactura()){
                    compras.set(i, compra);
                    ok = true;
                }
                
        return ok;
    }
    
    public boolean modifyMolturacion(Molturacion molturacion){
        boolean ok = false;
        int i;
        
        for(i = 0; i < molturaciones.get(i).getId() && !ok; i++)
            if(molturacion.getId() == molturaciones.get(i).getId())
                if(!molturaciones.get(i).isFactura()){
                    molturaciones.set(i, molturacion);
                    ok = true;
                }
            
        return ok;
    }
    
    public boolean modifyVenta(Venta venta){
        boolean ok = false;     
        int i;
        
        for(i = 0; i < ventas.get(i).getId() && !ok; i++)
            if(venta.getId() == ventas.get(i).getId())
                if(!ventas.get(i).isFactura_realizada()){
                    ventas.set(i, venta);
                    ok = true;
                }
        
        return ok;
    }
    
/*******************************Removers****************************/
    public boolean deleteCambio(int id){
        boolean ok = false;
        int i;
        int pos;
        
        pos = buscarCambio(id);
        
        if(pos > -1){
            cambios.remove(pos);
            ok = true;
        }
            
        return ok;
    }
    
    public boolean deleteCompra(int id){
        boolean ok = false;
        int i;
        int pos;
        
        pos = buscarCompra(id);
        
        if(pos > -1){
            compras.remove(pos);
            ok = true;
        }
            
        return ok;
    }
    
    public boolean deleteMolturacion(int id){
        boolean ok = false;
        int i;
        int pos;
        
        pos = buscarMolturacion(id);
        
        if(pos > -1){
            molturaciones.remove(pos);
            ok = true;
        }
            
        return ok;
    }
    
    public boolean deleteVenta(int id){
        boolean ok = false;
        int i;
        int pos;
        
        pos = buscarVenta(id);
        
        if(pos > -1){
            ventas.remove(pos);
            ok = true;
        }
            
        return ok;
    }
    
    
}
