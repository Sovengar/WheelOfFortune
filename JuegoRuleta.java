package RuletaFortuna;

import java.util.Scanner;

/**
 * Clase que estara definida por los datos necesarios para realizar el juego de
 * la ruleta de la fortuna y con esto jugar al juego. Especificamente el modo de
 * juego, puntuacion del juego en curso, frase a adivinar, letras acertadas y
 * letras no acertadas
 * 
 * @author Jonathan Garcia Ruiz
 */
public class JuegoRuleta {
	
	/**
	 * Valores concretos que puede tomar la dificultad: NOVATO, MEDIO, EXPERTO
	 * @author Jonathan Garcia Ruiz
	 */
	public enum EnumDificultad {
		NOVATO, MEDIO, EXPERTO;
	}
	
	
	// CONSTANTES
	private static final int INTENTOS_FACIL = 10;
	private static final int INTENTOS_MEDIO = 8;
	private static final int INTENTOS_EXPERTO = 5;

	private static final String ESTADO_WIN = "Felicidades!!, has completado la frase";
	private static final String ESTADO_LOSE = "GAME OVER..";
	private static final String ESTADO_PLAYING = "EN JUEGO";
	
	private static final String REG_ALL_CARACTERES = "[A-Za-z]"; 	//Expresión regular cualquier caracter A-Z o a-z
	private static final String REG_EXP = "[^¿?¡!,.%s\\s]"; 		//Expresión regular cualquier caracter menos x caracteres en concreto, ejemplo [^bcd\\s] todos menos b,c y d.	 
	private static final String CARACTER_ENCRIPTADO = "_"; 			//Caracter a reemplazar en el encriptado
		
	private static final int EDAD_MINIMA = 10;
	private static final int PRECIO_VOCAL = 30;
	private static final int BANCA_ROTA = 0;
			
			
	// ATRIBUTOS
	private EnumDificultad dificultad;
	private int numIntentos;
	private int puntuacion;
	private int puntuacionEstaTirada;
	private int puntuacionTotal;
	private int contadorVictorias=0;
	private boolean juegaSolo;

	private String fraseSinEncriptar = "";
	private String fraseEncriptada = "";

	private StringBuilder sbconsonantesAcertadas;
	private StringBuilder sbconsonantesAcertadasRegEx;
	private StringBuilder sbconsonantesFalladas;
	private String consonanteElegida = "";

	private StringBuilder sbvocalesAcertadas;
	private StringBuilder sbvocalesAcertadasRegEx;
	private StringBuilder sbvocalesFalladas;
	private String vocalComprada = "";

	
	// DECLARACION DE OBJETOS (SIN INSTANCIAR)
	private Jugador jugador1;

	
	// INSTANCIACION DE UNA CLASE (GENERAR UN OBJETO)
	private Scanner entrada = new Scanner(System.in);


	
	/**
	 * CONSTRUCTOR (METODO ESPECIAL) QUE ASIGNA UN JUGADOR QUE JUEGA ESTE JUEGO
	 * 
	 * @param Un
	 *            jugador
	 */
	public JuegoRuleta(Jugador jugador) {

		jugador1 = jugador;
	}

	
	
	/**
	 * METODO QUE RESETEA LOS ATRIBUTOS Y ASIGNA EL NUMERO DE INTENTOS(SU FUNCION ES
	 * SIMILAR A LA DE UN CONSTRUCTOR)
	 */
	public void asignarObjeto() {

		if (dificultad == EnumDificultad.NOVATO) {
			numIntentos = INTENTOS_FACIL;
			fraseSinEncriptar = Frase.getFraseNOVATO();
			fraseEncriptada = fraseSinEncriptar.replaceAll(REG_ALL_CARACTERES, CARACTER_ENCRIPTADO);
		}

		else if (dificultad == EnumDificultad.MEDIO) {
			numIntentos = INTENTOS_MEDIO;
			fraseSinEncriptar = Frase.getFraseMEDIO();
			fraseEncriptada = fraseSinEncriptar.replaceAll(REG_ALL_CARACTERES, CARACTER_ENCRIPTADO);
		}

		else if (dificultad == EnumDificultad.EXPERTO) {
			numIntentos = INTENTOS_EXPERTO;
			fraseSinEncriptar = Frase.getFraseEXPERTO();
			fraseEncriptada = fraseSinEncriptar.replaceAll(REG_ALL_CARACTERES, CARACTER_ENCRIPTADO);
		}

		puntuacion = 0;
		puntuacionEstaTirada = 0;
		puntuacionTotal = 0;

		sbconsonantesAcertadas = new StringBuilder();
		sbconsonantesAcertadasRegEx = new StringBuilder();
		sbconsonantesFalladas = new StringBuilder();
		consonanteElegida = "";

		sbvocalesAcertadas = new StringBuilder();
		sbvocalesAcertadasRegEx = new StringBuilder();
		sbvocalesFalladas = new StringBuilder();
		vocalComprada = "";

	}

	
	
