package example;

public class MyApp {

	public static void main(String[] args) {
	/* calling Car and Bus Object Manually 
	 * to use Spring add Spring-core and Spring-context 
	 * Dependency to pom.xml
	 */
		Vehicle vehicle = new Bus();
		System.out.println(vehicle.getMiledge());
		
	/*
	 * IoC-> Inversion of Control container used to externalize object creation  
	 * Ioc responsible to instantiate, configure, assemble the objecb
	 * 
	 * we can configure ioc container in following ways
	 * 
	 * XML
	 * Annotation
	 * Java configuration class
	 */
	}

}
