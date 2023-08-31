package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="mainuser")
public class User {
	@Id
private int userid;
private String username;
private String address;
private long contactnumber;
@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="orid")
private List<Ordermodel> ord;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int userid, String username, String address, long contactnumber, List<Ordermodel> ord) {
	super();
	this.userid = userid;
	this.username = username;
	this.address = address;
	this.contactnumber = contactnumber;
	this.ord = ord;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getContactnumber() {
	return contactnumber;
}
public void setContactnumber(long contactnumber) {
	this.contactnumber = contactnumber;
}
public List<Ordermodel> getOrd() {
	return ord;
}
public void setOrd(List<Ordermodel> ord) {
	this.ord = ord;
}

}
