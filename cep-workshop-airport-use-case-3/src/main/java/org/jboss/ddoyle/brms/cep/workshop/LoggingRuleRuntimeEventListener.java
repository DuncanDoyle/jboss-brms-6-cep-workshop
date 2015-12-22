package org.jboss.ddoyle.brms.cep.workshop;

import org.drools.core.event.DefaultRuleRuntimeEventListener;
import org.kie.api.event.rule.ObjectInsertedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingRuleRuntimeEventListener extends DefaultRuleRuntimeEventListener {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingRuleRuntimeEventListener.class);
	
	@Override
	public void objectInserted(ObjectInsertedEvent event) {
		LOGGER.info("Object inserted: " + event.getObject().toString());
	}
	
}
