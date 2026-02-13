package com.ashutosh.saas;

import com.ashutosh.saas.entity.User;
import com.ashutosh.saas.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MultiTenantSaasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiTenantSaasApplication.class, args);
	}

    @Bean
    CommandLineRunner test(UserRepository userRepository) {
        return args -> {
            User user = new User();
            user.setName("Ashutosh");
            user.setEmail("ashutosh.aec75@gmail.com");

            userRepository.save(user);

            System.out.println("User saved!");
        };
    }
}
