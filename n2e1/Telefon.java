package n2e1;

public class Telefon {
	
	protected String marca;
	protected String model;
	
	public Telefon(String marca, String model) {
		this.marca = marca;
		this.model = model;
	}
	
	//methods
	public void trucar(String numero) {
		System.out.println("S'esta trucant al numero " + numero);
	}

}
