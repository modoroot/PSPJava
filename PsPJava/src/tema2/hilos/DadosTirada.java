package tema2.hilos;

import java.util.ArrayList;

public class DadosTirada {
	private ArrayList<Integer> tiradaNum = new ArrayList<Integer>();

	public static void main(String[] args) {
		DadosTirada dadosTirada = new DadosTirada();
		Runnable tirada = () -> {
			int suertes = (int) (Math.random()*6+1);
			dadosTirada.tiradaNum.add(suertes);
			System.out.println("Jugador: "+Thread.currentThread().getName()+" Tirada: "+suertes);
		};
		
		for (int i = 0; i < 3; i++) {
			Thread h = new Thread(tirada);
			h.start();
			try {
				h.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		
		
	}

	public DadosTirada() {}

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
