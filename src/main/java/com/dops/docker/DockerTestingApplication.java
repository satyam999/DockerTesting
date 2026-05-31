package com.dops.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerTestingApplication {

	@GetMapping("/dockerMessgae")
	public String getDockerMessgae() {
		return "Docker Testing11";
	}
	public static void main(String[] args) {
		SpringApplication.run(DockerTestingApplication.class, args);
	}

}
