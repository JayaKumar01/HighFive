package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Team team1 = new Team(1,"High Five");
		User user1 = new User(1,team1,"Jay","Completed","Completed","Completed");
		User user2 = new User(2,team1,"Vamshi","Pending","Completed","Pending");
		User user3 = new User(3,team1,"Likhith","Pending","Completed","Completed");
		List<User> myTeam = new ArrayList<>();
		myTeam.add(user1);
		myTeam.add(user2);
		myTeam.add(user3);
		team1.setTeam(myTeam);

		int total = calcUserScore(user1) + calcUserScore(user2)+calcUserScore(user3);
//		team1.setTeam_score(total);
		//System.out.println(team1.getTeam_score());
		calcTeamScore(team1);
		//System.out.println("Total =" +total);
	}


	public static int calcUserScore(User user) {
		int total = 0;
		if(user.getUser_story_1().equalsIgnoreCase("completed"))
			total += 100;
		if(user.getUser_story_1().equalsIgnoreCase("pending"))
			total += 75;
		if(user.getUser_story_2().equalsIgnoreCase("completed"))
			total += 100;
		if(user.getUser_story_2().equalsIgnoreCase("pending"))
			total += 75;
		if(user.getUser_story_3().equalsIgnoreCase("completed"))
			total += 100;
		if(user.getUser_story_3().equalsIgnoreCase("pending"))
			total += 75;

		user.setScore(total);
		System.out.println(total);
		return total;
	}

	public static int calcTeamScore(Team team) {
		int total = 0;

		for (int i = 0; i < team.getTeam().size(); i++) {
			total += team.getTeam().get(i).getScore();
		}
		System.out.println("Total Team Score = "+ total);
		return total;
	}

}
