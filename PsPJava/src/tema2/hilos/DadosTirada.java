package tema2.hilos;

import java.util.ArrayList;
/**
 * Clase que crea hilos a partir de la interfaz Runnable
 * utilizando expresiones lambda para crear un juego
 * de tiradas de dados
 * @author amna
 * @version 1.0
 */
public class DadosTirada {
	private ArrayList<Integer> tiradaNum = new ArrayList<Integer>();

	public static void main(String[] args) {
		DadosTirada dadosTirada = new DadosTirada();
		ThreadGroup tg = new ThreadGroup("tiradas");
		//implementación interfaz Runnable a partir de expresiones lambda
		Runnable tirada = () -> {
			int suertes = (int) (Math.random() * 6 + 1);
			//se añade a un ArrayList el resultado aleatorio entre 1 y 6
			dadosTirada.tiradaNum.add(suertes);
			System.out.println(Thread.currentThread().getName() + " Tirada: " + suertes);
		};
		for (int i = 0; i < 3; i++) {
			//instanciación de un objeto Thread y lo añade al ThreadGroup creado
			Thread h = new Thread(tg,tirada,"Jugador "+i);
			//inicio del hilo
			h.start();
			try {
				//pone en espera al hilo hasta que muera
				h.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("---------------------"+"\n"+"El juego ha terminado");
		
		System.out.println("----------------------------");
		if (dadosTirada.tiradaNum.get(0) > dadosTirada.tiradaNum.get(1)
				&& dadosTirada.tiradaNum.get(0) > dadosTirada.tiradaNum.get(2)) {
			System.out.println("Ganó el Jugador 0");
		} else if (dadosTirada.tiradaNum.get(1) > dadosTirada.tiradaNum.get(0)
				&& dadosTirada.tiradaNum.get(1) > dadosTirada.tiradaNum.get(2)) {
			System.out.println("Ganó el Jugador 1");
		} else if (dadosTirada.tiradaNum.get(2) > dadosTirada.tiradaNum.get(0)
				&& dadosTirada.tiradaNum.get(2) > dadosTirada.tiradaNum.get(1)) {
			System.out.println("Ganó el Jugador 2");
		} else {
			System.out.println("Empate");
		}
		System.out.println("----------------------------");
		System.out.println("Suma resultados: "
				+ (dadosTirada.tiradaNum.get(0) + dadosTirada.tiradaNum.get(1) + dadosTirada.tiradaNum.get(2)));
	}

	public DadosTirada() {
	}

	public DadosTirada(ArrayList<Integer> tiradaNum) {
		this.tiradaNum = tiradaNum;
	}

	public ArrayList<Integer> getTiradaNum() {
		return tiradaNum;
	}

	public void setTiradaNum(ArrayList<Integer> tiradaNum) {
		this.tiradaNum = tiradaNum;
	}

}
