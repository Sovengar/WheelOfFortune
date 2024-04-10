package RuletaFortuna;

public class MiExcepcion extends RuntimeException {

	/**
	 * CONSTRUCTOR POR DEFECTO
	 */
	public MiExcepcion() {

	}

	/**
	 * CONSTRUCTOR CON UN PARAMETRO
	 * 
	 * @param MENSAJE
	 *            DE ERROR
	 */
	public MiExcepcion(String msj_error) {

		super(msj_error);

	}

}
