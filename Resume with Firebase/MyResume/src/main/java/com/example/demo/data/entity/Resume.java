package com.example.demo.data.entity;

import java.util.LinkedList;

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


@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Resume {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ResumeId;

	public Long getResumeId() {
		return ResumeId;
	}

	public void setResumeId(Long resumeId) {
		ResumeId = resumeId;
	}

	public PersonalInformation getPersonalInfo() {
		return personalInfo;
	}

	public void setPersonalInfo(PersonalInformation personalInfo) {
		this.personalInfo = personalInfo;
	}

	public EducationDetails getEducationDetails() {
		return educationDetails;
	}

	public void setEducationDetails(EducationDetails educationDetails) {
		this.educationDetails = educationDetails;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "personalInfo", referencedColumnName = "personalInformationId")
	private PersonalInformation personalInfo;

	/*
	 * private LinkedList<Skills> skillsSet;
	 */
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "educationDetails", referencedColumnName = "educationDetailsId")
	private EducationDetails educationDetails;
	
	/*
	 * private CertificationDetails certificationDetails; 
	 * private AwardsAndRecognition awardsAndRecognition;
	 */

	/*
	 * private ProjectDetails projectDetails; private InternshipDetails
	 * internshipDetails; private ExperienceDetails experienceDetails;
	 */

}
