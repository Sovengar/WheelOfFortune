package RuletaFortuna;

/**
 * Clase estatica con atributos estaticos los cuales almacenan estas variables
 * con un valor determinado solo alterables desde esta clase Estos valores son
 * comunes para todas las clases que la usen Tiene 2 metodos que validan si el
 * caracter que introducimos es una vocal o consonante
 * 
 * @author Jonathan Garcia Ruiz
 */
public class Caracter {

	// ATRIBUTOS ESTATICOS
	private static final String VOCALES = "AEIOU";
	private static final String CONSONANTES = "BCDFGHJKLMNÑPQRSTVWXYZ";

	/**
	 * METODO QUE VERIFICA SI EL CARACTER INTRODUCIDO ES UNA VOCAL O NO
	 * 
	 * @param caracter
	 * @return true or false
	 */
	public static boolean esVocal(String caracter) {
		return VOCALES.contains(caracter);
	}

	/**
	 * METODO QUE VERIFICA SI EL CARACTER INTRODUCIDO ES UNA CONSONANTE O NO
	 * 
	 * @param caracter
	 * @return true or false
	 */
	public static boolean esConsonante(String caracter) {
		return CONSONANTES.contains(caracter);
	}

	////////////////////////////////////////////// METODOS GETTERS DE LOS ATRIBUTOS
	////////////////////////////////////////////// ESTATICOS

	/**
	 * METODO GETTER QUE ME DEVUELVE LAS VOCALES
	 * 
	 * @return LAS VOCALES DEL ABECEDARIO
	 */
	public static String getVocales() {
		return VOCALES;
	}

	/**
	 * METODO GETTER QUE ME DEVUELVE LAS CONSONANTES
	 * 
	 * @return LAS CONSONANTES DEL ABECEDARIO
	 */
	public static String getConsonantes() {
		return CONSONANTES;
	}

	/**
	 * Obtiene una vocal aleatoria
	 * 
	 * @return vocal elegida
	 */
	public static String getVocalAleatoria() {
		int i = (int) (Math.random() * 5);
		return VOCALES.toUpperCase().substring(i, i + 1);
	}

	/**
	 * Obtiene una consonante aleatoria
	 * 
	 * @return consonante elegida
	 */
	public static String getConsonanteAleatoria() {
		int i = (int) (Math.random() * 22);
		return CONSONANTES.toUpperCase().substring(i, i + 1);
	}

}

