package tema2.nosincro;

/**
 * Clase que inicia y ejecuta los hilos no sincronizados de la clase ContadorHilo
 * 
 * @author amna
 * @version 1.0
 */
public class TestContadorNoSync {

	public static void main(String[] args) {
		ContadorNoSync counter = new ContadorNoSync();
		for (int i = 1; i <= 5; i++) {
			Thread h = (new ContadorHiloNoSync(counter));
			h.setName("Hilo " + i);
			//inicio de hilos
			h.start();
		}

	}
}
