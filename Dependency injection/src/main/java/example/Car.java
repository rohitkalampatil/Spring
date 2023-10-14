package example;

public class Car implements Vehicle {

	private DiscountService discountService;

	public Car(DiscountService discountService) {

		this.discountService = discountService;
	}

	public String getMiledge() {
		return "20kmpl";
	}

	@Override
	public String getDiscount() {
		System.out.print("Car Discount :");
		return this.discountService.getDiscountMessage();
	}

}
