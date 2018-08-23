package com.misterxu;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Created by misterxu on 2018/8/14.
 */
@SpringBootApplication
public class NoWebXmlApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
		setRegisterErrorPageFilter(false);
		return builder.bannerMode(Banner.Mode.CONSOLE)
						.sources(NoWebXmlApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(NoWebXmlApplication.class,args);
	}
}
