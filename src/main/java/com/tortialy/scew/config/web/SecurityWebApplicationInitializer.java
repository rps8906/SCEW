package com.tortialy.scew.config.web;

import org.springframework.core.annotation.Order;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.WebApplicationInitializer;

@Order(2)
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer implements
        WebApplicationInitializer {
}
