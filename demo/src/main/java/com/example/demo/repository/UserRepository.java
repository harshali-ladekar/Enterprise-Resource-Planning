package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UserModel;

import jakarta.persistence.Id;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Id>{

	void deleteById(Integer id);


}
