package mavenTestingProjectController;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("mavenTestingProjectController")
public class MyConfiguration {
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		return new InternalResourceViewResolver("/WEB-INF/view/", ".jsp");
		
	} 

}
