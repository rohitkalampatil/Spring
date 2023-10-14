package example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Vehicle vehicle = context.getBean("myBus",Vehicle.class);
		System.out.println(vehicle.getMiledge());
		System.out.println(vehicle.getDiscount());
		System.out.println(vehicle.getBrandName());
		System.out.println(vehicle.getPrice());
	}

}
