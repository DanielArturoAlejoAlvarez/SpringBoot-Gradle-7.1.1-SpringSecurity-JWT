package com.mediasoft.services.user;

import com.mediasoft.services.user.domain.Role;
import com.mediasoft.services.user.domain.User;
import com.mediasoft.services.user.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.Date;

@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

			userService.saveUser(new User(null, "Caspar Lee", "casplee@yahoo.com","casplee","password1","https://yt3.ggpht.com/ytc/AKedOLSIiddxwkM9_HTPsxnmJneNfQwicvl18M9wXzcCVQ=s900-c-k-c0x00ffffff-no-rj",true, new Date(), new ArrayList<>()));
			userService.saveUser(new User(null, "Zoe Sugg", "zoesugg@gmail.com","zoesugg","password2","https://uploads-ssl.webflow.com/60c2316f312ff6b0fa9c945f/60db07e75e5009403c9c2d66_zoesugg.jpeg",true, new Date(),new ArrayList<>()));
			userService.saveUser(new User(null, "Pew Die Pie", "pewdiepie@yahoo.com","pewdiepie","password3","https://d3t3ozftmdmh3i.cloudfront.net/production/podcast_uploaded/5832058/5832058-1590491530961-00a7238b08613.jpg",true, new Date(),new ArrayList<>()));
			userService.saveUser(new User(null, "Jenna Marbles", "jennamar@gmail.com","jennamar","password4","https://static.wikia.nocookie.net/jenna-marbles/images/4/49/Jenna-marbles_21092.jpg/revision/latest/top-crop/width/360/height/450?cb=20210322100251",true, new Date(), new ArrayList<>()));
			userService.saveUser(new User(null, "Joe Sugg", "joesugg@yahoo.com","joesugg","password5","https://www.beano.com/wp-content/uploads/legacy/36234_joe_sugg-Instagram-4.png?quality=76&strip=all&w=887",true, new Date(),new ArrayList<>()));

			userService.addRoleToUser("casplee", "ROLE_ADMIN");
			userService.addRoleToUser("casplee", "ROLE_SUPER_ADMIN");
			userService.addRoleToUser("casplee", "ROLE_MANAGER");
			userService.addRoleToUser("casplee", "ROLE_USER");

			userService.addRoleToUser("zoesugg", "ROLE_ADMIN");
			userService.addRoleToUser("zoesugg", "ROLE_MANAGER");
			userService.addRoleToUser("zoesugg", "ROLE_USER");

			userService.addRoleToUser("pewdiepie", "ROLE_MANAGER");
			userService.addRoleToUser("pewdiepie", "ROLE_USER");

			userService.addRoleToUser("jennamar", "ROLE_MANAGER");
			userService.addRoleToUser("jennamar", "ROLE_USER");

			userService.addRoleToUser("joesugg", "ROLE_MANAGER");
			userService.addRoleToUser("joesugg", "ROLE_USER");

		};
	}
}
