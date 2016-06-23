package com.tortialy.scew.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@Configuration
@ComponentScan({"com.tortialy.scew.controller"})
public class SpringWebConfig extends WebMvcConfigurerAdapter {
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/devoops/","/resources/js/","/resources/img/","/resources/css/");
		super.addResourceHandlers(registry);
	}
}
