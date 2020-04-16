package com.kiheyunkim.kim.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

//@Configuration
public class AsyncConfiguration extends WebMvcConfigurationSupport{
	
	@Override
	protected void configureAsyncSupport(AsyncSupportConfigurer configurer) {
		configurer.setDefaultTimeout(5000);
		configurer.setTaskExecutor(mvcTaskExcutor());
	}
	
	@Bean
	public ThreadPoolTaskExecutor mvcTaskExcutor() {
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		taskExecutor.setThreadGroupName("mvc-executor");
		return taskExecutor;
	}
}
