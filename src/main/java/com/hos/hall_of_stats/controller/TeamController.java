package com.hos.hall_of_stats.controller;

import com.hos.hall_of_stats.entity.Team;
import com.hos.hall_of_stats.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teams")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping
    public List<Team> getAllTeams() {
        return teamService.getAllTeams();
    }

    @GetMapping("/{name}")
    public ResponseEntity<List<Team>> getTeamsByName(@PathVariable String name) {
        List<Team> teams = teamService.getTeamByName(name);
        return ResponseEntity.ok(teams);
    }

    @PostMapping
    public Team createTeam(@RequestBody Team team) {
        return teamService.saveTeam(team);
    }
}
