package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

	@Autowired
	private DiscountService discountService;
	
	@Value("${carMrp}")
	private int mrp;

	@Override
	public String getMiledge() {
		// TODO Auto-generated method stub
		return "Car miledge :- 20kmpl";
	}

	@Override
	public String getDiscountMessage() {
		// TODO Auto-generated method stub
		return this.discountService.getDiscountMessage();
	}

	@Override
	public int getMrp() {
		// TODO Auto-generated method stub
		return mrp;
	}
	

}
