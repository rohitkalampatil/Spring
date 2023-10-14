package example;

public class Bus implements Vehicle {

	private String brandName;
	private DiscountService discountService;
	private Double price;

	public Bus() {

	}

	public Bus(DiscountService discountService) {

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
		return "30kmpl";
	}

	@Override
	public String getDiscount() {
		System.out.print("Bus Discount :");
		return this.discountService.getDiscountMessage();
	}
}
