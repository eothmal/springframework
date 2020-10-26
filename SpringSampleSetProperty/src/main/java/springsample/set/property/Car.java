package springsample.set.property;

public class Car {
	
	private int wheelNo;

	public int getWheelNo() {
		return wheelNo;
	}

	public void setWheelNo(int wheelNo) {
		this.wheelNo = wheelNo;
	}

	@Override
	public String toString() {
		return "Car [wheelNo=" + wheelNo + "]";
	}


}
