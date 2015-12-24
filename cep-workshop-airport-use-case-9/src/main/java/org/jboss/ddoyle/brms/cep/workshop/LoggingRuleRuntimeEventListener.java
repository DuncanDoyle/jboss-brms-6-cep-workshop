package org.jboss.ddoyle.brms.cep.workshop;

import org.drools.core.event.DefaultRuleRuntimeEventListener;
import org.kie.api.event.rule.ObjectDeletedEvent;
import org.kie.api.event.rule.ObjectInsertedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingRuleRuntimeEventListener extends DefaultRuleRuntimeEventListener {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingRuleRuntimeEventListener.class);
	
	@Override
	public void objectDeleted(ObjectDeletedEvent event) {
		LOGGER.info("Event deleted from WorkingMemory: " + event.getOldObject());
		LOGGER.info("Number of facts in session: " + event.getKieRuntime().getFactCount());
	}

	
	
}
