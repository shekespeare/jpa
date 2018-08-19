package com.javasampleapproach.jpa.one2one;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter{
	
	 @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
		 System.out.println("WEB config executing--->>>");
	        registry.addResourceHandler(
	                "/webjars/**",
	                "/img/**",
	                "/css/**",
	                "/scss/**",
	                "/js/**")
	                .addResourceLocations(
	                        "classpath:/META-INF/resources/webjars/",
	                        "classpath:/static/img/",
	                        "classpath:/static/css/",
	                        "classpath:/static/scss/",
	                        "classpath:/static/js/");
	        System.out.println("WEB config executing--->>>Ended");
	    }

}
