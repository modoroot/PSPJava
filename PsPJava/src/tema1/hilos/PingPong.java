package tema1.hilos;

/**
 * Clase donde se crean los hilos de PING y PONG
 * 
 * @author amna
 *
 */
public class PingPong extends Thread {
	@Override
	public void run() {
		// Info adicional sobre los hilos
		System.out.println("Info del hilo " + Thread.currentThread().getName()
				+ " [Nombre, prioridad, nombre grupo]: "
				+ Thread.currentThread().toString());
	}

	public void PingPongg() {
		PingPong pp = new PingPong();
		// se crea un grupo para los hilos
		ThreadGroup tg = new ThreadGroup("Ping Pong");
		Thread ping = new Thread(tg, pp, "PING");
		Thread pong = new Thread(tg, pp, "PONG");
		// hilos iniciados
		ping.start();
		pong.start();
		/**
		 * Muestra por consola: PING PONG Si no uso el primer sleep suele salir antes
		 * PING que la info. de los hilos (indeterminación)
		 */
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(ping.getName());
				Thread.sleep(1000);
				System.out.println(pong.getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Constructor de la clase
	 */
	public PingPong() {
	}

}
