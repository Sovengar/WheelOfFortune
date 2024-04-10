package RuletaFortuna;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Clase que serializa y deserializa
 * 
 * @author Jonathan Garcia Ruiz
 *
 */
public class Serialize {

	private ObjectInputStream lectorDeObjetos;
	private ObjectOutputStream escritorDeObjetos;

	/**
	 * Serializamos un objeto a un archivo
	 * 
	 * @param objeto
	 */
	public void escribirObjeto(Object objeto) {

		try {

			escritorDeObjetos = new ObjectOutputStream(new FileOutputStream("Jugadores.dat"));
			escritorDeObjetos.writeObject(objeto);
			escritorDeObjetos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Deserializamos un archivo a un objeto
	 * 
	 * @param nombreDelArchivo
	 * @return
	 */
	public Object leerObjeto(String nombreDelArchivo) {

		Object retorno = null;

		try {

			lectorDeObjetos = new ObjectInputStream(new FileInputStream(nombreDelArchivo));
			retorno = lectorDeObjetos.readObject();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return retorno;
	}

}
