package com.hos.hall_of_stats.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pitchers")
public class Pitcher {
    @Id
    @Column(name = "player_name", nullable = false, length = 255)
    private String playerName;

    @Column(name = "position", nullable = false, length = 10)
    private String position;


    @Column(name = "wins", nullable = false)
    private int wins;


    @Column(name = "losses", nullable = false)
    private int losses;


    @Column(name = "era", nullable = false)
    private Double era;


    @Column(name = "games_played", nullable = false)
    private int gamesPlayed;


    @Column(name = "games_started", nullable = false)
    private int gamesStarted;


    @Column(name = "complete_games", nullable = false)
    private int completeGames;


    @Column(name = "shutouts", nullable = false)
    private int shutouts;


    @Column(name = "saves", nullable = false)
    private int saves;


    @Column(name = "save_opportunities", nullable = false)
    private int saveOpportunities;


    @Column(name = "innings_pitched", nullable = false)
    private Double inningsPitched;


    @Column(name = "hits_allowed", nullable = false)
    private int hitsAllowed;


    @Column(name = "runs_allowed", nullable = false)
    private int runsAllowed;


    @Column(name = "earned_runs", nullable = false)
    private int earnedRuns;


    @Column(name = "home_runs", nullable = false)
    private int homeRuns;


    @Column(name = "hit_batsmen", nullable = false)
    private int hitBatsmen;


    @Column(name = "walks", nullable = false)
    private int walks;


    @Column(name = "strikeouts", nullable = false)
    private int strikeouts;


    @Column(name = "whip", nullable = false)
    private Double whip;

    @Column(name = "opponent_avg", nullable = false)
    private Double opponentAvg;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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

    public double getEra() {
        return era;
    }

    public void setEra(double era) {
        this.era = era;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getGamesStarted() {
        return gamesStarted;
    }

    public void setGamesStarted(int gamesStarted) {
        this.gamesStarted = gamesStarted;
    }

    public int getCompleteGames() {
        return completeGames;
    }

    public void setCompleteGames(int completeGames) {
        this.completeGames = completeGames;
    }

    public int getShutouts() {
        return shutouts;
    }

    public void setShutouts(int shutouts) {
        this.shutouts = shutouts;
    }

    public int getSaves() {
        return saves;
    }

    public void setSaves(int saves) {
        this.saves = saves;
    }

    public int getSaveOpportunities() {
        return saveOpportunities;
    }

    public void setSaveOpportunities(int saveOpportunities) {
        this.saveOpportunities = saveOpportunities;
    }

    public double getInningsPitched() {
        return inningsPitched;
    }

    public void setInningsPitched(double inningsPitched) {
        this.inningsPitched = inningsPitched;
    }

    public int getHitsAllowed() {
        return hitsAllowed;
    }

    public void setHitsAllowed(int hitsAllowed) {
        this.hitsAllowed = hitsAllowed;
    }

    public int getRunsAllowed() {
        return runsAllowed;
    }

    public void setRunsAllowed(int runsAllowed) {
        this.runsAllowed = runsAllowed;
    }

    public int getEarnedRuns() {
        return earnedRuns;
    }

    public void setEarnedRuns(int earnedRuns) {
        this.earnedRuns = earnedRuns;
    }

    public int getHomeRuns() {
        return homeRuns;
    }

    public void setHomeRuns(int homeRuns) {
        this.homeRuns = homeRuns;
    }

    public int getHitBatsmen() {
        return hitBatsmen;
    }

    public void setHitBatsmen(int hitBatsmen) {
        this.hitBatsmen = hitBatsmen;
    }

    public int getWalks() {
        return walks;
    }

    public void setWalks(int walks) {
        this.walks = walks;
    }

    public int getStrikeouts() {
        return strikeouts;
    }

    public void setStrikeouts(int strikeouts) {
        this.strikeouts = strikeouts;
    }

    public double getWhip() {
        return whip;
    }

    public void setWhip(double whip) {
        this.whip = whip;
    }

    public double getOpponentAvg() {
        return opponentAvg;
    }

    public void setOpponentAvg(double opponentAvg) {
        this.opponentAvg = opponentAvg;
    }
}