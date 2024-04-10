package RuletaFortuna;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * Clase "estatica" con metodos estaticos para validar fechas, parsear fechas y
 * calcular edades
 * 
 * @author Jonathan Garcia Ruiz
 *
 */
public class Fecha {

	/**
	 * Valida si la fecha es posterior a 1900
	 * 
	 * @param year
	 * @param month
	 * @param dayOfMonth
	 * @return true or false
	 */
	public static boolean fechaValidacion(int year, int month, int dayOfMonth) {

		boolean resultado = true;

		try {
			if (year < 1900) {
				throw new IllegalArgumentException("Año invalido.");
			}

			LocalDate today = LocalDate.of(year, month, dayOfMonth);
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			System.out.println(formatter.format(today)); // 01/01/2016
		}

		catch (Exception e) {
			resultado = false;
			System.out.println("Ha ocurrido un error");
		}

		return resultado;
	}

	/**
	 * Metodo que convierte un tipo Date en un tipo String
	 * 
	 * @param fecha
	 * @return una fecha en String
	 */
	public static String formatearFechaaString(Date fecha) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(fecha);
	}

	/**
	 * METODO QUE CALCULA LA EDAD
	 * 
	 * @param fecha
	 *            de nacimiento
	 * @return devuelve un entero con la edad
	 */
	public static int calcularEdad(Date fechaNac) {

		Calendar today = Calendar.getInstance();
		Calendar calendar = Calendar.getInstance();

		calendar.setLenient(false);
		calendar.setTime(fechaNac);

		int diff_year = (today.get(Calendar.YEAR) - calendar.get(Calendar.YEAR));
		int diff_month = (today.get(Calendar.MONTH) - calendar.get(Calendar.MONTH));
		int diff_day = (today.get(Calendar.DAY_OF_MONTH) - calendar.get(Calendar.DAY_OF_MONTH));

		// Si esta en ese año pero todavia no los ha cumplido
		if (diff_month < 0 || (diff_month == 0 && diff_day < 0)) {
			diff_year = diff_year - 1;
		}
		return diff_year;
	}

}

