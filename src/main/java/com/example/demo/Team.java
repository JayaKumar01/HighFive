package com.example.demo;

import java.util.List;

public class Team {
    private int team_id;
    private String team_name;
    private int team_score;
    private List<User> team;

    public Team(int team_id, String team_name) {
        this.team_id = team_id;
        this.team_name = team_name;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public int getTeam_score() {
        return team_score;
    }

    public void setTeam_score(int team_score) {
        this.team_score = team_score;
    }

    public List<User> getTeam() {
        return team;
    }

    public void setTeam(List<User> team) {
        this.team = team;
    }
}
