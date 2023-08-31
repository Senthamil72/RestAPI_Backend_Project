package com.example.demo.model;

import java.time.LocalDate;

//import java.util.List;

//import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="mainorder")
public class Ordermodel {
@Id
	private int orderid;
	private LocalDate orderdate;
	private int totalamount;
	private String status;
	public Ordermodel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ordermodel(int orderid, LocalDate orderdate, int totalamount, String status) {
		super();
		this.orderid = orderid;
		this.orderdate = orderdate;
		this.totalamount = totalamount;
		this.status = status;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public LocalDate getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(LocalDate orderdate) {
		this.orderdate = orderdate;
	}
	public int getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(int totalamount) {
		this.totalamount = totalamount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

	
}
