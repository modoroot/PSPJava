package tema2.sincro;

public class TestContadorSync {
	public static void main(String[] args){
	      Contador counter = new Contador();
	      
	      Thread  h1 = new ContadorHilo(counter);
	      Thread  h2 = new ContadorHilo(counter);
	      Thread  h3 = new ContadorHilo(counter);
	      Thread  h4 = new ContadorHilo(counter);
	      Thread  h5 = new ContadorHilo(counter);
	      
	      h1.setName("Hilo 1");
	      h2.setName("Hilo 2");
	      h3.setName("Hilo 3");
	      h4.setName("Hilo 4");
	      h5.setName("Hilo 5");
	      h1.start();
	      h2.start();
	      h3.start();
	      h4.start();
	      h5.start();
	      try {
				h1.join();
				h2.join();
				h3.join();
				h4.join();
				h5.join();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	    }
}
