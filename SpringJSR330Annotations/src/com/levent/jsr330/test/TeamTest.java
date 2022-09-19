package com.levent.jsr330.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.levent.jsr330.configuration.AppConfig;
import com.levent.jsr330.model.Team;
import com.levent.jsr330.service.TeamService;
import com.levent.jsr330.service.TeamServiceImpl;

public class TeamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		TeamService teamService = context.getBean("teamServiceImpl", TeamServiceImpl.class);
		
		Team team1 = new Team("Manchester City", "The Sky Blues", "Blue and White", 6);
		Team team2 = new Team("Liverpool", "The Reds", "Red", 19);
		Team team3 = new Team("Manchester United", "The Red Devils ", "Red and White", 20);
		Team team4 = new Team("Chelsea", "The Blues", "White and Blue", 6);
		
		teamService.insertTeam(team1);
		teamService.insertTeam(team2);
		teamService.insertTeam(team3);
		teamService.insertTeam(team4);
		
		teamService.displayTeams();
		
	}
}
