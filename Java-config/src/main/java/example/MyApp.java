package example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Vehicle vehicle = context.getBean("car",Vehicle.class);
		Vehicle vehicle2 = context.getBean("bus",Vehicle.class);
		
		System.out.println(vehicle.getMiledge());
		System.out.println(vehicle2.getMiledge());
		System.out.println("On Bus "+vehicle2.getDiscountMessage());
		System.out.println("On Car "+vehicle.getDiscountMessage());
		System.out.println("Bus Mrp : "+vehicle2.getMrp());

	}

}
