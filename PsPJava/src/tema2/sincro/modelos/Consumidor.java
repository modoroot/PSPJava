package tema2.sincro.modelos;

/**
 * Clase consumidora de los productos.
 * @author amna
 * @version 1.0
 */
public class Consumidor extends Thread {
    private Cola cola;
    private int num;

    /**
     * Constructor de la clase
     * @param c objeto instanciado de Cola
     * @param num número del consumidor
     */
    public Consumidor(Cola c, int num) {
        cola = c;
        this.num = num;
    }

    /**
     * Método override para los hilos creados
     */
    public void run() {
        int val = 0;
        for (int i = 0; i < 5; i++) {
            val = cola.get();
            System.out.println("Consumidor: " + this.num
                    + " get: " + val);
        }
    }
}
