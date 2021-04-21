package com.mousumi.learning.jpa.jpain10steps.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mousumi.learning.jpa.jpain10steps.entity.User;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

	private final static Logger log=LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
	@Autowired
	UserDAOService userDaoService;
	
	@Override
	public void run(String... args) throws Exception {
		User user=new User("Jack","Admin");
		long id=userDaoService.insert(user);
		
		log.info("New User is created: "+user);
	}

}