	/**
	 * METODO QUE TIENE TODA LA LOGICA DE LA RULETA, FUNCIONARA SIEMPRE Y CUANDO  PUEDE SEGUIR JUGANDO SEA TRUE.
	 * NOS MOSTRARA UNA FRASE ENCRIPTADA Y EL SISTEMA HARA UNA TIRADA AUTOMATICAMENTE.
	 * NOS MOSTRARA LOS PUNTOS QUE TENEMOS
	 * NOS PEDIRA UNA CONSONANTE
	 * VALIDARA SI EXISTE Y ACTUALIZARA LA FRASE ENCRIPTADA CON LOS CARACTERES ACERTADOS(SI NO HAS ACERTADO OBVIAMENTE SEGUIRA IGUAL)
	 * NOS MOSTRARA NUEVAMENTE LA FRASE QUE ESTAMOS EMPEZANDO A DESENCRIPTAR Y LA PUNTUACION QUE HEMOS GENERADO
	 * SI TENEMOS SUFICIENTES PUNTOS NOS DARA LA OPCION A COMPRAR VOCAL
	 * VALIDARA SI EXISTE Y ACTUALIZARA LA FRASE ENCRIPTADA CON LOS CARACTERES ACERTADOS(SI NO HAS ACERTADO OBVIAMENTE SEGUIRA IGUAL)
	 * UNA VEZ HECHO ESTO TENDREMOS LA OPCION DE RESOLVER LA FRASE, SI ACERTAMOS HEMOS GANADO, SI NO, NO PASA NADA
	 * RESTARA UN INTENTO YA QUE HA PASADO UN TURNO
	 * PARA CONCLUIR NOS MOSTRARA LA INFORMACION DEL TURNO
	 * 
	 * @return LAS ITERACIONES DE UNA PARTIDA
	 */
	public void jugar() {

		do {

			System.out.println("\n");
			System.out.println("Frase encriptada: " + fraseEncriptada);
			puntuacionEstaTirada = Tirada.getTirada();
			System.out.println("Tienes " + puntuacionEstaTirada + " puntos este turno");

			if (puntuacionEstaTirada != 0) {

				elegirConsonante();
				validaConsonante();

				System.out.println("Frase encriptada: " + fraseEncriptada);

				puntuacion = calcularPuntuacion();
				puntuacionTotal += puntuacion;

				System.out.println("Tienes " + puntuacionTotal + " puntos en total");

				comprarVocal();
				validaVocal();

				resolver();

				numIntentos--;

				System.out.println(mostrarInfoResultado());
				
			} else {

				puntuacion = calcularPuntuacion();
				puntuacionTotal += puntuacion;

				numIntentos--;
				System.out.println("Has perdido un turno y tus puntos ya que has sacado un " + BANCA_ROTA);
				System.out.println("Turnos restantes: " + numIntentos);
			}

			if (esGanador() == false) {

				if (esPerdedor() == true) {
					System.out.println("La frase era: " + fraseSinEncriptar);
				}
			} else
				contadorVictorias++;
			
			System.out.println("////////////////////////////////////////////////////////////////////////////");

		} while (puedeSeguirJugando() == true);
	}

		
	/**
	 * METODO QUE DEVUELVE TODA LA INFORMACION DEL TURNO
	 * @return CONSONANTES FALLADAS Y ACERTADAS, CONSONANTE ELEGIDA, ESTADO DEL JUEGO, FRASE ENCRIPTADA, ETC..
	 */
	public String mostrarInfoResultado() {
		
		StringBuilder sbcadena = new StringBuilder("");
		
		sbcadena.append("\n").append("\n").append("\n");
		sbcadena.append("Vocal comprada: ").append(vocalComprada).append(" // ");
		sbcadena.append("Vocales acertadas: " + sbvocalesAcertadas + " // ");
		sbcadena.append("Vocales falladas: " + sbvocalesFalladas + " //");
		sbcadena.append("\n");
		sbcadena.append("Consonante elegida: " + consonanteElegida + " // ");
		sbcadena.append("Consonante acertadas: " + sbconsonantesAcertadas + " // ");
		sbcadena.append("Consonante elegida: " + sbconsonantesFalladas + " //");
		sbcadena.append("\n").append("\n");
		sbcadena.append("Frase: " + fraseEncriptada);
		sbcadena.append("\n").append("\n");
		sbcadena.append("Puntos esta tirada: " + puntuacionEstaTirada + " puntos // ");
		sbcadena.append("Puntuacion este turno: " + puntuacion + " puntos // ");
		sbcadena.append("Puntuacion total: " + puntuacionTotal + " puntos // ");
		sbcadena.append("\n");
		sbcadena.append("Turnos restantes: " + numIntentos + " turnos");
		sbcadena.append("\n");
		

		if (esPerdedor() == true)
			sbcadena.append("Estado de la partida: " + ESTADO_LOSE);
		else if (esGanador() == true)
			sbcadena.append("Estado de la partida: " + ESTADO_WIN);
		else
			sbcadena.append("Estado de la partida: " + ESTADO_PLAYING);

		sbcadena.append("\n").append("\n").append("\n");

		return sbcadena.toString();
	}
	
	
	
