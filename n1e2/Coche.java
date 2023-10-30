package n1e2;

public class Coche {
	
	private static final String marca = "Marca";
	private static String model = "Model1";
	private final int potencia;
	
	public Coche(int potencia) {
		this.potencia = potencia;
		model = "Model2";
	}

	//"marca" tiene que ser asignada al crearla no puede ser modificada
	//"model" tiene que ser asignada al crearla pero puede ser modificada
	//"potencia" no tiene que ser necesariamente asignada al crearla, pero una vez asignada no puede ser modificada
	
	
	//methods
	static void frenar() {
		System.out.println("El vehicle esta frenant");
	}
	
	void accelerar() {
		System.out.println("El vehicle esta accelerant");
	}
}
