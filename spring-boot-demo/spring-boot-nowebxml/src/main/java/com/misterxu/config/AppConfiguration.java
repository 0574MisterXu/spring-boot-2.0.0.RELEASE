package com.misterxu.config;//package com.misterxu.config;
//
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.EnableAspectJAutoProxy;
//import org.springframework.context.annotation.Import;
//import org.springframework.scheduling.annotation.EnableAsync;
//import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import java.util.Locale;
//
///**
// * Created by misterxu on 2018/8/14.
// */
//@Configuration
//@EnableTransactionManagement
//@EnableAsync
//@EnableAspectJAutoProxy
//@EnableScheduling
//@Import({RestServiceConfiguration.class, BatchAutoConfiguration.class})
//@ComponentScan({"com.misterxu"})
//public class AppConfiguration {
//	private Logger logger = LoggerFactory.getLogger(AppConfiguration.class);
//
//	public AppConfiguration(){
//		logger.info("[Initialize application]");
//		Locale.setDefault(Locale.US);
//	}
//}
