package myCollectionTypePropertiesSample;

import java.util.List;
import java.util.Map;

public class Car {
	
	private List<String> brands;
	private Map<String, String> brandMadeMap;
	public void setBrands(List<String> brands) {
		this.brands = brands;
	}
	public void setBrandMadeMap(Map<String, String> brandMadeMap) {
		this.brandMadeMap = brandMadeMap;
	}
	@Override
	public String toString() {
		return "Car [brands=" + (brands !=null? brands:"[]")  + ", brandMadeMap=" + (brandMadeMap != null?  brandMadeMap: "[]") + "]";
	}
	
	
	

}
