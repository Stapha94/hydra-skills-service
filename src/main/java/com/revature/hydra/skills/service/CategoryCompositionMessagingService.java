package com.revature.hydra.skills.service;

import org.springframework.stereotype.Service;

@Service
public class CategoryCompositionMessagingService {

	/**
	 * Category has a set of Assessments in old bean but not in DB, Assessment has a
	 * category. Messaging requests are not needed for category at this time.
	 * 
	 */
	// private static final String SINGLE_PANEL_ROUTING_KEY = "7c6tMqRRPpZ8Z7xh";
	// private static final String RABBIT_REPO_EXCHANGE = "revature.hydra.repos";

	/*
	 * public List<SimpleAssessment> sendSingleSimpleAssessmentRequest(Integer
	 * categoryId) { JsonObject panelRequest = new JsonObject();
	 * 
	 * panelRequest.addProperty("methodName", "findOne");
	 * panelRequest.addProperty("categoryId", categoryId);
	 * 
	 * return (SimpleAssessment)
	 * rabbitTemplate.convertSendAndReceive(RABBIT_REPO_EXCHANGE,
	 * SINGLE_PANEL_ROUTING_KEY, panelRequest.toString()); }
	 */

}
