package com.Issue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class IssueApiServerApplication {

	public static void main(String[] args) {
		System.setProperty("tomcat.util.http.parser.HttpParser.requestTargetAllow", "{}");
		SpringApplication.run(IssueApiServerApplication.class, args);
	}

}
