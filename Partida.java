package RuletaFortuna;

import RuletaFortuna.JuegoRuleta.EnumDificultad;

/**
 * Clase que estara definida por los datos de la partida del jugador. En
 * concreto tendra el numero de partidas a jugar, jugador que esta jugando,
 * puntuacion acumulada de las partidas y el juego,
 * 
 * @author Jonathan Garcia Ruiz
 */
public class Partida {
	

	// CONSTANTES
	public static final int NUM_PARTIDAS_A_JUGAR=3;
	public static final int PUNTUACION_ACUMULADA_PARTIDAS=0;
	public static final int MULTIPLICADOR_A_EUROS=4;
	
	
	// ATRIBUTOS
	private int num_partidas_aJugar;
	private int puntuacion_Acumulada_Partidas;


	// DECLARACION DE OBJETOS (SIN INSTANCIAR)
	private Jugador jugador;
	private JuegoRuleta jr;
	
	
	
	
	/**
	 * CONSTRUCTOR QUE ASIGNA POR DEFECTO A UN JUGADOR Y UN NUMERO POR DEFECTO DE
	 * PARTIDAS A JUGAR
	 * 
	 * @param jugador
	 */
	public Partida(Jugador jugador1) {
		this(jugador1, NUM_PARTIDAS_A_JUGAR, EnumDificultad.NOVATO, false);
	}
	

	
	/**
	 * CONSTRUCTOR QUE ASIGNA UN JUGADOR Y UN NUMERO DETERMINADO DE PARTIDAS A JUGAR
	 * @param jugador
	 * @param num_partidas_aJugar
	 */
	public Partida(Jugador jugador1, int num_partidas_aJugar, EnumDificultad dificultad, boolean juegaSolo) {

		jugador = jugador1;

		jr = new JuegoRuleta(jugador);
		
		this.num_partidas_aJugar=num_partidas_aJugar;
		puntuacion_Acumulada_Partidas = PUNTUACION_ACUMULADA_PARTIDAS;

		jr.setDificultad(dificultad);
		
		jr.setJuegaSolo(juegaSolo);
		
	}

	
	
	/**
	 * METODO QUE VALIDA SI EL JUGADOR TIENE LA EDAD MINIMA REQUERIDA PARA JUGAR
	 * 
	 * @throws //
	 *             UN ERROR NO CONTROLADO
	 */
	public void validacionEdad() throws MiExcepcion {

		if (jr.comprobarEdad() == true) {
			num_partidas_aJugar = 0;

			throw new MiExcepcion("No cumples la edad minima" + "(" + JuegoRuleta.getEdadMinima() + " años" + ")");

		}

	}

	
	
	/**
	 * METODO PRINCIPAL QUE EJECUTARA EL JUEGO Y JUGARA X PARTIDAS RESETEANDO LA
	 * FRASE
	 */
	public void iniciar() {

		for (int i = 0; i < num_partidas_aJugar; i++) { //
			System.out.println("\n");
			System.out.println("----------------- Partida " + (i + 1) + ":");

			jr.asignarObjeto();
			jr.jugar();

			puntuacion_Acumulada_Partidas += jr.getPuntuacionTotal();
		}
		
		System.out.println("Has ganado " + jr.getContadorVictorias() + " partida/s de " + num_partidas_aJugar);
		System.out.println("Has terminado las partidas con una puntuacion de total de " + puntuacion_Acumulada_Partidas + " puntos");
		System.out.println("Has ganado " + (puntuacion_Acumulada_Partidas*MULTIPLICADOR_A_EUROS) + " €");
	}

	
	
	//////////////////////////////////////////////////////////// METODOS GETTERS DE LOS ATRIBUTOS
	
	/**
	 * GETTER
	 * @return NUMERO DE PARTIDAS A JUGAR
	 */
		public int getNum_partidas_aJugar() {
			return num_partidas_aJugar;}
		
		/**
		 * GETTER
		 * @return PUNTUACION ACUMULADA DE LAS PARTIDAS
		 */
		public int getPuntuacion_acumulada_partidas() {
		return puntuacion_Acumulada_Partidas;
	}
		
		
	//////////////////////////////////////////////////////////// METODOS SETTERS DE LOS ATRIBUTOS
		
		/**
		 * SETTER. ASIGNA UN NUMERO DE PARTIDAS A JUGAR
		 * @param num_partidas_aJugar
		 */
		public void setNum_partidas_aJugar(int num_partidas_aJugar) {
			this.num_partidas_aJugar = num_partidas_aJugar;}
	
}
