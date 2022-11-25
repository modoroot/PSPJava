package tema2.sincro;

/**
 * Clase que inicia y ejecuta los hilos sincronizados de la clase ContadorHilo
 * 
 * @author amna
 * @version 1.0
 */
public class TestContadorSync {

	public static void main(String[] args) {
		Contador counter = new Contador();
		for (int i = 1; i <= 5; i++) {
			Thread h = (new ContadorHilo(counter));
			h.setName("Hilo " + i);
			h.start();
			// Join en este caso es totalmente opcional.Simplemente sirve para que los hilos
			// sumen
			// a la variable de forma ordenada, es decir, primero empieza el hilo 1, luego
			// hilo 2 y sucesivamente. No obstante, sin el método join,
			// empezará otro hilo, por ejemplo el 4, y a lo mejor sigue el 2,
			// pero la variable contador no se verá afectada y seguirá aumentando de 1 en 1
			// por donde lo dejó el hilo anterior debido a que la variable está compartida
			// y sincronizada
			try {
				h.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
