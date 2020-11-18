package SpringPNameSample;

public class Car {
	private String model;
	private String make;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", make=" + make + "]";
	}


//	public String toString() {
//		return "I am a car with four wheels";
//	}

}
