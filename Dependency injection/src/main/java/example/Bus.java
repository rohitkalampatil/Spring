package example;

public class Bus implements Vehicle {
	
	public Bus(DiscountService discountService) {
		
		this.discountService = discountService;
	}


	private DiscountService discountService;

	
	public String getMiledge() {
		return "30kmpl";
	}


	@Override
	public String getDiscount() {
		System.out.print("Bus Discount :");
		return this.discountService.getDiscountMessage();
	}
}
