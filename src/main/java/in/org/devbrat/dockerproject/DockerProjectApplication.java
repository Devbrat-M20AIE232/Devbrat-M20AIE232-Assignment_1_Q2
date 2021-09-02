package in.org.devbrat.dockerproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerProjectApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello IITians !! Welcome to the Parallel Universe ";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerProjectApplication.class, args);
	}

}
