package poc.maven.spring.springprofiles;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.SneakyThrows;

@SpringBootApplication
public class SpringProfilesApplication {
	
	@Autowired
	private SpringProfilesApplicationConfig config;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringProfilesApplication.class, args);
	}

	@PostConstruct
	@SneakyThrows
    private void postConstruct() {
		System.out.printf("%s\n", config.toString());
	}
	
}
