package tema1.procesos;

/**
 * Solución propuesta a la actividad 1.12
 * Se usa el flujo de salida y entrada estándar para comunicar
 * dos procesos
 * @author Rafa
 * @version 1.0
 */
public class RecibeCadena {
	private static final int NUM_REP = 5;

	public static void main(String[] args) {
		// Si tiene un parámetro (String) aunque al ser un arrray de String
		// ya sabemos que lo es:
		if(args.length == 1 && args[0] instanceof String) {
			for(int i = 0; i < NUM_REP; i++) {
				System.out.println(args[0]);
			}
			System.exit(0);
		// Si no le llega ninguno:
		} else if (args.length == 0) {
			//la JVM es la que se encarga de devolver al SO el valor devuelto
			//por el proceso. Cuando se devuelven números negativos
			//calcula el complemento a 2 del mismo y no genera valores
			//correctos. Para el valor -1 en 8 bits el equivalente sería 255,
			//para -2 sería 254, y así...
			System.exit(-1);
		}
	}
}