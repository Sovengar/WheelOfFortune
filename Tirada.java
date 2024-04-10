package RuletaFortuna;

/**
 * Clase "estatica" que contiene un atributo estatico el cual vale lo mismo para
 * todas las clases. Sin embargo los valores almacenados solo pueden ser
 * alterados desde aqui. Tiene un metodo llamado getTirada que es tambien
 * estatico y sirve para generar la tirada aleatoria para cada objeto que
 * creemos
 * 
 * @author Jonathan Garcia Ruiz
 */
public class Tirada {

	
	//ATRIBUTO ESTATICO
	private static int [] tirada={0,10,20,30,40};
	
	
	/**
	 * Metodo que devuelve una puntuacion generada aleatoriamente
	 * @return tirada
	 */
	public static int getTirada() {
		int i = (int) (Math.random()*tirada.length);
		return tirada[i];
	}

}
