package com.gk.alert.api.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Configuration
@ComponentScan("com.gk.alert.api.config")
@ComponentScan("com.gk.alert.api.controller")
@ComponentScan("com.gk.alert.api.entity")
@ComponentScan("com.gk.alert.api.repository")
@ComponentScan("com.gk.alert.api.service")
public class ServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[]{AlertApiWebConfig.class,MorphConfig.class,SwaggerConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/*" };
	}

}
