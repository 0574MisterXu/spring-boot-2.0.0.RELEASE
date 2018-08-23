package com.misterxu.config;

import com.misterxu.domain.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by misterxu on 2018/8/21.
 */
@Configuration
public class SystemConfig {
	@Bean
	public DataSourceProperties dataSourceProperties() {
		return new DataSourceProperties();
	}
}
