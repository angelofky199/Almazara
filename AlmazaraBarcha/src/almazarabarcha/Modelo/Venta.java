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
    
    
    boolean regalar_envase;
    float litros_aceite;
    
    private static final String[] TIPOS_ACEITE = {"Lampante","Extra","Arberquina", "Bote Flor", "Bote Extra"};
    private static final String[] TIPOS_ENVASE = {"5L","10L","25L"};
    
    
}
