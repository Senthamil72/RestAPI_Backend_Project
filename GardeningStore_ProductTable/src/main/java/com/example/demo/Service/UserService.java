package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.UserRepo;
import com.example.demo.model.User;

@Service
public class UserService {
	@Autowired
	UserRepo ur;
	
	public User saveuser(User u) {
		return ur.save(u);
	}
     
	public List<User> saveusers(List<User> u) {
		return (List<User>)ur.saveAll(u);
	}
	public List<User> getusers(){
		return ur.findAll();
	}
}
