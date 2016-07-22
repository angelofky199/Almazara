/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almazarabarcha.Modelo;

import java.util.Date;

/**
 *
 * @author jose
 */
public class Venta {
    private Date fecha;             //*
    private String nombre_cliente;  //*
    private String dni;
    private String direccion;
    private String poblacion;
    private String telefono;
    
    private static final String[] TIPOS_ACEITES = {"Lampante","Extra","Arberquina", "Bote Flor", "Bote Extra"};
    private static final String[] TIPOS_ENVASES = {"5L","10L","25L"};
    private static final float[] PRECIO_ACEITES = {(float)1.25,(float)5.0,(float)6.0,(float)7.0,(float)5.0};
    private static final float[] PRECIO_ENVASES = {1, 2, 3};

    
    private boolean regalar_envases;
    private float litros_aceite;
    private int[] num_envases = {0,0,0};
    
    private float precio_total;
    
    /**
     * 
     * @param tipo 
     */
    public void venderEnvase(int tipo, int cantidad){
        num_envases[tipo] += cantidad;
        
        if(!regalar_envases)
    }
    
}
