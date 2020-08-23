package com.shivam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
       Coach coach = context.getBean("cricketCoach", Coach.class);
       System.out.println(coach.getRoutine());
       System.out.println(coach.getDiet());
       System.out.println(coach.coachGivesTution());
    }
}
