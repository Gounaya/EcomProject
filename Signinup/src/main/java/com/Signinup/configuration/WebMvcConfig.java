package com.Signinup.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * hashing and encryption to save passwords in the DB 
 * BCrypt uses adaptive hash algorithm to store password.BCrypt internally generates a random salt while encoding 
 * passwords and hence it is obvious to get different encoded results for the same String 
 * @author ogounaya
 *
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer{
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder;
	}
}
