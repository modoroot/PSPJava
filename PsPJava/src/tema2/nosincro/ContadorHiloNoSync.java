package tema2.nosincro;

/**
 * Clase no sincronizadora del contador
 * 
 * @author amna
 * @version 1.0
 */
public class ContadorHiloNoSync extends Thread {
	private ContadorNoSync counter;
	private int i;

	/**
	 * Constructor de la clase
	 * 
	 * @param counter contador
	 */
	public ContadorHiloNoSync(ContadorNoSync counter) {
		this.counter = counter;
	}

	/**
	 * Método heredado de Thread que utilizan los hilos una vez se empiezan a
	 * ejecutar.
	 */
	public void run() {
			for (int j = 0; j < 1000; j++) {
				counter.aumentarCont(i + 1);
				System.out.println(counter + " " + Thread.currentThread().getName());
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.err.println("Hilo interrumpido");
			}
		
	}
}
