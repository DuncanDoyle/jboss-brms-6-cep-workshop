package org.jboss.ddoyle.brms.cep.workshop;

import java.util.List;

import org.drools.core.event.DefaultAgendaEventListener;
import org.kie.api.event.rule.BeforeMatchFiredEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingAgendaEventListener extends DefaultAgendaEventListener {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAgendaEventListener.class);
	
	@Override
	public void beforeMatchFired(BeforeMatchFiredEvent event) {
		LOGGER.info("Match fired: " + event.getMatch().getRule().getName());
		
		List<Object> objects = event.getMatch().getObjects();
		objects.stream().forEach(object -> {System.out.println("Object match: " + object);});
		
	}
	
	
	

	
	
}
