package tema1.concurrente.ejercicios;

import java.util.ArrayList;

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
		for (int i = 0; i < 50; i++) {
			this.id = i;
			this.edad = (int) Math.floor(Math.random() * (40 - 19 + 1) + 19);
			listaAlumnos.add(new Alumno(this.id, this.edad));
//			 System.out.println("ID: " + listaAlumnos.get(i).getId() + " EDAD: " +
//			 listaAlumnos.get(i).getEdad());
		}
	}

	public void mediaAlum() {
		System.out.println(listaAlumnos.size());
		int n = 0;
		for (int i = 0; i < listaAlumnos.size(); i++) {
			n += listaAlumnos.get(i).getEdad();
		}
		System.out.println("Media de edad: " + n / listaAlumnos.size());
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
