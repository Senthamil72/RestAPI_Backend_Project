package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CategoryIDRepo;
import com.example.demo.model.CategoryID;

@Service
public class CategoryIDService {
@Autowired
 CategoryIDRepo sr;
public CategoryID addcat(CategoryID ss)
{
	return sr.save(ss);
}
public List<CategoryID> showcat()
{
	return sr.findAll();
}
}
