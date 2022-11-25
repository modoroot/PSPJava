package tema2.sincro;

/**
 * 
 * @author amna
 * @version 1.0
 */
public class TestContadorSync {
	public static void main(String[] args){
	      Contador counter = new Contador();
	      
	      for (int i = 1; i <= 5; i++) {
			Thread h = (new ContadorHilo(counter));
			h.setName("Hilo "+i);
			h.start();
//			try {
//				h.join();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	      }
	    }
