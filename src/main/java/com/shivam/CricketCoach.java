package com.shivam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	TutionService service;
	
	@Autowired
	public CricketCoach(TutionService service) {
		this.service = service;
	}
	
	public String getRoutine() {
		return "Practice balling everyday for 50 minutes";
	}

	public String getDiet() {
		return "You need to increase strength, so eat more carbs";
	}

	public String coachGivesTution() {
		return service.study();
	}
	
}