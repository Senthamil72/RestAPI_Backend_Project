package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Categoryidtable")
public class CategoryID {
	@Id
	private int categoryID;
	private String name;
	private String description;
	public int getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public CategoryID(int categoryID, String name, String description) {
		super();
		this.categoryID = categoryID;
		this.name = name;
		this.description = description;
	}
	public CategoryID() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
