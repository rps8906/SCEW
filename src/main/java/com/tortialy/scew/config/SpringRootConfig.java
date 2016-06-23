package com.tortialy.scew.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@Import({SpringDBConfig.class,PersistenceJPAConfig.class})
@ComponentScan({"com.tortialy.scew.business","com.tortialy.scew.dao","com.tortialy.scew.service"})
public class SpringRootConfig {

}
