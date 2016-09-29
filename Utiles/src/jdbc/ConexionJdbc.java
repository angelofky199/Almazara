package jdbc;

import java.sql.Connection;




public class ConexionJdbc {

	private static Connection con; 
	private String driver; 
	private String url; 
	private String usr; 
	private String pwd; 
	private String ficheroConfiguracion; 
	/**
	 * Constructor: Crea el objeto conocido el driver,url,usr y pwd, que se almacenan
	 * en atributos privados 
	 */
	public ConexionJdbc (String driver, String url, String usr, String pwd){ 
	this.driver= driver; 
	this.url= url; 
	this.usr= usr; 
	this.pwd= pwd; 
	 } 
	/**
	 * Constructor: Crea el objeto conocido el nombre del fichero de configuración y lo almacena
	 * en un atributo privado.
	 */
	public ConexionJdbc (String ficheroPropiedades){ 
	this.ficheroConfiguracion= ficheroPropiedades; 
	 } 
	/**
	 * Conecta con la base de datos.
	 * Si el atributo ficheroConfiguracion tiene valor (no nulo), lo utilizará para conectar.
	 * En caso de que ficheroConfiguracion sea nulo, conecta utilizando driver,url, usry pwd.
	 * Una vez establecida la conexión, ésta se almacena en el atributo con
	 * Para conectar hará uso de los métodos de UtilesJdbc implementados anteriormente
	 */
	public void conectar() { 
		if(ficheroConfiguracion != null){
			con = UtilesJdbc.conectar(this.ficheroConfiguracion);
		}else{
			con = UtilesJdbc.conectar(this.driver, this.url, this.usr, this.pwd);
		}
	 } 
	/**
	 * Cierra la conexión almacenada en el atributo con
	 * Para desconectar hará uso de los métodos de UtilesJdbc implementadosa nteriormente
	 */
	public void desconectar(){ 
		UtilesJdbc.cerrar(con);
	  //Completar 
	 } 
	/**
	 * Método consultor. Devuelve el atributo con
	 */
	public static Connection getConnection(){ 
		return con;
	  //Completar 
	 } 
}
