package dmacc;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
//program allows for adding days plus meals and calories for that day
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


import dmacc.beans.FoodDay;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.FoodDayRepository;

@SpringBootApplication
public class Week8AssessmentDayFoodApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Week8AssessmentDayFoodApplication.class, args);
	}
	@Autowired
	FoodDayRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		// Using the bean inside the config
		FoodDay f = appContext.getBean("foodDay", FoodDay.class);
		f.setDayName("Monday");
		f.setBreakfast("Eggs");
		f.setDayCalories(350);
		repo.save(f);
		
		// Creating a bean to use – not managed by Spring
		FoodDay d = new FoodDay("Tuesday", "Waffle", "Sandwich", "Pot Roast", 2700);
		repo.save(d);
		List<FoodDay> allMyFoodDays = repo.findAll();
		for (FoodDay food : allMyFoodDays) {
			System.out.println(food.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}

}
