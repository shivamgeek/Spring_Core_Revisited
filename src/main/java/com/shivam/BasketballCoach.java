package com.shivam;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

	TutionService service;
	
	public String getRoutine() {
		return "Practice Basketball everyday for 1 hour";
	}

	public String getDiet() {
		return "You need to increase height, so eat more proteins";
	}
	
	public String coachGivesTution() {
		return service.study();
	}

}
