package com.tortialy.scew.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = { "com.tortialy.scew.dao" })
public class PersistenceJPAConfig {

	@Autowired
	@Qualifier("jpaProperties")
	private Properties jpaProperties;

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
		LocalContainerEntityManagerFactoryBean managerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		managerFactoryBean.setDataSource(dataSource);
		managerFactoryBean.setPackagesToScan(new String[] { "com.tortialy.scew.data.model" });

		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		managerFactoryBean.setJpaVendorAdapter(vendorAdapter);
		managerFactoryBean.setJpaProperties(jpaProperties);
		return managerFactoryBean;
	}

	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory managerFactory) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(managerFactory);
		return transactionManager;
	}

	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
		return new PersistenceExceptionTranslationPostProcessor();
	}

	@Bean(name = "jpaProperties")
	public static Properties addicionalProperties() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.format_sql", "true");
		return properties;
	}

}