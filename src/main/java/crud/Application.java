package crud;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import crud.domain.Post;
import crud.domain.PostRepository;


@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
    private PostRepository repository;
	
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }

	public void run(String... arg0) throws Exception {
		
		for(int i=0;i<5;i++){
			repository.save(new Post("Message"+i));
		}
		
	}

}