package com.levent.jsr330.dao;

import javax.inject.Named;

import com.levent.jsr330.model.Team;

@Named
public class TeamDAOImpl implements TeamDAO{

	@Override
	public void insertTeam(Team team) {
		// TODO Auto-generated method stub
	
		teams.add(team);
		//System.out.println( team.getName() + " is inserted");	
	}

	@Override
	public void displayTeams() {
		
		teams.stream().forEach(System.out::println);
	}
}
