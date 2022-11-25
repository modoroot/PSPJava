package tema2.sincro;

public class Contador{

    int count = 0;
   
    public void aumentarCont(int value){
      this.count += value;
    }

	@Override
	public String toString() {
		return "Contador [c=" + count + "]";
	}
    
    
}
