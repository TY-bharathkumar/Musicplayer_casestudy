package com.te.musicproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class Entityconfig {
	@Bean
	public LocalEntityManagerFactoryBean getMusic(){
		LocalEntityManagerFactoryBean factoryBean =new LocalEntityManagerFactoryBean();
		factoryBean.setPersistenceUnitName("musicdb");
		return factoryBean;
	}
}
