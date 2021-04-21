package com.mousumi.learning.jpa.jpain10steps.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mousumi.learning.jpa.jpain10steps.entity.User;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

	private final static Logger log=LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User user=new User("Jill","Admin");
		userRepository.save(user);
		log.info("New user inserted: "+user);
		
		Optional<User> findUserOne=userRepository.findById(1L);
		log.info("Retrieved User: "+findUserOne);
		
		List<User> users=userRepository.findAll();
		log.info("All users: "+users);
	}

}