	/**
	 * METODO QUE ACTUALIZA LA FRASE SI SE HA ACERTADO UNA VOCAL O CONSONANTE
	 */
	private void actualizarFraseEncriptada() {

		if (sbconsonantesAcertadas.length()==0 && sbvocalesAcertadas.length()==0) { //SI LO HICIERAMOS CON STRINGS USARIAMOS .ISEMPTY()
			fraseEncriptada = this.getFraseCodificada();
		} else {
			// String.format reemplaza el %s por el contenido de la cadena consonantesAcertadas
			fraseEncriptada = fraseSinEncriptar.replaceAll(String.format(REG_EXP, (sbvocalesAcertadasRegEx.append(sbconsonantesAcertadasRegEx).toString())), CARACTER_ENCRIPTADO);
		}
	}
	
	
	
	/**
	 * METODO QUE CONTEA EL NUMERO DE CONSONANTES ACERTADAS EN LA FRASE
	 * @param caracter
	 * @return NUMERO DE CONSONANTES ACERTADAS
	 */
	private int contadorDeConsonantesEnlaFrase() {

		int resultado = 0;
		String charToString = "";
		
		for (int i = 0; i < fraseSinEncriptar.length(); i++) {

			char charAt = fraseSinEncriptar.charAt(i);
			charToString = charToString + charAt;
			if ((consonanteElegida.contains(charToString))) {
				resultado++;
				charToString = "";
			} else
				charToString = "";
		}
		return resultado;
	}
	


	/**
	 * METODO QUE CALCULA LA PUNTUACION TOTAL EN UN TURNO(INTENTO), SI SACA UN 0, LA
	 * PUNTUACION Y PUNTUACION TOTAL SERA 0
	 * 
	 * @return PUNTUACION EN ESE INTENTO
	 */
	private int calcularPuntuacion() {

		if (puntuacionEstaTirada == 0) {
			puntuacion = BANCA_ROTA;
			puntuacionTotal = BANCA_ROTA;
		}
		else if (contadorDeConsonantesEnlaFrase() >= 0) {
			puntuacion = puntuacionEstaTirada * contadorDeConsonantesEnlaFrase();
		}
		else if (esPerdedor()==true) {
			puntuacionTotal=BANCA_ROTA;
		}
		
		return puntuacion;
	}
	

