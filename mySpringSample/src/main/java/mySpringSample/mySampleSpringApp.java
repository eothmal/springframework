package mySpringSample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class mySampleSpringApp {

	public static void main(String[] args) {

//		Car car = new Car();
//		Motorcycle motorcycle = new Motorcycle();
		
		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
		
		Car car = appContext.getBean("car", Car.class);
		Motorcycle motorcycle = (Motorcycle) appContext.getBean("motorcycle");
		
		System.out.println(car.toString());
		System.out.println(motorcycle.toString());
	}

}
