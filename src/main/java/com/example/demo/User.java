package com.example.demo;

public class User {
    private int user_id;
    private Team team_id;
    private String username;
    private String user_story_1;
    private String user_story_2;
    private String user_story_3;
    private int score;

    public User() {

    }

    public User(int user_id, Team team_id, String username, String user_story_1, String user_story_2, String user_story_3) {
        this.user_id = user_id;
        this.team_id = team_id;
        this.username = username;
        this.user_story_1 = user_story_1;
        this.user_story_2 = user_story_2;
        this.user_story_3 = user_story_3;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Team getTeam_id() {
        return team_id;
    }

    public void setTeam_id(Team team_id) {
        this.team_id = team_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUser_story_1() {
        return user_story_1;
    }

    public void setUser_story_1(String user_story_1) {
        this.user_story_1 = user_story_1;
    }

    public String getUser_story_2() {
        return user_story_2;
    }

    public void setUser_story_2(String user_story_2) {
        this.user_story_2 = user_story_2;
    }

    public String getUser_story_3() {
        return user_story_3;
    }

    public void setUser_story_3(String user_story_3) {
        this.user_story_3 = user_story_3;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

