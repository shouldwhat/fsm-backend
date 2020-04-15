package com.sm.fsm.framework.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@Configuration
public class JPAConfig implements InitializingBean {

	private static final Logger LOG = LoggerFactory.getLogger(JPAConfig.class);
	
	@Override
	public void afterPropertiesSet() throws Exception {
		LOG.debug("[@configuration] has initialize...");
	}

}
