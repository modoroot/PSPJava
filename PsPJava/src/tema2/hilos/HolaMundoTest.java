package tema2.hilos;

/**
 * Clase que crea hilos esperando a que termine el anterior
 * a partir de join aplicándole un tiempo proporcional de espera
 * según su ID
 * @author amna
 * @version 1.0
 */
public class HolaMundoTest {

	public static void main(String[] args) {
		HolaMundo holaMundo = new HolaMundo();
			for (int i = 0; i < 5; i++) {
					Thread hilo = new Thread(holaMundo);
					hilo.start();
					try {
						hilo.join(Thread.currentThread().getId());
					} catch (InterruptedException e) {
						System.out.println("Hilo interrumpido");
					}
			}
	}

}
