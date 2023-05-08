package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	
	@PostMapping("/save")
	public UserModel saveUser(@RequestBody UserModel usermodel) {
		return userService.createUser(usermodel);
	}
	@GetMapping("/take")
	public List<UserModel> findUserModels(){
		return userService.findUserModels();
	}
	@DeleteMapping("/delete/{id}")
	public void deleteUser(@PathVariable Integer id) {
		userService.deleteById(id);
	}
	@PutMapping("/update")
	public void update(@RequestBody UserModel usermodel) {
		userService.update(usermodel);
	}
}
