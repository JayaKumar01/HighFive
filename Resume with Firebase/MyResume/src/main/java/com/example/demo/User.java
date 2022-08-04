package com.example.demo;



public class User {
	public User() {
		super();
	}
	public User(String name, String address, String email, String phoneNumber) {
		super();
		Name = name;
		Address = address;
		Email = email;
		PhoneNumber = phoneNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	private String Name;

	private String Address;
	private String Email;
	private String PhoneNumber;
}
