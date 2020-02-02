package com.SPN.Config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;
	@Autowired
	private UserDetailsService jwtUserDetailsService;
	@Autowired
	private JwtRequestFilter jwtRequestFilter;
	
	//
	@Autowired
//	 private DataSource dataSource;
//	   @Bean
//	    @ConfigurationProperties("spring.datasource")
//	    public DataSource ds() {
//	        return DataSourceBuilder.create().build();
//	    }
	    
	//
	
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		// configure AuthenticationManager so that it knows from where to load
		// user for matching credentials
		// Use BCryptPasswordEncoder
		//
//		   auth.jdbcAuthentication().dataSource(dataSource)
//           .authoritiesByUsernameQuery("select username, role from gestionuser where username=?")
//           .usersByUsernameQuery("select username, password, 1 as enabled  from gestionuser where username=?");
		   //
		
		auth.userDetailsService(jwtUserDetailsService).passwordEncoder(passwordEncoder());
	}	
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}
	

	
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		// We don't need CSRF for this example
//		httpSecurity.cors().and().
		httpSecurity.cors().and()
		.csrf().disable()
				// dont authenticate this particular request
//		        .authorizeRequests().antMatchers("/medcin/**").access("hasRole('medcin') or hasRole('admin')")
//		        .and().authorizeRequests().antMatchers("/patient/**").hasAuthority("patient").and().	        
				.authorizeRequests().antMatchers("/api/authenticate").permitAll()
				
//				.authorizeRequests().antMatchers("/swagger-ui.html").permitAll()
//				.and().authorizeRequests().antMatchers("/api/login/**").permitAll()
//		          .antMatchers("/medcin").hasRole("medcin")
//			      .antMatchers("/patient").hasRole("patient").and()
//			    .antMatchers("/categories/**").authenticated()
//			    .antMatchers("/**").hasRole("admin")
//			    .antMatchers("/medcin/**").hasRole("medcin")
//			    .antMatchers("/patient").hasRole("patient")
//			    .antMatchers("/medcin/**").hasAnyRole("medcin", "patient")
//			    .antMatchers("/api/public/test1").hasAuthority("ACCESS_TEST1")
				// all other requests need to be authenticated
				.anyRequest().authenticated().and().
				// make sure we use stateless session; session won't be used to
				// store user's state.
				exceptionHandling().authenticationEntryPoint(jwtAuthenticationEntryPoint).and()
				.sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
// Add a filter to validate the tokens with every request
		httpSecurity.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
	}
}