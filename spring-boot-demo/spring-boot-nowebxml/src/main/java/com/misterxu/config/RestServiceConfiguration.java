package com.misterxu.config;//package com.misterxu.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.EnableAspectJAutoProxy;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
//import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
//
///**
// * Created by misterxu on 2018/8/14.
// */
//@Configuration
//@EnableWebMvc
//@EnableAspectJAutoProxy(proxyTargetClass = true)
//@ComponentScan(basePackages = {"com.misterxu"})
//public class RestServiceConfiguration  extends WebMvcConfigurationSupport{
//	@Bean
//	public RequestMappingHandlerAdapter requestMappingHandlerAdapter(){
//		RequestMappingHandlerAdapter handlerAdapter = super.requestMappingHandlerAdapter();
//		return handlerAdapter;
//	}
//	@Bean
//	public LocaleChangeInterceptor localeChangeInterceptor(){
//		return new LocaleChangeInterceptor();
//	}
//
//}
