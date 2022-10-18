package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.FoodDay;

/**
 * @author kenne-krcutkomp CIS175 - Fall 2022
 */
@Configuration
public class BeanConfiguration {

	@Bean
	public FoodDay foodDay() {
		FoodDay bean = new FoodDay();
		return bean;
	}
}
