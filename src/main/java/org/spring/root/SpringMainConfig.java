package org.spring.root;

import org.rest.spring.application.ApplicationConfig;
import org.rest.spring.persistence.jpa.PersistenceJPAConfig;
import org.rest.spring.security.SecurityConfig;
import org.spring.web.WebConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import( { PersistenceJPAConfig.class, SecurityConfig.class, WebConfig.class, ApplicationConfig.class } )
public class SpringMainConfig{
	
	public SpringMainConfig(){
		super();
	}
	
}
