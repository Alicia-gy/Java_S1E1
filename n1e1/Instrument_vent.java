package n1e1;

public class Instrument_vent extends Instrument {
	
	public Instrument_vent(String name, int price) {
		super(name, price);
	}
	
	//methods
	public void tocar() {
		System.out.println("Està sonant un instrument de vent");
	}

}
