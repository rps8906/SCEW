package com.tortialy.scew.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@Import({SpringDBConfig.class,PersistenceJPAConfig.class, SecurityConfig.class})
@ComponentScan({"com.tortialy.scew.business","com.tortialy.scew.dao","com.tortialy.scew.service","com.tortialy.scew.security"})
public class SpringRootConfig {
	
}
