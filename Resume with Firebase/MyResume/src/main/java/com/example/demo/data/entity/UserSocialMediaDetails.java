package com.example.demo.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserSocialMediaDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userSocialMediaId;

	private String LinkedInProfile;
	private String GitHubProfile;

}
