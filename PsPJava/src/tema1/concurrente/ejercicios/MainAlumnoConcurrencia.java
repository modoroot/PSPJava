package tema1.concurrente.ejercicios;

/**
 * Clase que utiliza la interfaz Runnable para usar conceptos de
 * programación concurrente
 * @author amna
 * @version 1.0
 */
public class MainAlumnoConcurrencia {

	public static void main(String[] args) {
		Alumno alumno = new Alumno();
		alumno.alumGenerador();
		Runnable media = () ->{
			alumno.alumMedia();
		};
		Runnable mayoresVeCinco = () ->{
			alumno.alumMayoresVeintiCinco();
		};
		Runnable entreEdad = () ->{
			alumno.alumEntreDieciNueveVeintiCinco();
		};
		Runnable numDieciNueve = () ->{
			alumno.alumDieciNueveAnios();
		};
		long init = System.nanoTime();
		//Instanciación de las interfaces a los hilos
		Thread hiloUno = new Thread(media);
		Thread hiloDos = new Thread(mayoresVeCinco);
		Thread hiloTres = new Thread(entreEdad);
		Thread hiloCuatro = new Thread(numDieciNueve);
		//Empiezan la ejecución de los hilos
		hiloUno.start();
		hiloDos.start();
		hiloTres.start();
		hiloCuatro.start();
		long fin = System.nanoTime();
		long tiempo = fin - init;
		//0 ms(180000~ ns). Lo pongo en nanosegundos porque sino siempre saldría 0 ms
      System.out.println(tiempo +" ns");
	}

}
