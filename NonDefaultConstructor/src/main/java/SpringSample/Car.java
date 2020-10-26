package SpringSample;

public class Car {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public Car() {
	}
	
	public Car(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "I am Car with four wheels " + (name !=null? name:"");
	}
	
	

}
