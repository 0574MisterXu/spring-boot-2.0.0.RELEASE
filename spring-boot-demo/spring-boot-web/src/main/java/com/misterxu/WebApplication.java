package com.misterxu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by misterxu on 2018/8/12.
 */
@SpringBootApplication
public class WebApplication  extends WebApplicationConfig{

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class,args);
	}
}
