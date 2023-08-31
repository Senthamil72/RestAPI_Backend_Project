package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.UserService;
import com.example.demo.model.User;

@RestController
public class UserController {
	@Autowired
  UserService user;
	@PostMapping("adduser")
	public User adduser(@RequestBody User u) {
		return user.saveuser(u);
	}
	@PostMapping("addusers")
	public List<User> addnusers(@RequestBody List<User> u) {
		return user.saveusers(u);
	}
	@GetMapping("getuser")
	public List<User> showuserinfo(){
		return user.getusers();
	}
}
