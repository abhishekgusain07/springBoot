package gusain.abhishek.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		Vehicle v = ctx.getBean(Vehicle.class);
		v.start();
		listAllBeans(ctx);
		
		
	}
	public static void listAllBeans(ApplicationContext applicationContext) {
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        
        System.out.println("\n=== Spring Boot Beans ===");
        System.out.println("Total beans: " + beanNames.length);
        System.out.println("-------------------------");
        
        for (String beanName : beanNames) {
            Object bean = applicationContext.getBean(beanName);
            String beanType = bean.getClass().getName();
            System.out.printf("Bean: %-50s | Type: %s%n", beanName, beanType);
        }
        
        System.out.println("-------------------------\n");
    }

}
