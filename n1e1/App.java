package n1e1;

public class App {

	public static void main(String[] args) {
		
		//prueba de clases
		Instrument obj1 = new Instrument_corda("Corda", 20);
		obj1.tocar();
		
		Instrument obj2 = new Instrument_vent("Vent", 10);
		obj2.tocar();
		
		Instrument obj3 = new Instrument_percussio("Percussió", 50);
		obj3.tocar();
		
	}
	
	//prueba de bloque estatico inicializacion
	static {
		System.out.println("Inicializando");
	}

}
