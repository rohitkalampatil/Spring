package example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Vehicle vehicle1 = context.getBean("car", Vehicle.class);
		System.out.println(vehicle1.getMiledge());
		System.out.println(vehicle1.getDiscountMessage());
	}

}
