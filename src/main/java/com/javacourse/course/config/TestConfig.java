package com.javacourse.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.javacourse.course.entities.User1;
import com.javacourse.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

//	injeção de dependência por meio de um mecanismo do framework implícito. Deve ser uma dependência fraca. Formas: construtor, padrão fábrica, set
	// Deve ter uma dependência para o UserRepository

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		User1 u1 = new User1(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User1 u2 = new User1(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		

	}

}
