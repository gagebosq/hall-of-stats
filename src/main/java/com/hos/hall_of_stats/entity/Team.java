package com.hos.hall_of_stats.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "teams")
public class Team {
    @Id
    @Column(name = "rk", nullable = false)
    private int rk;

    @Column(name = "year", nullable = false)
    private int year;

    @Column(name = "team_name", nullable = false, length = 255)
    private String teamName;

    @Column(name = "league", nullable = false, length = 50)
    private String league;

    @Column(name = "games", nullable = false)
    private int games;

    @Column(name = "wins", nullable = false)
    private int wins;

    @Column(name = "losses", nullable = false)
    private int losses;

    @Column(name = "ties", nullable = false)
    private int ties;

    @Column(name = "win_loss_percentage", nullable = false)
    private double winLossPercentage;

    @Column(name = "pyth_win_loss", nullable = false, length = 20)
    private String pythWinLoss;

    @Column(name = "finish", nullable = false, length = 50)
    private String finish;

    @Column(name = "games_behind", nullable = false)
    private double gamesBehind;

    @Column(name = "playoffs", nullable = false,length = 50)
    private String playoffs;

    @Column(name = "runs", nullable = false)
    private int runs;

    @Column(name = "runs_allowed", nullable = false)
    private int runsAllowed;

    @Column(name = "attendance", nullable = false)
    private int attendance;

    @Column(name = "bat_age", nullable = false)
    private double batAge;

    @Column(name = "pitch_age", nullable = false)
    private double pitchAge;

    @Column(name = "x_bat", nullable = false)
    private int xBat;

    @Column(name = "x_pitch", nullable = false)
    private int xPitch;

    @Column(name = "top_player", nullable = false,length = 255)
    private String topPlayer;

    @Column(name = "managers", nullable = false,length = 255)
    private String managers;

    @Column(name = "current_name", nullable = false,length = 255)
    private String currentName;

    public int getRk() {
        return rk;
    }

    public void setRk(int rk) {
        this.rk = rk;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

    public double getWinLossPercentage() {
        return winLossPercentage;
    }

    public void setWinLossPercentage(double winLossPercentage) {
        this.winLossPercentage = winLossPercentage;
    }

    public String getPythWinLoss() {
        return pythWinLoss;
    }

    public void setPythWinLoss(String pythWinLoss) {
        this.pythWinLoss = pythWinLoss;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public double getGamesBehind() {
        return gamesBehind;
    }

    public void setGamesBehind(double gamesBehind) {
        this.gamesBehind = gamesBehind;
    }

    public String getPlayoffs() {
        return playoffs;
    }

    public void setPlayoffs(String playoffs) {
        this.playoffs = playoffs;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getRunsAllowed() {
        return runsAllowed;
    }

    public void setRunsAllowed(int runsAllowed) {
        this.runsAllowed = runsAllowed;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public double getBatAge() {
        return batAge;
    }

    public void setBatAge(double batAge) {
        this.batAge = batAge;
    }

    public double getPitchAge() {
        return pitchAge;
    }

    public void setPitchAge(double pitchAge) {
        this.pitchAge = pitchAge;
    }

    public int getxBat() {
        return xBat;
    }

    public void setxBat(int xBat) {
        this.xBat = xBat;
    }

    public int getxPitch() {
        return xPitch;
    }

    public void setxPitch(int xPitch) {
        this.xPitch = xPitch;
    }

    public String getTopPlayer() {
        return topPlayer;
    }

    public void setTopPlayer(String topPlayer) {
        this.topPlayer = topPlayer;
    }

    public String getManagers() {
        return managers;
    }

    public void setManagers(String managers) {
        this.managers = managers;
    }

    public String getCurrentName() {
        return currentName;
    }

    public void setCurrentName(String currentName) {
        this.currentName = currentName;
    }
}
