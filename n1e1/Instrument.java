package n1e1;

public class Instrument {
	
	protected String name;
	protected int price;
	
	//constructors
	public Instrument(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	//methods
	public void tocar() {
		System.out.println("Està sonant un instrument");
	}
	
	//setters y getters
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
