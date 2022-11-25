package tema2.sincro;

/**
 * Clase sincronizadora del contador a partir de hilos utilizando la palabra
 * reservada synchronized
 * 
 * @author amna
 * @version 1.0
 */
public class ContadorHilo extends Thread {
	private Contador counter;
	private int i;

	/**
	 * Constructor de la clase
	 * 
	 * @param counter contador
	 */
	public ContadorHilo(Contador counter) {
		this.counter = counter;
	}

	/**
	 * Método heredado de Thread que utilizan los hilos una vez se empiezan a
	 * ejecutar. Contiene una variable compartida por todos los hilos creados
	 * y sincronizada por la palabra reservada synchronized. Gestión de 
	 * región crítica
	 */
	public void run() {
		synchronized(counter) {
			for (int j = 0; j < 1000; j++) {
				//REGIÓN CRÍTICA
				counter.aumentarCont(i + 1);
				System.out.println(counter + " " + Thread.currentThread().getName());
			}
			
//			try {
//				
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				System.err.println("Hilo interrumpido");
//			}
		}
	}
}
