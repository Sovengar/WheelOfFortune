package RuletaFortuna;

import java.util.Date;
import java.util.Scanner;

import RuletaFortuna.JuegoRuleta.EnumDificultad;

/**
 * Clase Main, la cual nos servira de puente con el usuario, esta clase es por
 * asi decirlo la interfaz que tiene el usuario para jugar
 * 
 * @author Jonathan Garcia Ruiz
 *
 */
public class Interfaz {

	/**
	 * Es posible que la clase Date sea reciclada/sustituida en versiones futuras. Este programa
	 * se ha realizado en base a la API de Java™ Platform, Standard Edition 7
	 * https://docs.oracle.com/javase/7/docs/api/
	 * 
	 * @param args
	 */
	@SuppressWarnings("deprecation")

	public static void main(String[] args) {

		// VARIABLES LOCALES
		String tecladoStringPartidasaJugar = "";
		String tecladoStringDificultad = "";

		int tecladoInt;
		
		// PARAMETROS PARA LOS CONSTRUCTORES (ATRIBUTOS)
		String alias = "";
		String pass = "";
		Date fechaNacimiento;
		int num_partidas_aJugar;
		EnumDificultad dificultad;
		boolean juegaSolo;

		// DECLARACION DE OBJETOS (SIN INSTANCIAR)
		Scanner entrada;
		Jugador jugador1;
		Partida partida;

		entrada = new Scanner(System.in);

		System.out.println("Introduce tu Alias: " + "\n");
		alias = "espantapajaros"; //entrada.nextLine(); 

		
		
		System.out.print("Introduce tu Fecha de nacimiento bajo este formato: (mm/dd/yyyy)");
		System.out.println(" *Solo los mayores de " + JuegoRuleta.getEdadMinima() + " años pueden jugar" + "\n");
		
		fechaNacimiento = new Date("12/01/1997"); //entrada.nextLine());
		
		
		
		System.out.println("Introduce tu Contraseña (Debe tener como mínimo " + Jugador.getCaracteresMinimosPw() + " caracteres): " + "\n");
		pass = "bullasthebullas"; //entrada.nextLine();

		jugador1 = new Jugador(alias, pass, fechaNacimiento);

		System.out.println("Introduce tu nombre: " + "\n");
		jugador1.setNombre("Jonathan"); //entrada.nextLine());

		System.out.println("Tus datos... " + "Alias: " + jugador1.getAlias() + " // Nombre: " + jugador1.getNombre()
				+ " // Fecha de nacimiento: " + jugador1.getFechaNacimientoString() + " // Edad: " + jugador1.getEdad() + "\n");
		

		
		
		

		System.out.println("Desea elegir el numero de partidas a jugar?: (Y/N)");

		tecladoStringPartidasaJugar = entrada.nextLine().toUpperCase(); // "N"; //


		if (tecladoStringPartidasaJugar.equals("Y")) {
			System.out.println("Elige cuantas partidas desea jugar: ");
			num_partidas_aJugar = entrada.nextInt();
		} else
			num_partidas_aJugar = Partida.NUM_PARTIDAS_A_JUGAR;

		System.out.println("Vas a jugar " + num_partidas_aJugar + " partida/s");


		
		
		
		
		
		System.out.println("Desea elegir la dificultad?");

		//NO SE POR QUE TENGO QUE HACER ESTO TBH
		if (tecladoStringPartidasaJugar.equals("Y")) {
			
			tecladoStringDificultad = entrada.nextLine().toUpperCase(); // "N";
			tecladoStringDificultad = entrada.nextLine().toUpperCase(); // "N";
			
		} else {
			tecladoStringDificultad = entrada.nextLine().toUpperCase(); // "N";
		}
		

		if (tecladoStringDificultad.equals("Y") == true) {

			System.out.println("Elige dificultad o modo de juego: ");
			System.out.println("1: Novato");
			System.out.println("2: Medio");
			System.out.println("3: Experto");

			tecladoInt = entrada.nextInt();
				
				  if (tecladoInt == 2) {
					dificultad = EnumDificultad.MEDIO;
					System.out.println("La dificultad ha sido establecida en Medio");
				} else if (tecladoInt == 3) {
					dificultad = EnumDificultad.EXPERTO;
					System.out.println("La dificultad ha sido establecida en Experto");
				} else if (tecladoInt == 1) {
						dificultad = EnumDificultad.NOVATO;
						System.out.println("La dificultad ha sido establecida en Novato");
					} else {
						System.out.println("No has introducido la contraseña correctamente, por lo tanto vamos a establecerla en Novato");
						dificultad = EnumDificultad.NOVATO;
					}
			
		} else {
			dificultad = EnumDificultad.NOVATO;
			System.out.println("La dificultad ha sido establecida en Novato");
		}

		
		
		
		System.out.println("Desea que juegue la maquina?: (Y/N)");

		tecladoStringPartidasaJugar = entrada.nextLine().toUpperCase(); // "N";

		if (tecladoStringPartidasaJugar.equals("Y")) {
			
			juegaSolo = true;
			
		} else juegaSolo = false;
		
		System.out.println("\n" + "LOADING GAME...");
		System.out.println("\n" + "////////////////////////////////////////////////////////////////////////////////////////");

		partida = new Partida(jugador1, num_partidas_aJugar, dificultad, juegaSolo);


		partida.validacionEdad();

		partida.iniciar();

		entrada.close();

		/*
		 Serialize serializadora = new Serialize();
		 
		 serializadora.escribirObjeto(jugador1);
		 
		 Jugador jugadores;
		 
		 jugadores = (Jugador) serializadora.leerObjeto("Jugadores.dat");
		 */
	}
}
