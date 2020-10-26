package SpringSample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppNonDefaultConstrctor {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("conf/beans/appContext.xml");

		Car car = appContext.getBean("car", Car.class); //require default constructor
		
		MotorCycle motorCycle = (MotorCycle) appContext.getBean("motorcycle");
		
		Car anotherCar = appContext.getBean("carNotConstructor", Car.class);
		
		System.out.println(car.toString());
		System.out.println(motorCycle.toString());
		System.out.println(anotherCar.toString());
	}

}
