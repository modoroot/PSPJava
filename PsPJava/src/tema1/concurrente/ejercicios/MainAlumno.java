package tema1.concurrente.ejercicios;
/**
 * Clase que no utiliza conceptos de programación
 * concurrente para ejecutar el código
 * @author amna
 * @version 1.0
 */
public class MainAlumno {

	public static void main(String[] args) {
		Alumno alumno = new Alumno();
		alumno.alumGenerador();
		long init = System.currentTimeMillis();
		alumno.alumMedia();
		alumno.alumMayoresVeintiCinco();
		alumno.alumEntreDieciNueveVeintiCinco();
		alumno.alumDieciNueveAnios();
		long fin = System.currentTimeMillis();
		long tiempo = fin - init;
		//4-5 ms
      System.out.println(tiempo +" ms");
	}

}
