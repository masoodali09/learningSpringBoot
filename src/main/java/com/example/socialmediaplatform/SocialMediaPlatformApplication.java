package com.example.socialmediaplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example.socialmediaplatform")
@EnableJpaRepositories({"com.example.socialmediaplatform.repository"})
@ComponentScan(basePackages = "com.example.socialmediaplatform")
public class SocialMediaPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialMediaPlatformApplication.class, args);
	}

}
