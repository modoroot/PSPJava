package tema2.sincro.modelos;


/**
 * Clase sincronizador de los productos que se producen
 * y se consumen
 * @author amna
 * @version 1.0
 */
public class Cola {
    private int numero;
    //inicialmente cola vacía
    private boolean disponible = false;

    /**
     * Método que consume un producto mientras
     * disponible es falso. Si es verdadero, notifica a los hilos
     * a la espera de que termine este hilo
     * @return número correspondiente según el producto o consumidor
     */
    public synchronized int get(){
        while(!disponible){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        notify();
        this.disponible = false;

        return this.numero;
    }

    /**
     * Método que crea un producto para ser consumido.
     * Una vez no haya disponibles, asigna un número a la variable
     * valor según la posición en la cola de productos y asigna
     * el valor de disponible a true
     * @param valor valor en la cola
     */
    public synchronized void put(int valor){
        while(disponible){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        this.numero = valor;
        notify();
        this.disponible = true;
    }



}
