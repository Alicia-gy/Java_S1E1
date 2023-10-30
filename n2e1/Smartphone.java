package n2e1;

public class Smartphone extends Telefon implements Camera, Rellotge {
	
	public Smartphone(String marca, String model) {
		super(marca, model);
	}
	
	//methods
	public void fotografiar() {
		System.out.println("S'esta fent una foto");
	}
	
	public void alarma() {
		System.out.println("Esta sonant l'alarma");
	}

}
