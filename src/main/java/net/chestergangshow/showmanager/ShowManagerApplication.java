package net.chestergangshow.showmanager;

import net.chestergangshow.showmanager.entities.auth.CustomUserDetail;
import net.chestergangshow.showmanager.entities.auth.Role;
import net.chestergangshow.showmanager.entities.auth.User;
import net.chestergangshow.showmanager.repositories.auth.UserRepository;
import net.chestergangshow.showmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;

@SpringBootApplication
public class ShowManagerApplication {

  @Autowired
  private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(ShowManagerApplication.class, args);
	}

	@Autowired
	public void authenticationManager(AuthenticationManagerBuilder builder, UserRepository repository, UserService service) throws Exception {
	  if (repository.count() == 0) {
	    service.save(new User("admin", "nimda", Arrays.asList(new Role("ADMIN"))));
    }

	  builder.userDetailsService(userDetailsService(repository)).passwordEncoder(passwordEncoder);
  }

  private UserDetailsService userDetailsService(UserRepository repository) {
	  return username -> new CustomUserDetail(repository.findByUsername(username));
  }
}
