package n1e1;

public class Instrument_percussio extends Instrument {
	
	public Instrument_percussio(String name, int price) {
		super(name, price);
	}
	
	//methods
	public void tocar() {
		System.out.println("Està sonant un instrument de percussió");
	}

}
