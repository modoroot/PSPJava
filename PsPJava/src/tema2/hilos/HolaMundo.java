package tema2.hilos;

/**
 * Clase manejadora del hilo
 * @author amna
 * @version 1.0
 */
public class HolaMundo implements Runnable{
	@Override
	public void run() {
		System.out.println("Hola mundo: " + Thread.currentThread().getId());
	}
	public HolaMundo() {}

}
