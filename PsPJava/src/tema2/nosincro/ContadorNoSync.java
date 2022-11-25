package tema2.nosincro;

/**
 * Clase que contiene un método para aumentar un contador
 * 
 * @author amna
 * @version 1.0
 */
public class ContadorNoSync {

	int count = 0;

	/**
	 * 
	 * @param value cantidad que aumentará el contador
	 */
	public void aumentarCont(int value) {
		this.count += value;
	}

	@Override
	public String toString() {
		return "Contador [c=" + count + "]";
	}

}
