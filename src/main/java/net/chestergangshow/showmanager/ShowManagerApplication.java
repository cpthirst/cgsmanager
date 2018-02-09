package net.chestergangshow.showmanager;

import net.chestergangshow.showmanager.entities.auth.CustomUserDetail;
import net.chestergangshow.showmanager.repositories.auth.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@SpringBootApplication
public class ShowManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShowManagerApplication.class, args);
	}

	@Autowired
	public void authenticationManager(AuthenticationManagerBuilder builder, UserRepository repo) throws Exception {
	  builder.userDetailsService(new UserDetailsService() {
      @Override
      public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return new CustomUserDetail(repo.findByUsername(s));
      }
    });
  }
}
