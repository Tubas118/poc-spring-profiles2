package poc.maven.spring.springprofiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringProfilesApplicationConfig {

	@Value("${server.port:8083}")
	public int port;
	
	@Value("${app.environment:none}")
	public String environment;
	
	@Value("${app.other:none}")
	public String other;

	@Override
	public String toString() {
		return "SpringProfilesApplicationConfig [port=" + port + ", environment=" + environment + ", other=" + other + "]";
	}
	
}
