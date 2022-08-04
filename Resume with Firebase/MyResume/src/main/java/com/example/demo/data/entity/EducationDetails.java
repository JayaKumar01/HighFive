package com.example.demo.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
public class EducationDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long educationDetailsId;

	/*
	 * private SecondarySchoolDetails secondaryschoolDetails; private
	 * HigherSecondarySchoolDetails highersecondaryschoolDetails; private
	 * GraduationDetails graduationDetails; private PostGraduationDetails
	 * postgraduationDetails; private DoctorateDetails doctorateDetails;
	 */
}
