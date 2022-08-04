package com.example.demo.restcontroller;

import java.util.LinkedList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.entity.Resume;
import com.example.demo.service.ResumeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class ResumeController {

	@Autowired
	ResumeService resumeService;

	@GetMapping("/test")
	public String testAPI() {

		return "Server Up and Running";
	}

	@GetMapping("/getUserResume")
	public Resume getUserResume(@RequestParam(value = "phoneNumber", required = true) String phoneNumber) {

		return resumeService.getResumeForUser(phoneNumber);

	}
}
