package com.nt.domain;

import java.util.List;
import java.util.Set;

public class UserDetails {
	private int userId;
	private String firstName;
	private String address;
	private List<PhoneNumber> phones;
	
	public UserDetails() {
		System.out.println("UserDetails::0-param constructor");
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<PhoneNumber> getPhones() {
		return phones;
	}
	public void setPhones(List<PhoneNumber> phones) {
		this.phones = phones;
	} 

}
