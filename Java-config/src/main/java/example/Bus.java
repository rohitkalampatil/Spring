package example;

import org.springframework.beans.factory.annotation.Value;

public class Bus implements Vehicle {
	
	private DiscountService discountService;
	@Value("${busMrp}")
	private int mrp;
	
	public int getMrp() {
		return mrp;
	}

	public Bus(DiscountService discountService) {
		this.discountService = discountService;
	}
	
	public String getDiscountMessage() {
		return this.discountService.getDiscountMessage();
	}

	@Override
	public String getMiledge() {
		// TODO Auto-generated method stub
		return "Bus miledge :- 30kmpl";
	}


}
