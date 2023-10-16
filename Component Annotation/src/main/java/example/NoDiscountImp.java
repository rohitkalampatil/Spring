package example;

import org.springframework.stereotype.Component;

@Component
public class NoDiscountImp implements DiscountService {

	@Override
	public String getDiscountMessage() {
		// TODO Auto-generated method stub
		return "No Discount";
	}

}
