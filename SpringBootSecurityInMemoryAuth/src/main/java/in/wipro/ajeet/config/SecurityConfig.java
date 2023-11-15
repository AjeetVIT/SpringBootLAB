//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
package in.wipro.ajeet.config;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfiguration{
	
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication().withUser("Ajeet").password("{noop}ajeet").authorities("ADMIN");
		auth.inMemoryAuthentication().withUser("Amit").password("{noop}amit").authorities("EMPLOYEE");
		auth.inMemoryAuthentication().withUser("Kumar").password("{noop}kumar").authorities("STUDENT");
	}
	
	
	protected void configure(HttpSecurity http) throws Exception{
		
		http.authorizeRequests()
		.requestMatchers("/home").permitAll()
		.requestMatchers("/welcome").authenticated()
		.requestMatchers("/admin").hasAuthority("ADMIN")
		.requestMatchers("/emp").hasAuthority("EMPLOYEE")
		.requestMatchers("").hasAuthority("STUDENT")
		.and()
		.formLogin()
		.defaultSuccessUrl("/welcome",true)
		.and()
		.logout()
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		;
}}