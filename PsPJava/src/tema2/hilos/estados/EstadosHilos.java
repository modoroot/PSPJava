package tema2.hilos.estados;

/**
 * Clase que maneja los diferentes estados de hilos
 * @author amna
 * @version 1.0
 */
public class EstadosHilos implements Runnable {

	/**
	 * Usará el método run cuando se llame al método start() en main
	 */
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Hilo: " + Thread.currentThread().getId() + " " + i);
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			// instanciación de un objeto Thread
			Thread h = new Thread(new EstadosHilos(), "Hilo " + i);
			// inicio del hilo y creación de los recursos del sistema necesarios
			// para que el hilo puede ejecutarse
			// NEW: hilo no iniciado
			System.out.println(h.getState());
			h.start();
			// RUNNABLE: el hilo está siendo ejecutado
			System.out.println(h.getState());
			try {
				// duerme al hilo durante 2 segundos (bloqueado)
				Thread.sleep(2000);
				// TERMINATED: el hilo ha finalizado
				System.out.println(h.getState());
				// pone en espera al hilo hasta que muera
				h.join();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("----------");

		}
		System.out.println("Hilo main finalizado");
	}
}
