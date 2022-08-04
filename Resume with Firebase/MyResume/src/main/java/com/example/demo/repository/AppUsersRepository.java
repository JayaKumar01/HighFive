package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.data.entity.AppUser;

import java.util.List;

public interface AppUsersRepository extends CrudRepository<AppUser,String>{
	AppUser findByPhoneNumber(String phoneNumber);
}
