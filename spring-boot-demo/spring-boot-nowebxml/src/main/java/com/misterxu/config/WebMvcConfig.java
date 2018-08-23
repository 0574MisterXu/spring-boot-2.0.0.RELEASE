package com.misterxu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Created by misterxu on 2018/8/14.
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport{
	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		// 静态资源处理
		registry.addResourceHandler("/attachment/**");

	}
	@Override
	protected void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
		// 拦截器配置
//		registry.addInterceptor(someInterceptor());
	}
	//启用 multipart request 解析
	@Bean(name = DispatcherServlet.MULTIPART_RESOLVER_BEAN_NAME)
	public MultipartResolver multipartResolver() {
		return new CommonsMultipartResolver();
	}
	//其他配置


}
