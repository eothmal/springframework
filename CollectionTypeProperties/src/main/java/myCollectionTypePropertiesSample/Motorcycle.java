package myCollectionTypePropertiesSample;

public class Motorcycle {
	private String name;

	@Override
	public String toString() {
		return "Motorcylce: [" + (name != null? "name " + name: "") + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
