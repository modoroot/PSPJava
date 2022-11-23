package tema2.hilos;

public class HolaMundo implements Runnable{
	@Override
	public void run() {
		System.out.println("Hola mundo " + Thread.currentThread().getId());
		
	}
	public HolaMundo() {}

}
