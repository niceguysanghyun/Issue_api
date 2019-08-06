package com.Issue.base.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.Issue.auth.interceptor.JwtInterceptor;



@Configuration
@EnableJpaRepositories("com.ISSUE")
public class WebMvcConfig implements WebMvcConfigurer {
    private static final String[] EXCLUDE_PATHS = {
            "/user/**"
    };
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
        .allowedOrigins("*")
        .allowCredentials(true)
        .allowedMethods("*")
        .maxAge(3600);
	}
	
	@Autowired
	private JwtInterceptor jwtInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		registry.addInterceptor(jwtInterceptor)
				.addPathPatterns("/board/**")
				.excludePathPatterns(EXCLUDE_PATHS);
								
	}
}
