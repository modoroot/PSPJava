package tema1.concurrente.ejercicios;

import java.util.ArrayList;
/**
 * Clase que define las propiedades, getters-setters, constructores
 * de los alumnos
 * @author amna
 * @version 1.0
 */
public class Alumno {
	private int id;
	private int edad;
	private ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();

	public Alumno() {
	}

	public Alumno(int id, int edad) {
		this.id = id;
		this.edad = edad;

	}

	/**
	 * Método que genera alumnos con su ID y edad de forma aleatoria
	 */
	public void alumGenerador() {
		for (int i = 0; i < 4000; i++) {
			this.id = i;
			this.edad = (int) Math.floor(Math.random() * (40 - 19 + 1) + 19);
			listaAlumnos.add(new Alumno(this.id, this.edad));
//			 System.out.println("ID: " + listaAlumnos.get(i).getId() + " EDAD: " +
//			 listaAlumnos.get(i).getEdad());
		}
	}

	public void alumMedia() {
		double media = 0;
		for (int i = 0; i < listaAlumnos.size(); i++) {
			media += listaAlumnos.get(i).getEdad();
		}
		System.out.println("Media de edad: " + media / listaAlumnos.size());

	}

	public void alumMayoresVeintiCinco() {
		int n = 0;
		for (int i = 0; i < listaAlumnos.size(); i++) {
			if (listaAlumnos.get(i).getEdad() > 25) {
				n++;
			}
		}
		System.out.println("Alumnos mayores de 25: " + n);
	}

	public void alumEntreDieciNueveVeintiCinco() {
		int n = 0;
		for (int i = 0; i < listaAlumnos.size(); i++) {
			if (listaAlumnos.get(i).getEdad() >= 19 && listaAlumnos.get(i).getEdad() <= 25) {
				n++;
			}
		}
		System.out.println("Alumnos entre 19 y 25 años: " + n);
	}
	
	public void alumDieciNueveAnios() {
		System.out.println("Lista de alumnos con 19 años: ");
		for (int i = 0; i < listaAlumnos.size(); i++) {
			if (listaAlumnos.get(i).getEdad() == 19) {
				System.out.println("ID: "+listaAlumnos.get(i).getId());
			}
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public ArrayList<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}

}
