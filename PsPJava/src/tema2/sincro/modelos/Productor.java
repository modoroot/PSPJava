package tema2.sincro.modelos;

/**
 * Clase productora de los productos
 * @author amna
 * @version 1.0
 */
public class Productor extends Thread {
    private Cola cola;
    private int num;

    /**
     * Constructor de la clase
     * @param c
     * @param num
     */
    public Productor(Cola c, int num) {
        cola = c;
        this.num = num;
    }

    /**
     * Método override para los hilos creados
     */
    public void run() {
        for (int i = 0; i < 5; i++) {
            cola.put(i);
            System.out.println("Productor: " + this.num
                    + " put: " + i);
        }
    }
}
