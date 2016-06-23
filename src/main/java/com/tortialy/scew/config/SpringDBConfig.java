package com.tortialy.scew.config;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringDBConfig {
	
	@Resource
	private Environment env;
	
	@Bean(name="dataSource")
	public DataSource getDataSourceMySql(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/dba");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		return dataSource;
	}
	
}
