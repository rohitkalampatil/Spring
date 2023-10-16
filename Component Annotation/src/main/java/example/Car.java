package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
	
@Component
public class Car implements Vehicle {
	
	@Autowired
	@Qualifier("noDiscountImp")
	private DiscountService discountService;
	
	@Value("${carMrp}")
	private int mrp;
	
	/// Autowired is an annotation for dependency injection
	// spring scan  for class/interface -> folowing is constructor injection
	
//	@Autowired
//	public Car(@Qualifier("festivalDiscountServiceImpl") DiscountService discountService) {
//		this.discountService=discountService;
//	}
	
	
//	@Autowired
//	@Qualifier("noDiscountImp")
//	public void setDiscountService(DiscountService discountService) {
//		this.discountService = discountService;
//	}
	
	public int getMrp() {
		return mrp;
	}



	@Override
	public String getMiledge() {
		// TODO Auto-generated method stub
		return "20kmpl";
	}
	


	public String  getDiscountMessage() {
		return this.discountService.getDiscountMessage();
	}
}
