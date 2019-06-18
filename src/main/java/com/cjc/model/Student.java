package com.cjc.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import com.cjc.model.Address;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="sg")
	@SequenceGenerator(name="sg",sequenceName="studentseq",initialValue=100,allocationSize=2)
	private int rollno;
	private String name;
	private String username;
	private String password;
	@OneToOne(cascade=CascadeType.ALL,orphanRemoval=true)
	private Address address;
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	

}
