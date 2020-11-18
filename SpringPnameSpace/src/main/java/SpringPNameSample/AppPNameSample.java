package SpringPNameSample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppPNameSample {
	public static void main(String[] args) {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("conf/beans/appContext.xml");
		Car car = appCtx.getBean("car",Car.class);
		Motorcycle motorcycle = appCtx.getBean("motorcycle", Motorcycle.class);
		
		System.out.println(car);
		System.out.println(motorcycle);
		
	}

}
