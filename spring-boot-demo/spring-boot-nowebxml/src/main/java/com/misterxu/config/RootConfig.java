package com.misterxu.config;

import org.springframework.context.annotation.*;

/**
 * Created by misterxu on 2018/8/14.
 */
@Configuration
@ImportResource
@Import({DataSourceConfig.class,ScheduleConfig.class,SsoConfig.class,WebMvcConfig.class})
@ComponentScan()
@EnableAspectJAutoProxy
public class RootConfig {
}
