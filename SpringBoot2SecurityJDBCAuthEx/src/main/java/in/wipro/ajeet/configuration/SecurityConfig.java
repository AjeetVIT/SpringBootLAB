package in.wipro.ajeet.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.RequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatchers;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfiguration {
	
@Autowired
	private DataSource dataSource;
@Autowired
private BCryptPasswordEncoder passwordEncoder;
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
	auth.jdbcAuthentication()
	.dataSource(dataSource)
	.usersByUsernameQuery("select uname,upwd,uenabled from usertab where uname=?")
	.authoritiesByUsernameQuery("select uname,role from usertab where uname=?")
	.passwordEncoder(passwordEncoder)
	;
	}
	protected void configure(HttpSecurity http)throws Exception{
		http.authorizeRequests()
		.requestMatchers("/home").permitAll()
		.requestMatchers("/welcome").authenticated()
		.requestMatchers("/admin").hasAuthority("ADMIN")
		.requestMatchers("/emp").hasAnyAuthority("EMPLOYEE")
		.requestMatchers("/std").hasAnyAuthority("STUDENT")
		.requestMatchers()
		;

}
}