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
		//instancia de la clase HolaMundo
		HolaMundo holaMundo = new HolaMundo();
		//creación de los hilos
			for (int i = 0; i < 5; i++) {
					Thread hilo = new Thread(holaMundo);
					hilo.start();
					try {
						//espera a que termine el hilo ejecutándose para iniciar
						//el siguiente teniendo de tiempo de espera el id del hilo
						//ejecutándose en ese momento
						hilo.join(Thread.currentThread().getId());
					} catch (InterruptedException e) {
						System.out.println("Hilo interrumpido");
					}
			}
	}

}
