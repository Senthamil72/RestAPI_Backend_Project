package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.CategoryIDService;
import com.example.demo.model.CategoryID;

@RestController
public class CategoryIDController {
@Autowired
CategoryIDService sser;
@PostMapping("addcategory")
public CategoryID adddetails(@RequestBody CategoryID ss)
{
	return sser.addcat(ss);
}
@GetMapping("showcatdet")
public List<CategoryID> showdetails()
{
	return sser.showcat();
}
}
