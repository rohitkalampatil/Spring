package example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Vehicle vehicle1 = context.getBean("myBus", Vehicle.class);
		Vehicle vehicle2 = context.getBean("myBus", Vehicle.class);

		System.out.println(vehicle1 == vehicle2);	
		
		// true scope default = singleton
		// false after declr scope="prototype" in config.xml
		
		System.out.println(vehicle1.getMiledge());
		System.out.println(vehicle1.getDiscount());
		System.out.println(vehicle1.getBrandName());
		System.out.println(vehicle1.getPrice());
	}

}
