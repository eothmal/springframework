package springsample.set.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSpringSetProperty {
	
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("conf/bean/appContext.xml");
		
		Car car = appContext.getBean("car", Car.class);
		Motorcycle motorcycle = (Motorcycle) appContext.getBean("motorcycle");
		
		System.out.println(car.toString());
		System.out.println(motorcycle.toString());
		
		Car carWithWheelNo = (Car) appContext.getBean("carWithWheelNo");
		Motorcycle motorcycleWithWheelNo = (Motorcycle) appContext.getBean("motorcycleWithWheelNo");
		
		System.out.println(carWithWheelNo.toString());
		System.out.println(motorcycleWithWheelNo.toString());
	}

}