	/**
	 * METODO QUE COMPRA UNA VOCAL SI SE PUEDE Y RESTA PRECIO_VOCAL A LA PUNTUACION
	 * TOTAL
	 * 
	 * @param caracterComprado
	 * @return VOCAL COMPRADA
	 */
	public void comprarVocal() {

		String teclado = "";

		if (puntuacionTotal >= PRECIO_VOCAL && (((sbvocalesAcertadas.append(sbvocalesFalladas).toString()).contains("A")) == false
				|| ((sbvocalesAcertadas.append(sbvocalesFalladas).toString()).contains("E")) == false
				|| ((sbvocalesAcertadas.append(sbvocalesFalladas).toString()).contains("I")) == false
				|| ((sbvocalesAcertadas.append(sbvocalesFalladas).toString()).contains("O")) == false
				|| ((sbvocalesAcertadas.append(sbvocalesFalladas).toString()).contains("U")) == false)) 
		{

			System.out.println("Desea comprar una vocal?	(y/n)");

			
			if(juegaSolo==false) {
				teclado = entrada.nextLine().toUpperCase();
			} else teclado = "N";

			if (teclado.equals("Y")) {

				System.out.println("Escoja una vocal: ");
				
				if(juegaSolo==false) {
					vocalComprada = entrada.nextLine().toUpperCase();
				} else vocalComprada = Caracter.getVocalAleatoria();
		

				if (Caracter.esVocal(vocalComprada) == true) {

					while (sbvocalesAcertadas.toString().contains(vocalComprada) == true || sbvocalesFalladas.toString().contains(vocalComprada) == true) {
						
						System.out.println("Ya has introducido la " + vocalComprada);
						System.out.println("Escoja una vocal: ");
						
						if(juegaSolo==false) {
							vocalComprada = entrada.nextLine().toUpperCase();
						} else vocalComprada = Caracter.getVocalAleatoria();

						setVocalComprada(vocalComprada);
					}

					if (sbvocalesAcertadas.toString().contains(vocalComprada) == false && sbvocalesFalladas.toString().contains(vocalComprada) == false) {

						System.out.println("Has elegido la " + vocalComprada);
						puntuacionTotal -= PRECIO_VOCAL;

					}

				} else {

					while (Caracter.esVocal(vocalComprada) == false) {
						
						System.out.println(vocalComprada + "no es una vocal");
						System.out.println("Escoja una vocal: ");
						
						if(juegaSolo==false) {
							vocalComprada = entrada.nextLine().toUpperCase();
						} else vocalComprada = Caracter.getVocalAleatoria();

						setVocalComprada(vocalComprada);
					}

				}

			} else
				vocalComprada = "";

		}

		else {
			System.out.println("No quedan vocales para comprar o no tienes suficientes puntos");
			vocalComprada = "";
		}
	}

	
	/**
	 * METODO PARA ELEGIR UNA CONSONANTE PARA ESTE INTENTO
	 * @param consonante
	 * @return CONSONANTE
	 */
	public void elegirConsonante() {

		System.out.println("Elige una consonante:");
		
		if(juegaSolo==false) {
			consonanteElegida = entrada.nextLine().toUpperCase();
		} else consonanteElegida = Caracter.getConsonanteAleatoria();

		if (Caracter.esConsonante(consonanteElegida) == true) {

			while (sbconsonantesAcertadas.toString().contains(consonanteElegida) == true || sbconsonantesFalladas.toString().contains(consonanteElegida) == true) {
				
				System.out.println("Ya has introducido la " + consonanteElegida + " antes");
				System.out.println("Escoja una consonante: ");
				
				
				if(juegaSolo==false) {
					consonanteElegida = entrada.nextLine().toUpperCase();
				} else consonanteElegida = Caracter.getConsonanteAleatoria();
				
				setConsonanteElegida(consonanteElegida);
			}

		} else {
			
			while (Caracter.esConsonante(consonanteElegida) == false) {
				
				System.out.println(consonanteElegida + " no es una consonante");
				System.out.println("Escoja una consonante: ");
				
				if(juegaSolo==false) {
					consonanteElegida = entrada.nextLine().toUpperCase();
				} else consonanteElegida = Caracter.getConsonanteAleatoria();

				setConsonanteElegida(consonanteElegida);
			}
			
		}

		System.out.println("Has elegido la " + consonanteElegida);
	}

	
	/**
	 * METODO QUE NOS DA LA OPCION DE RESOLVER LA FRASE, SI LA RESOLVEMOS HEMOS
	 * GANADO( ASIGNAMOS LOS INTENTOS A 1, YA QUE LUEGO EN EL METODO JUGAR HAREMOS
	 * numIntentos--), SI NO, SIGUE EL JUEGO
	 */
	private void resolver() {

		String teclado = "";
		String tuSolucion = "";

		System.out.println("Desea resolver?	(Y/N)");

		if(juegaSolo==false) {
			teclado = entrada.nextLine().toUpperCase();
		} else teclado = "N";
		
		if (teclado.equals("Y")) {
			System.out.println("Resuelva:");
			tuSolucion = entrada.nextLine().toUpperCase();

			if (tuSolucion.equals(fraseSinEncriptar) == true) {
				fraseEncriptada = tuSolucion;
				numIntentos = 1;
				
				/*
				for (int i=0; i<Frase.fraseKANEKI.size(); i++) {
				
					if(Frase.fraseKANEKI().contains(fraseEncriptada)==true) {
					
					System.out.println(" -KEN KANEKI");
				}
					
					
				}
				*/
				
				
				
				
				
			} else
				System.out.println("No has acertado");
		}
	}


	
///////////////////////////////////////////////////////////// METODOS DE VALIDACION O COMPROBACION
	
/**
 * METODO QUE VALIDA SI LA CONSONANTE ELEGIDA ESTA EN LA FRASE, EN CASO AFIRMATIVO, ACTUALIZA EL STRING CON LAS CONSONANTES 
 * ACERTADAS Y LA FRASE. EN CASO NEGATIVO ACTUALIZARA EL STRING CON LAS CONSONANTES FALLADAS	
 * @param caracter
 * @return TRUE OR FALSE
 */
	private boolean validaConsonante() {

		Boolean existe;

		if (fraseSinEncriptar.indexOf(consonanteElegida.toLowerCase()) != -1 || fraseSinEncriptar.indexOf(consonanteElegida.toUpperCase()) != -1) {

			sbconsonantesAcertadas.append(consonanteElegida);

			sbconsonantesAcertadasRegEx.append(consonanteElegida.toUpperCase());
			sbconsonantesAcertadasRegEx.append(consonanteElegida.toLowerCase());

			actualizarFraseEncriptada();

			existe = true;
		} else {
			sbconsonantesFalladas.append(consonanteElegida);
			existe = false;
		}
		return existe;
	}
	
