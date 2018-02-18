package co.simplon.hote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class MaisonHoteApplication extends SpringBootServletInitializer{

	

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MaisonHoteApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(MaisonHoteApplication.class, args);
	}
}
