package SpringPNameSample;

public class Motorcycle {
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
		return "Motorcycle [model=" + model + ", make=" + make + "]";
	}



//	public String toString() {
//		return "I am a motorcylce with two wheels and making load noise";
//	}

}
