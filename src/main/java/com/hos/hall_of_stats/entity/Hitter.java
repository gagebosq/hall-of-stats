package com.hos.hall_of_stats.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hitters")
public class Hitter {

    @Id
    @Column(name = "player_name", nullable = false, length = 255)
    private String playerName;

    @Column(name = "position", nullable = false, length = 10)
    private String position;

    @Column(name = "games", nullable = false)
    private Integer games;

    @Column(name = "at_bats", nullable = false)
    private Integer atBats;

    @Column(name = "runs", nullable = false)
    private Integer runs;

    @Column(name = "hits", nullable = false)
    private Integer hits;

    @Column(name = "doubles", nullable = false)
    private Integer doubles;

    @Column(name = "triples", nullable = false)
    private Integer triples;

    @Column(name = "home_runs", nullable = false)
    private Integer homeRuns;

    @Column(name = "rbis", nullable = false)
    private Integer rbis;

    @Column(name = "walks", nullable = false)
    private Integer walks;

    @Column(name = "strikeouts", nullable = false)
    private Integer strikeouts;

    @Column(name = "stolen_bases", nullable = false)
    private Integer stolenBases;

    @Column(name = "caught_stealing", nullable = false)
    private Integer caughtStealing;

    @Column(name = "batting_avg", nullable = false)
    private Double battingAvg;

    @Column(name = "on_base_percentage", nullable = false)
    private Double onBasePercentage;

    @Column(name = "slugging_percentage", nullable = false)
    private Double sluggingPercentage;

    @Column(name = "ops", nullable = false)
    private Double ops;

    // Getters and Setters
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

    public Integer getGames() {
        return games;
    }

    public void setGames(Integer games) {
        this.games = games;
    }

    public Integer getAtBats() {
        return atBats;
    }

    public void setAtBats(Integer atBats) {
        this.atBats = atBats;
    }

    public Integer getRuns() {
        return runs;
    }

    public void setRuns(Integer runs) {
        this.runs = runs;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Integer getDoubles() {
        return doubles;
    }

    public void setDoubles(Integer doubles) {
        this.doubles = doubles;
    }

    public Integer getTriples() {
        return triples;
    }

    public void setTriples(Integer triples) {
        this.triples = triples;
    }

    public Integer getHomeRuns() {
        return homeRuns;
    }

    public void setHomeRuns(Integer homeRuns) {
        this.homeRuns = homeRuns;
    }

    public Integer getRbis() {
        return rbis;
    }

    public void setRbis(Integer rbis) {
        this.rbis = rbis;
    }

    public Integer getWalks() {
        return walks;
    }

    public void setWalks(Integer walks) {
        this.walks = walks;
    }

    public Integer getStrikeouts() {
        return strikeouts;
    }

    public void setStrikeouts(Integer strikeouts) {
        this.strikeouts = strikeouts;
    }

    public Integer getStolenBases() {
        return stolenBases;
    }

    public void setStolenBases(Integer stolenBases) {
        this.stolenBases = stolenBases;
    }

    public Integer getCaughtStealing() {
        return caughtStealing;
    }

    public void setCaughtStealing(Integer caughtStealing) {
        this.caughtStealing = caughtStealing;
    }

    public Double getBattingAvg() {
        return battingAvg;
    }

    public void setBattingAvg(Double battingAvg) {
        this.battingAvg = battingAvg;
    }

    public Double getOnBasePercentage() {
        return onBasePercentage;
    }

    public void setOnBasePercentage(Double onBasePercentage) {
        this.onBasePercentage = onBasePercentage;
    }

    public Double getSluggingPercentage() {
        return sluggingPercentage;
    }

    public void setSluggingPercentage(Double sluggingPercentage) {
        this.sluggingPercentage = sluggingPercentage;
    }

    public Double getOps() {
        return ops;
    }

    public void setOps(Double ops) {
        this.ops = ops;
    }
}
