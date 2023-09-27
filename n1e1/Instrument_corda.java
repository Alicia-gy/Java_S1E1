package n1e1;

public class Instrument_corda extends Instrument {
	
	public Instrument_corda(String name, int price) {
		super(name, price);
	}
	
	//methods
	public void tocar() {
		System.out.println("Està sonant un instrument de corda");
	}

}
