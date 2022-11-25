package tema2.sincro;

public class ContadorHilo extends Thread {
	private Contador counter;
	private int i;

	public ContadorHilo(Contador counter) {
		this.counter = counter;
	}

	public void run() {
		synchronized (counter) {
			counter.aumentarCont(i + 1);
			System.out.println(counter + " " + Thread.currentThread().getName());
		}
				
//				try {
//					Thread.sleep(100);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			


//	for(int i=0; i<10; i++){
//           counter.aumentarCont(i);
//           System.out.println(counter+" "+Thread.currentThread().getName());
//           try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//        }
	}
}
