package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.data.entity.AppUser;
import com.example.demo.data.entity.PersonalInformation;
import com.example.demo.data.entity.Resume;
import com.example.demo.repository.AppUsersRepository;
import com.example.demo.repository.ResumeRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ResumeService {
	@Autowired
	ResumeRepository resumeRepository;

	@Autowired
	AppUsersRepository userRepository;

	public Resume generateResume() {

		Resume tempResume = new Resume();
		resumeRepository.save(tempResume);

		return tempResume;
	}

	public Resume getResumeForUser(String UserPhoneNumber) {
		
//		log.info(UserPhoneNumber);
		
		return userRepository.findByPhoneNumber(UserPhoneNumber).getResume();
	}

}
