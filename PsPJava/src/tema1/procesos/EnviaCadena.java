package tema1.procesos;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
/**
 * Solución propuesta a la actividad 1.12
 * Se usa el flujo de salida y entrada estándar para comunicar
 * dos procesos
 * @author Rafa
 * @version 1.0
 */
public class EnviaCadena {
	public static void main(String[] args) {
		int exitVal=0;
		int byteLeido=0;
		EnviaCadena enviaCadena = new EnviaCadena();
		//llamada al otro programa con un parámetro
		System.out.println("Llamada con un parámetro tipo cadena, muestra:");
		exitVal = enviaCadena.runProcess("Hola");
		System.out.println("Resultado: " + exitVal);

		// Llama al otro programa sin parámetros:
		System.out.println("Llamada sin parámetros, muestra:");
		exitVal = enviaCadena.runProcess();
		System.out.println("Resultado: " + exitVal);
	}
	/**
	 * Ejecuta un programa en un proceso al que se pasa 0 o más parámetros
	 * Devuelve una respuesta según los parámetros que se pasan
	 * @param cadena Parámetros que usarán en la llamada al otro programa
	 * @return Valor devuelto por el otro programa según los parámetros que se han pasado
	 */
	private int runProcess(String ... cadena) {
		int byteLeido=0;
		int exitVal=0;
		ProcessBuilder pb = new ProcessBuilder();
		pb.directory(new File("/home/usuario/git/ProgSerPro/ProgSerPro/bin"));
		if(cadena.length==0) {
			try {
				pb.command("java", "psp.temauno.actividades.unodoce.RecibeCadena");
				Process process = pb.start();
				exitVal=process.waitFor();
			}catch (IOException | InterruptedException e) {
				e.printStackTrace();
			}
		}
		else {
			
			try {
				pb.command("java", "psp.temauno.actividades.unodoce.RecibeCadena", 
						cadena[0].toString());
				Process process = pb.start();
				//para mostrar lo que escribe el otro proceso, es decir
				//la cadena 5 veces
				InputStream is = process.getInputStream();
				exitVal = process.waitFor();			

				while((byteLeido=is.read())>-1) {
					System.out.print((char)byteLeido);
				}
				is.close();
			} catch (IOException | InterruptedException e) {
				e.printStackTrace();
			}
		}
		return exitVal;
	}
}
