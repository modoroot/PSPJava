package tema1.procesos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Clase que usa a DameFichero
 * para separar palabras palíndromas de no palíndromas
 * a partir de procesos y redirecciones
 * @author amna
 * @version 1.0
 */
public class PasaFichero {

	public static void main(String[] args) {
		int exitVal = 0;
		Scanner sc = new Scanner(System.in);
		String cadena = "go";
		try {
			// se crea un fichero de texto a partir de las entradas
			// introducidas por consola
			PrintWriter pw = new PrintWriter(new FileWriter("palabras.txt"));
			PrintWriter pwE = new PrintWriter(new FileWriter("nopalindromas.txt"));
			while (cadena.length() > 1 && cadena.charAt(0) != 0) {
				System.out.println("Introduce una cadena:(0 para terminar)");
				cadena = sc.nextLine();
				cadena = cadena.replace(" ", "");
				StringBuilder sb = new StringBuilder(cadena).reverse();
				//esto no me funciona
				if (!cadena.equalsIgnoreCase(sb.toString())) {
					pwE.println(cadena);
				}
				// borra el 0 introducido al haber terminado
				if (cadena.charAt(0) == '0') {
					cadena.replace(cadena.charAt(0), ' ');
				} else {
					pw.println(cadena);
				}
			}
			pw.close();
			pwE.close();
			sc.close();
			ProcessBuilder pb = new ProcessBuilder("java", "tema1.procesos.DameFichero");
			// directorio de trabajo
			pb.directory(new File("/home/amna/git/pspjava/PsPJava/bin/"));
			// redirección del flujo de entrada del proceso del programa
			// al que se llama
			pb.redirectInput(new File("palabras.txt"));
			//redirección del flujo de errores del proceso
			pb.redirectError(new File("nopalindromas.txt"));
			// redirección del flujo de salida del proceso del programa al
			// que se llama
			pb.redirectOutput(new File("palindromas.txt"));
			// ejecución del proceso
			Process process = pb.start();
			// se espera para el valor retornado
			exitVal = process.waitFor();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		// se muestra el resultado de la operación
		System.out.println("Terminado con valor: " + exitVal);
		System.exit(exitVal);
	}

}