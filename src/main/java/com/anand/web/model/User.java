package com.anand.web.model;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.anand.web.controller.IsValidHobby;

public class User {
	
	@Pattern( regexp = "[^0-9]*")
	private String userName;
	@Size(min=1, max=50)
	@IsValidHobby(listOfValidHobbies="Music|Football|Cricket|Hockey")
	private String userHobby;
	@Past
	private Date userDOB;
	private Long userPhNo;
	private ArrayList<String> userSkills;
	private Address userAddress;
	
	
	public Date getUserDOB() {
		return userDOB;
	}
	public void setUserDOB(Date userDOB) {
		this.userDOB = userDOB;
	}
	public Long getUserPhNo() {
		return userPhNo;
	}
	public void setUserPhNo(Long userPhNo) {
		this.userPhNo = userPhNo;
	}
	public ArrayList<String> getUserSkills() {
		return userSkills;
	}
	public void setUserSkills(ArrayList<String> userSkills) {
		this.userSkills = userSkills;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserHobby() {
		return userHobby;
	}
	public void setUserHobby(String userHobby) {
		this.userHobby = userHobby;
	}
	public Address getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(Address userAddress) {
		this.userAddress = userAddress;
	}
	
	
}
