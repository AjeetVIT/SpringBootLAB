package in.wipro.ajeet.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfiguration {
	@Autowired
private BCryptPasswordEncoder pwdEncoder;
	//authentication
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
auth.inMemoryAuthentication().withUser("A").password("B")
.authorities("ADMIN");
auth.inMemoryAuthentication().withUser("M").password("N")
.authorities("EMPLOYEE");
auth.inMemoryAuthentication().withUser("K").password("Y")
.authorities("STUDENT");
		
		
		//	auth.inMemoryAuthentication();
		/*
		 * auth.jdbcAuthentication(); 
		 * auth.userDetailsService(userDetailsService);
		 */
	}
	
	//authorization
		protected void configure(HttpSecurity http) throws Exception{
	}}
