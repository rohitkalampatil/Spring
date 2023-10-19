package example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("example")
@PropertySource("car.properties")	// to  import property file
public class Config {
	// instead of writing @component on class to make bean we can define bean in config class also
	
	// in Bus.java constructor injection is used hence passing festivalDiscountService() while creating Bus obj
	
	@Bean
	public Vehicle bus() {
		Bus bus = new Bus(festivalDiscountService());
		return bus;
	}
	@Bean
	public DiscountService festivalDiscountService() {
		FestivalDiscountService festivalDiscountService = new FestivalDiscountService();
		return festivalDiscountService;
	}
	

}
