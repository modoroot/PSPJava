package tema2.sincro.modelos;

public class Cola {
    private int numero;
    //inicialmente cola vacía
    private boolean disponible = false;

    public int get() {
//hay número en la cola
        if (this.disponible) {
//se pone cola vacía
            this.disponible = false;
//se devuelve
            return this.numero;
        }
//no hay número disponible,
//cola vacía
        return -1;
    }

    public void put(int valor) {
//coloca valor en la cola
        numero = valor;
//disponible para consumir,
//cola llena
        disponible = true;
    }
}
