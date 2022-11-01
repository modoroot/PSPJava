package tema1.concurrente.ejercicios;

public class MainAlumno implements Runnable {
	@Override
	public void run() {
		long init = System.currentTimeMillis();
		Alumno alumno = new Alumno();
		alumno.alumGenerador();
		alumno.mediaAlum();
		long fin = System.currentTimeMillis();
        long tiempo = fin - init;
        System.out.println(tiempo +" ms");
	}

	public static void main(String[] args) {
		MainAlumno hilo = new MainAlumno();
		Thread thread = new Thread(hilo);
		thread.start();

	}

}
