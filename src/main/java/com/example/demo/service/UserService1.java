package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class UserService1 implements UserService{

	@Autowired
	UserRepository userRepo;
	@Override
	public UserModel createUser(UserModel usermodel) {
		// TODO Auto-generated method stub
		return userRepo.save(usermodel);
	}
	@Override
	public List<UserModel> findUserModels() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}
	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		userRepo.deleteById(id);
	}
	@Override
	public void update(UserModel usermodel) {
		// TODO Auto-generated method stub
		userRepo.save(usermodel);
	}
	

}
