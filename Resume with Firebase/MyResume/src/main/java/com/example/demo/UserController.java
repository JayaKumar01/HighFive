package com.example.demo;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.entity.PersonalInformation;

@RestController
@RequestMapping("/firebase")
public class UserController {
	@Autowired
    UserService service;

    @GetMapping("/getUserDetails/{name}")
    public User getPatient(@PathVariable String name ) throws InterruptedException, ExecutionException{
        return service.getUserInformation(name);
    }

    @PostMapping("/createUser")
    public String createPatient(@RequestBody User user ) throws InterruptedException, ExecutionException {
        return service.saveUserInformation(user);
    }

    @PutMapping("/updateUser")
    public String updatePatient(@RequestBody User user  ) throws InterruptedException, ExecutionException {
        return service.updateUserDetails(user);
    }

    @DeleteMapping("/deleteUser/{name}")
    public String deletePatient(@PathVariable String name){
        return service.deleteUser(name);
    }
}
