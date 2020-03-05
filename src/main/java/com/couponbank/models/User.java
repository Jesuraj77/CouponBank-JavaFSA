package com.couponbank.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="User")
public class User {
	   @Id
	   @Column(name="userId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
      int userId;
	   
		  @Column(name="userName")
        String userName;
		  
		  @Column(name="email")		  
          String email;
		  
		  @Column(name="role")		  
          String role;
		  
		  @Column(name="password")	  
          String password;
		  
		  @Column(name="status")
          String status;
		  
		  @Column(name="createdAt")
          Date createdAt;
		  
		  @Column(name="phoneNumber")
		   int phoneNumber;
		 
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Date getCreatedAt() {
	return createdAt;
}
public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
}
public int getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
}

}
