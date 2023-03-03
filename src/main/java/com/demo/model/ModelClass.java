package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class ModelClass {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	
		private int id;
		public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
		@Column
		private String name;
		@Column
		private String email;
		@Column
		private int mobileno;
		@Column
		private String state;
	
 
	 

}
