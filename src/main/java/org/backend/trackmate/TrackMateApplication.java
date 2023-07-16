package org.backend.trackmate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class TrackMateApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrackMateApplication.class, args);
	}

}
