package net.engineeringdigest.journalApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Collections;

@Configuration
public class CorsConfig {
	
	@Bean
	public CorsFilter corsFilter() {
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowedOrigins(Collections.singletonList("http://127.0.0.1:5500"));
		config.setAllowedMethods(Collections.singletonList("*"));
		config.setAllowCredentials(true);
		config.setAllowedHeaders(Collections.singletonList("*"));
		
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", config);
		
		return new CorsFilter(source);
	}
}