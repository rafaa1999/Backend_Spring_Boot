package com.bafoly.ex.user;

import java.util.Optional;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

public class UniqueEmailValidator implements ConstraintValidator<UniqeEmail, String>{

	@Autowired
	private UserRepository UserRepository;
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		Optional<User> inDb = UserRepository.findByEmail(value);
		if(inDb == null) {
			return true;
		}
		return false;
	}

}
