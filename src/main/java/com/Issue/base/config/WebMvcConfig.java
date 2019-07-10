package com.Issue.base.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.Issue.auth.interceptor.JwtInterceptor;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    private static final String[] EXCLUDE_PATHS = {
            "/user/**"
    };
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
		//CORS 허용도메인 전체
        .allowedOrigins("*")
        .allowCredentials(true)
        .allowedMethods("*")
        .maxAge(3600);
	}
	@Autowired
	private JwtInterceptor JwtInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		registry.addInterceptor(JwtInterceptor)
				.addPathPatterns("/**")
				.excludePathPatterns(EXCLUDE_PATHS);
								
	}
}
