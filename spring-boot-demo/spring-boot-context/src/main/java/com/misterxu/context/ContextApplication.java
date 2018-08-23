package com.misterxu.context;

import com.misterxu.context.domain.School;
import org.springframework.boot.web.reactive.context.StandardReactiveWebEnvironment;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Created by misterxu on 2018/8/20.
 */
public class ContextApplication {
	public static void main(String[] args) {
		AnnotationConfigServletWebServerApplicationContext context = new AnnotationConfigServletWebServerApplicationContext("com.misterxu.context");
//		ConfigurableEnvironment environment = new StandardReactiveWebEnvironment();
//		context.setEnvironment(environment);

//		School school = new School();
//		school.setName("杨贤江中学");
//
//
//		context.getBeanFactory().registerSingleton("school",school);
		School school = context.getBean(School.class);
		System.out.println(school);


	}
}
