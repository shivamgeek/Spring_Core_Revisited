package com.shivam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {
	
	@Autowired
	@Qualifier("biologyTution")
	TutionService service;
	
	public void setService(TutionService service) {
		this.service = service;
	}

	public String getRoutine() {
		return "Practice Basketball everyday for 1 hour";
	}

	public String getDiet() {
		return "You need to increase height, so eat more proteins";
	}
	
	public String coachGivesTution() {
		return service.teach();
	}

}
