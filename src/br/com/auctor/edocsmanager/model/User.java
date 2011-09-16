package br.com.auctor.edocsmanager.model;

import java.util.Collection;
import java.util.Date;

/**
 * @author IcaroCamelo
 *
 */
public abstract class User {
	private String name;
	private String address;
	private String phone;
	private String email;
	private String password;
	private Collection<User> followers;
	private Date registrationDate;
	private Boolean isActive;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Collection<User> getFollowers() {
		return followers;
	}
	public void setFollowers(Collection<User> followers) {
		this.followers = followers;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	//TODO: Create unit tests to test constructors, add followers and cryptography of the password
}
