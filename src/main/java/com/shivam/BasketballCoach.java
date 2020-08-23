package com.shivam;

import org.springframework.stereotype.Component;

@Component("myCoach")
public class BasketballCoach implements Coach {

	public String getRoutine() {
		return "Practice Basketball everyday for 1 hour";
	}

	public String getDiet() {
		return "You need to increase height, so eat more proteins";
	}

}
