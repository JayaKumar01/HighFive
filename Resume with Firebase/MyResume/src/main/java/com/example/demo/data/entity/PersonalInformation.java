package com.example.demo.data.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PersonalInformation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long personalInformationId;
	
	private String userName;
	public Long getPersonalInformationId() {
		return personalInformationId;
	}

	public void setPersonalInformationId(Long personalInformationId) {
		this.personalInformationId = personalInformationId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserEmailId() {
		return userEmailId;
	}

	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

	public UserSocialMediaDetails getUserSocialMediaDetails() {
		return userSocialMediaDetails;
	}

	public void setUserSocialMediaDetails(UserSocialMediaDetails userSocialMediaDetails) {
		this.userSocialMediaDetails = userSocialMediaDetails;
	}

	private String userPhoneNumber;
	private String userAddress;
	
	private String userEmailId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userSocialMediaDetails", referencedColumnName = "userSocialMediaId")
	private UserSocialMediaDetails userSocialMediaDetails;
	
}
