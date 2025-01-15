package com.hos.hall_of_stats.service;

import com.hos.hall_of_stats.entity.Pitcher;
import com.hos.hall_of_stats.entity.Team;
import com.hos.hall_of_stats.repository.PitcherRepository;
import com.hos.hall_of_stats.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    @Autowired
    private TeamRepository teamRepository;

    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    public Team saveTeam(Team team) {
        return teamRepository.save(team);
    }

    public List<Team> getTeamByName(String name) {
        return teamRepository.findByName(name);
    }

}
