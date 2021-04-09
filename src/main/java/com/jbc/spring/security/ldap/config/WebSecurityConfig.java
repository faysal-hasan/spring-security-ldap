package com.jbc.spring.security.ldap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
				.authorizeRequests()
				.antMatchers("/users").hasRole("ADMIN")
				.and()
				.formLogin();
	}

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
				.ldapAuthentication()
				.userDnPatterns("uid={0},ou=people")
				.groupSearchBase("ou=groups")
				.contextSource()
				.url("ldap://localhost:10389/dc=jbc,dc=com")
				.and()
				.passwordCompare()
				.passwordEncoder(passwordEncoder())
				.passwordAttribute("userPassword");
	}

	private PasswordEncoder passwordEncoder() {
		final BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
		return new PasswordEncoder() {
			@Override
			public String encode(CharSequence rawPassword) {
//				return bcrypt.encode(rawPassword.toString());
				return rawPassword.toString();
			}

			@Override
			public boolean matches(CharSequence rawPassword, String encodedPassword) {
//				return bcrypt.matches(rawPassword, encodedPassword);
				return rawPassword.equals(encodedPassword);
			}
		};
	}

	@Bean
	public BCryptPasswordEncoder bcryptEncoder() {
		return new BCryptPasswordEncoder();
	}

//	@Bean
//	public PasswordEncoder bcryptEncoder() {
//		return NoOpPasswordEncoder.getInstance();
//	}

}
