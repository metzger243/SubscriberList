package com.tts.SubscriberList.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Subscriber {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String email;
	private String userName;
	private String password; 
	private String firstName;
	private String lastName;
	private String address;
	@Column
	@CreationTimestamp
	private Date signedUp;
	
	public Subscriber() {
		
	}
	
	public Subscriber(String firstName, String lastName, String userName, String email, String password, String address, Date signedUp) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.address = address;
		this.signedUp = signedUp;
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getSignedUp() {
		return signedUp;
	}

	public void setSignedUp(Date signedUp) {
		this.signedUp = signedUp;
	}

	@Override
	public String toString() {
		return "Subscriber [id=" + id + ", email=" + email + ", userName=" + userName + ", password=" + password
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", signedUp="
				+ signedUp + "]";
	}
	
	

}
