package tema1.procesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Clase que maneja el flujo de entrada
 * por consola para PasaFichero
 * @author amna
 * @version 1.0
 */
public class DameFichero {

	public static void main(String[] args) {
		// obtención de un lector a partir del flujo de entrada
		// estándar (definido por el proceso del programa que llama
		// a éste o bien por la entrada por consola)
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String cadenaPalindromas = "";
		int exitVal = 0;
		try {
			// lectura del flujo de entrada estándar hasta que no haya nada
			// que leer
			while (bReader.ready()) {
				cadenaPalindromas = bReader.readLine();
				cadenaPalindromas = cadenaPalindromas.replace(" ", "");
				StringBuilder sb = new StringBuilder(cadenaPalindromas).reverse();
				// comprueba si la frase o palabra es palíndroma
				if (cadenaPalindromas.equalsIgnoreCase(sb.toString())) {
					System.out.println(cadenaPalindromas);
				}
			}
		} catch (IOException e) {
			exitVal = -1;
		}
		System.exit(exitVal);
	}

}