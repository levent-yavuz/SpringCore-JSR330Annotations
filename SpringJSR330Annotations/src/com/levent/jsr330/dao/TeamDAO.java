package com.levent.jsr330.dao;

import java.util.ArrayList;
import java.util.List;

import com.levent.jsr330.model.Team;

public interface TeamDAO {

	List<Team> teams = new ArrayList<Team>();
	
	void insertTeam(Team team);
	
	void displayTeams();
	
}
