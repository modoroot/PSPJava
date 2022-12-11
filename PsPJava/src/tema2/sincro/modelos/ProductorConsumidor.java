package tema2.sincro.modelos;

/**
 * Clase lanzadora de los hilos sincronizados
 * de las clases Productor y Consumidor gracias a
 * la clase Cola
 * @author amna
 * @version 1.0
 */
public class ProductorConsumidor {
    public static void main(String[] args) {
        Cola cola = new Cola();
        Productor productor = new Productor(cola, 1);
        Consumidor consumidor = new Consumidor(cola, 1);
        productor.start();
        consumidor.start();
    }
}

