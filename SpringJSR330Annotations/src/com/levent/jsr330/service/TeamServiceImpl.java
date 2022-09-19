package com.levent.jsr330.service;

import javax.inject.Inject;
import javax.inject.Named;

import com.levent.jsr330.dao.TeamDAO;
import com.levent.jsr330.model.Team;

@Named
public class TeamServiceImpl implements TeamService{

	@Inject
	TeamDAO teamDAO;

	public void insertTeam(Team team) {
		
		teamDAO.insertTeam(team);
		
//		System.out.println("TeamService inserted Team ");
	}

	@Override
	public void displayTeams() {
		
		teamDAO.displayTeams();	
	}
}