	/**
	 * METODO QUE VALIDA SI LA VOCAL COMPRADA ESTA EN LA FRASE, EN CASO AFIRMATIVO,
	 * ACTUALIZA EL STRING CON LAS VOCALES ACERTADAS Y LA FRASE. EN CASO NEGATIVO
	 * ACTUALIZARA EL STRING CON LAS VOCALES FALLADAS
	 * 
	 * @return
	 */
	private boolean validaVocal() {
		
		Boolean existe;

		if (fraseSinEncriptar.indexOf(vocalComprada.toLowerCase()) != -1 || fraseSinEncriptar.indexOf(vocalComprada.toUpperCase()) != -1) {

			sbvocalesAcertadas.append(vocalComprada);

			sbvocalesAcertadasRegEx.append(vocalComprada.toUpperCase());
			sbvocalesAcertadasRegEx.append(vocalComprada.toLowerCase());

			actualizarFraseEncriptada();
			System.out.println("Frase encriptada: " + fraseEncriptada);
			existe = true;
		} else {
			sbvocalesFalladas.append(vocalComprada);
			existe = false;
		}
		return existe;
	}
	
	/**
	 * METODO QUE EVALUA SI PODEMOS SEGUIR JUGANDO.. PODREMOS SI SE CUMPLEN LAS
	 * CONDICIONES, LA CUALES SON: NO HABER GANADO NI HABER PERDIDO
	 * 
	 * @return TRUE OR FALSE
	 */
	public boolean puedeSeguirJugando() {
		
		boolean resultado;
		
		if (esGanador()==false) {
			resultado=true;
			if(esPerdedor()==false) {
			resultado=true;	
			}else resultado=false;
		} else resultado=false;
		return resultado;
	}
				

