package example;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

	@Override
	public String getMiledge() {
		// TODO Auto-generated method stub
		return "20kmpl";
	}
	

}
