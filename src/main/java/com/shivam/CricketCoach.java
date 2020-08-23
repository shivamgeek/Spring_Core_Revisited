package com.shivam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	
	@Autowired
	@Qualifier("physicsTution")
	TutionService service;
	
	public void setService(TutionService service) {
		this.service = service;
	}

	
	public String getRoutine() {
		return "Practice balling everyday for 50 minutes";
	}

	public String getDiet() {
		return "You need to increase strength, so eat more carbs";
	}

	public String coachGivesTution() {
		return service.teach();
	}
	
}