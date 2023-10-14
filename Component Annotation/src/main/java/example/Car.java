package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	@Autowired
	private DiscountService discountService;
	
	/// Autowired is an annotation for dependency injection
	// spring scan  for class/interface -> folowing is constructor injection
//	@Autowired
//	public Car(DiscountService discountService) {
//		this.discountService=discountService;
//	}
	@Override
	public String getMiledge() {
		// TODO Auto-generated method stub
		return "20kmpl";
	}
//	@Autowired
//	public void setDiscountService(DiscountService discountService) {
//		this.discountService = discountService;
//	}

	public String  getDiscountMessage() {
		return this.discountService.getDiscountMessage();
	}
}
