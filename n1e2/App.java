package n1e2;

public class App {
	
	public static void main(String[] args) {
		
		Coche.frenar();

		Coche coche1 = new Coche(50);
		coche1.accelerar();
		
		//se puede llamar al metodo estatico sin necesidad de crear un objeto, pero para llamar al metodo no estatico es necesario crear uno 
	}

}
