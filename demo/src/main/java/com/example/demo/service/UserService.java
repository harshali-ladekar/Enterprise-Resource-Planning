package com.example.demo.service;

import java.util.List;

import com.example.demo.model.UserModel;

public interface UserService {
	
	public UserModel createUser(UserModel usermodel);
	
	public List<UserModel> findUserModels();
	
	public void deleteById(Integer id);
	
	public void update(UserModel usermodel);
	 
	
}
