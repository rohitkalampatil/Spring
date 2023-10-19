package example;

public class Car implements Vehicle {
	
	private String brandName;
	private DiscountService discountService;
	private Double price;
	
	public Car() {

	}

	public Car(DiscountService discountService) {

		this.discountService = discountService;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public DiscountService getDiscountService() {
		return discountService;
	}

	public void setDiscountService(DiscountService discountService) {
		this.discountService = discountService;
	}
	
	public Double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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
