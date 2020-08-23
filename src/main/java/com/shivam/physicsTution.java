package com.shivam;

import org.springframework.stereotype.Component;

@Component
public class physicsTution implements TutionService{
	
	public String teach() {
		return "Hey I'm your coach, and I'll be teaching you Physics";
	}
	
}
