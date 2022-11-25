package tema2.sincro;

public class ContadorHilo extends Thread{
	 protected Contador counter = null;

     public ContadorHilo(Contador counter){
        this.counter = counter;
     }

     public void run() {
	for(int i=0; i<10; i++){
           counter.aumentarCont(i);
           System.out.println(counter+" "+Thread.currentThread().getName());
           try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        }
     }
}
