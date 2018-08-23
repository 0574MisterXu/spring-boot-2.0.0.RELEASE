package com.misterxu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by misterxu on 2018/8/14.
 */
@Configuration
@EnableTransactionManagement
public class DataSourceConfig {
	@Bean
	public DataSource dataSource(){
		return null;
	}
}
