package com.example.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
//import jakarta.persistence.Table;

@Entity
@Table(name="prodecttable")
public class Prodect {
	@Id
	private int productid;
	private String name;
	private String description;
	private int price;
	private int priceQuantity;
	private String imageURL;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="categoryid")
	private CategoryID catid;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPriceQuantity() {
		return priceQuantity;
	}
	public void setPriceQuantity(int priceQuantity) {
		this.priceQuantity = priceQuantity;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public CategoryID getCatid() {
		return catid;
	}
	public void setCatid(CategoryID catid) {
		this.catid = catid;
	}
	public Prodect(int productid, String name, String description, int price, int priceQuantity, String imageURL,
			CategoryID catid) {
		super();
		this.productid = productid;
		this.name = name;
		this.description = description;
		this.price = price;
		this.priceQuantity = priceQuantity;
		this.imageURL = imageURL;
		this.catid = catid;
	}
	public Prodect() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
