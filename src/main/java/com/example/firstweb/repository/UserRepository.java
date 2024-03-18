package com.example.firstweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.firstweb.bean.User;

public interface UserRepository extends JpaRepository<User, Integer> {

//	User findByusername(String username);
	
	User findByemail(String email);



}