	/**
	 * Para validar si el juego es valido para el usuario que quiere jugar. Por
	 * defecto, no pueden jugar los menores de 10 años.
	 * 
	 * @return true or false
	 */
	public boolean comprobarEdad() {

		boolean resultado;
		if (jugador1.getEdad() > EDAD_MINIMA)
			resultado = false;
		else
			resultado = true;
		return resultado;
	}

		

	/**
	 * VALIDA SI LA PERSONA HA ACERTADO LA FRASE O NO
	 * 
	 * @return true or false
	 */
	public boolean esGanador() {

		boolean resultado;
		if (fraseSinEncriptar.equals(fraseEncriptada)) {
			resultado = true;
		} else
			resultado = false;
		return resultado;
	}
	
	
	/**
	 * VALIDA SI LA PERSONA HA PERDIDO O NO
	 * 
	 * @return true or false
	 */
	public boolean esPerdedor() {

		boolean resultado;
		if (esGanador() == false) {
			if (numIntentos <= 0) {
				resultado = true;
			} else
				resultado = false;
		} else
			resultado = false;
		
		if ((esGanador() == false) && (numIntentos <= 0)) {
				resultado = true;
		} else
			resultado = false;
		
		return resultado;
	}


		
	////////////////////////////////////////////////////////////////// METODOS GETTERS DE LAS CONSTANTES

	public static int getIntentosFacil() {
		return INTENTOS_FACIL;
	}

	public static int getIntentosMedio() {
		return INTENTOS_MEDIO;
	}

	public static int getIntentosExperto() {
		return INTENTOS_EXPERTO;
	}

	public static int getBancaRota() {
		return BANCA_ROTA;
	}

	public static String getEstadoWin() {
		return ESTADO_WIN;
	}

	public static String getEstadoLose() {
		return ESTADO_LOSE;
	}

	public static String getEstadoPlaying() {
		return ESTADO_PLAYING;
	}

	public static String getCaracterEncriptado() {
		return CARACTER_ENCRIPTADO;
	}

	public static int getEdadMinima() {
		return EDAD_MINIMA;
	}

	public static int getPrecioVocal() {
		return PRECIO_VOCAL;
	}
	
//////////////////////////////////////////////////////////////////METODOS GETTERS DE LOS ATRIBUTOS
	
	public EnumDificultad getDificultad() {
		return dificultad;
	}

	public int getNumintentos() {
		return numIntentos;
	}

	public int getContadorVictorias() {
		return contadorVictorias;
	}

	public String getFraseCodificada() {
		return fraseEncriptada;
	}

	public String getConsonantesAcertadas() {
		return sbconsonantesAcertadas.toString();
	}

	public String getConsonantesFalladas() {
		return sbconsonantesFalladas.toString();
	}

	public String getConsonantesAcertadasRegEx() {
		return sbconsonantesAcertadasRegEx.toString();
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public int getPuntuacionEstaTirada() {
		return puntuacionEstaTirada;
	}

	public int getPuntuacionTotal() {
		return puntuacionTotal;
	}

	public String getConsonanteElegida() {
		return consonanteElegida;
	}

	public String getVocalesAcertadas() {
		return sbvocalesAcertadas.toString();
	}

	public String getVocalesFalladas() {
		return sbvocalesFalladas.toString();
	}

	public String getVocalComprada() {
		return vocalComprada;
	}

	public Jugador getJugador1() {
		return jugador1;
	}

	public boolean isJuegaSolo() {
		return juegaSolo;
	}
	
	////////////////////////////////////////////////////////////////// METODOS SETTERS DE LOS ATRIBUTOS
	

	public void setDificultad(EnumDificultad dificultad) {
		this.dificultad = dificultad;
	}

	public void setNumintentos(int numintentos) {
		this.numIntentos = numintentos;
	}

	public void setConsonanteElegida(String consonanteElegida) {
		this.consonanteElegida = consonanteElegida;
	}

	public void setVocalComprada(String vocalComprada) {
		this.vocalComprada = vocalComprada;
	}

	public void setEntrada(Scanner entrada) {
		this.entrada = entrada;
	}

	public void setJugador1(Jugador jugador1) {
		this.jugador1 = jugador1;
	}

	public void setJuegaSolo(boolean juegaSolo) {
		this.juegaSolo = juegaSolo;
	}
		

	

}