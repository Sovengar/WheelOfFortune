package RuletaFortuna;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

/**
 * Clase que contiene la persona que quiere jugar. Almacenaremos su nombre, alias, password y fecha de nacimiento.
 * @author Jonathan Garcia Ruiz
 */
public class Jugador implements Serializable {

	Scanner entrada = new Scanner(System.in);
	
	// CONSTANTES
	private static final int CARACTERES_MINIMOS_PW = 6;
	
	// ATRIBUTOS
	private String nombre;
	private String alias;
	private String password;
	private Date fechaNacimiento;
	
	

	/**
	 * METODO CONSTRUCTOR CON 3 PARAMETROS QUE SON LOS ATRIBUTOS OBLIGATORIOS
	 * 
	 * @param alias
	 * @param password
	 * @param fecha
	 */
	public Jugador(String alias, String password, Date fecha){
		
		fechaNacimiento=fecha;
		this.alias=alias;
		this.password=password;


		while (comprobarPassword() == false) {

			System.out.println("Introduce una contraseña valida:");
			setPassword(entrada.nextLine());
		}

	}
	

	/**
	 * METODO QUE SE ENCARGA OBTENER LOS AÑOS QUE TIENES
	 * 
	 * @return TU EDAD
	 */
	public int getEdad() {
		return Fecha.calcularEdad(fechaNacimiento);
	}
	

	/**
	 * METODO QUE SE ENCARGA DE LA RESTRICCION DE LA CONTRASE�A
	 * @return TRUE OR FALSE
	 */
	public boolean comprobarPassword() {
		boolean resultado;
		int i=CARACTERES_MINIMOS_PW;
		if(i>password.length()) resultado=false;
		else resultado=true;
		return resultado;
	}
	


	///////////////////////////////////////////////////////////// METODOS GETTERS DE LOS ATRIBUTOS
	
	
	
	/**
	 * GETTER. NOMBRE DEL USUARIO
	 * @return NOMBRE
	 */
	public String getNombre() {
		return nombre;}
	
	/**
	 * GETTER. ALIAS DEL USUARIO
	 * @return ALIAS
	 */
	public String getAlias() {
		return alias;}
	
	/**
	 * GETTER. FECHA DE NACIMIENTO DEL USUARIO
	 * 
	 * @return FECHA DE NACIMIENTO
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;}
	
	/**
	 * GETTER. PARSEA DE UNA FECHA A STRING
	 * 
	 * @return STRING CON TU FECHA
	 */
	public String getFechaNacimientoString() {
		return Fecha.formatearFechaaString(getFechaNacimiento());
	}
	
	/**
	 * GETTER ESTATICO. ME DEVUELVE EL MINIMO DE CARACTERES PARA LA CONTRASEÑA
	 * 
	 * @return CONSTANTE ENTERA
	 */
	public static int getCaracteresMinimosPw() {
		return CARACTERES_MINIMOS_PW;
	}

	////////////////////////////////////////////////// METODOS SETTERS DE LOS ATRIBUTOS
	
	/**
	 * SETTER. ASIGNAMOS LA CONTRASE�A
	 */
	public void setPassword(String password) {
		this.password = password;}
	
	/**
	 * SETTER. ASIGNAMOS EL NOMBRE
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;}

	/**
	 * SETTER. ASIGNAMOS EL ALIAS
	 */
	public void setAlias(String alias) {
		this.alias = alias;}

	/**
	 * SETTER. ASIGNAMOS LA FECHA DE NACIMIENTO
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;}
	
	
}
