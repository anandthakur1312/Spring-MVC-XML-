 package com.anand.web.controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
 
public class HobbyValidator implements ConstraintValidator<IsValidHobby, String> {
 

	private String listOfValidHobbies;
	
    @Override
    public void initialize(IsValidHobby isValidHobby) { 
    	this.listOfValidHobbies=isValidHobby.listOfValidHobbies();
    	
    }
 
    @Override
    public boolean isValid(String userHobby, ConstraintValidatorContext ctx) {
        
    	if(userHobby == null) {
    		
            return false;
        }
        
    	if (userHobby.matches(listOfValidHobbies)) {
    		
    		return true;
    	} else {
    		
    		return false;
    	}
    }
 
}