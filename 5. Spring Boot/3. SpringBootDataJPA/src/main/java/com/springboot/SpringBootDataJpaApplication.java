package com.springboot;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.eitity.User;
import com.springboot.repository.UserRepository;

@SpringBootApplication
public class SpringBootDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDataJpaApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
//		User user = new User();
//		
//		user.setFirstName("Darshan");
//		user.setLastName("Khairnar");
//		user.setPincode(423203);
//		user.setCity("Malegaon");
//		
//		
//		userRepository.save(user);
//		
//		User user1 = new User();
//		user1.setFirstName("Prasad");
//		user1.setLastName("Khairnar");
//		user1.setCity("Nashik");
//		user1.setPincode(423203);
//		
//		User user2 = new User();
//		user2.setFirstName("Khushi");
//		user2.setLastName("Khairnar");
//		user2.setCity("Malegaon");
//		user2.setPincode(403232);
//		
//		List<User> userList = List.of(user1,user2);
//		
//		userRepository.saveAll(userList);
		
//		User user = userRepository.findById(2).orElse(null);
//		
//		user.setCity("Pune");
//		
//		userRepository.save(user);
		
//		userRepository.delete(user);
		
//		List<User> userList = (List<User>) userRepository.findAll();
//		
//		userList.forEach(user ->{
//			System.out.println(user);
//		});
		
//		User user = userRepository.findByFirstName("Darshan");
//		
//		System.out.println(user);
		
//		User user = userRepository.findByFirstNameAndLastName("Aakash", "Khairnar");
//		System.out.println(user);	
		
//		User user = userRepository.getUserByFirstName("Darshan");
//		System.out.println(user);
		
//		List<User> userList = userRepository.getAllUsers();
//		
//		userList.forEach(user -> {
//			System.out.println(user);
//		});
		
		User user3 = userRepository.getUser("Darshan");
		
		System.out.print(user3);
				
		
		
		System.out.println("Hello Spring Data JPA Application");
	}

}
