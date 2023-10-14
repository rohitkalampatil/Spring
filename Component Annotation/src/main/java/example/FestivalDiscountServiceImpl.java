package example;

import org.springframework.stereotype.Component;

@Component
public class FestivalDiscountServiceImpl implements DiscountService {

	@Override
	public String getDiscountMessage() {
		// TODO Auto-generated method stub
		return "Contact to customer care!";
	}

}
