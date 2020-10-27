package myCollectionTypePropertiesSample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppCollectionTypePropertiesSample {

	public static void main(String[] args) {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("conf/beans/AppBean.xml");
		
		Motorcycle motor = appCtx.getBean("motor", Motorcycle.class);
		
		System.out.println(motor);
		
		Motorcycle motorwithproperty = (Motorcycle) appCtx.getBean("motorwithproperty");
		
		System.out.println(motorwithproperty);
		
		Car car = appCtx.getBean("car", Car.class);
		
		System.out.println(car);
		
	Car carwithcollection = appCtx.getBean("carwithcollection", Car.class);
		
		System.out.println(carwithcollection);

		
		
		
	}                               
}
