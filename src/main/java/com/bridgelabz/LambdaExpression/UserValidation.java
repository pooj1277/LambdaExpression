package com.bridgelabz.LambdaExpression;
import java.util.regex.*;

import com.bridgelabz.LambdaExpression.InvalidException.ExceptionType;

import java.util.*;

@FunctionalInterface
interface validateEntry{
	boolean isValidate(String msg);
}

public class UserValidation {
	
	private String message;
	
	public UserValidation(String message) {
		this.message = message;
	}
	
	public UserValidation() {
		
	}
	
//	first name validation
	public boolean isValidFirstName(String msg) 
	{ 
		validateEntry pleaseValidateFirstName = (String inputMessage) -> {
			String regex = "^[A-Z]{1}[a-zA-Z]{2,}";
			Pattern p = Pattern.compile(regex); 
			Matcher m = p.matcher(inputMessage); 
			return m.matches();
		};
		return pleaseValidateFirstName.isValidate(msg);

	} 
	
	public boolean validateFirstName(String message) throws InvalidException {
		this.message = message;
		return validateFirstName();
	}
	
	public  boolean validateFirstName() throws InvalidException{
		UserValidation val = new UserValidation();
		boolean ans = val.isValidFirstName(message);
		try {
			if (message.length() == 0) {
				throw new InvalidException(ExceptionType.ENTERED_EMPTY, "First Name cannot be Empty.");
			} else if (ans == false) {
				throw new InvalidException(ExceptionType.ENTERED_WRONG, "Entered First Name is Wrong.");
			}
		} catch (NullPointerException e) {
			throw new InvalidException(ExceptionType.ENTERED_NULL, "First Name cannot be NULL.");
		}
		return ans;
	}
//	last name validation
	public  boolean isValidLastName(String msg) 
	{ 
		validateEntry pleaseValidateLastName = (String inputMessage) -> {
			String regex = "^[A-Z]{1}[a-zA-Z]{2,}";
			Pattern p = Pattern.compile(regex); 
			Matcher m = p.matcher(msg); 
			return m.matches(); 
		};
		return pleaseValidateLastName.isValidate(msg);
	} 
	
	public  boolean validateLastName(String message) throws InvalidException{
		this.message = message;
		return validateLastName();
	}
	
	public  boolean validateLastName() throws InvalidException{
		UserValidation val = new UserValidation();
		boolean ans = val.isValidLastName(message);
		try {
			if (message.length() == 0) {
				throw new InvalidException(ExceptionType.ENTERED_EMPTY, "Last Name cannot be Empty.");
			} else if (ans == false) {
				throw new InvalidException(ExceptionType.ENTERED_WRONG, "Entered Last Name is Wrong.");
			}
		} catch (NullPointerException e) {
			throw new InvalidException(ExceptionType.ENTERED_NULL, "Last Name cannot be NULL.");
		}
		return ans;
	}
	
// Phone number validation
	public  boolean isValidMobileNumber(String msg) 
	{ 
		validateEntry pleaseValidateMobileNumber = (String inputMessage) -> {
			String regex = "^[0-9]{2}[ ]{1}[0-9]{10}$";
			Pattern p = Pattern.compile(regex); 
			Matcher m = p.matcher(msg); 
			return m.matches(); 
		};
		return pleaseValidateMobileNumber.isValidate(msg);
	} 
	
	public boolean validateMobileNumber(String message) throws InvalidException{
		this.message = message;
		return validateMobileNumber();
		}
	
	public boolean validateMobileNumber() throws InvalidException{
		UserValidation val = new UserValidation();
		boolean ans = val.isValidMobileNumber(message);
		try {
			if (message.length() == 0) {
				throw new InvalidException(ExceptionType.ENTERED_EMPTY, "Mobile Number cannot be Empty.");
			} else if (ans == false) {
				throw new InvalidException(ExceptionType.ENTERED_WRONG, "Entered Mobile Number is Wrong.");
			}
		} catch (NullPointerException e) {
			throw new InvalidException(ExceptionType.ENTERED_NULL, "Mobile Number cannot be NULL.");
		}
		return ans;
	}
	
//email validation
	public  boolean isValidEmail(String msg) 
	{ 
		validateEntry pleaseValidateEmailId = (String inputMessage) -> {
			String regex = "^[a-zA-Z0-9]+(([\\.+-][a-z0-9]{1,})?)+@(?:[a-zA-Z0-9])+\\.[a-zA-Z]{2,4}+((\\.[a-z]{2,4})?)$";
			Pattern p = Pattern.compile(regex); 
			Matcher m = p.matcher(msg); 
			return m.matches(); 
		};
		return pleaseValidateEmailId.isValidate(msg);
	} 
	
	public  boolean validateEmail(String message) throws InvalidException{
		this.message = message;
		return validateEmail();
		}
	
	public  boolean validateEmail() throws InvalidException{
		UserValidation val = new UserValidation();
		boolean ans = val.isValidEmail(message);
		try {
			if (message.length() == 0) {
				throw new InvalidException(ExceptionType.ENTERED_EMPTY, "Email Id cannot be Empty.");
			} else if (ans == false) {
				throw new InvalidException(ExceptionType.ENTERED_WRONG, "Entered Email Id is Wrong.");
			}
		} catch (NullPointerException e) {
			throw new InvalidException(ExceptionType.ENTERED_NULL, "Email Id cannot be NULL.");
		}
		return ans;
	}
//	password validation
	public  boolean isValidPassword(String msg) 
	{ 
		validateEntry pleaseValidatePassword = (String inputMessage) -> {
			String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*\\W)[a-zA-Z0-9\\@\\_\\-\\+\\#\\*]{8,}$";
			Pattern p = Pattern.compile(regex); 
			Matcher m = p.matcher(msg); 
			return m.matches(); 
		};
		return pleaseValidatePassword.isValidate(msg);
	} 
	
	public boolean validatePassword(String message) throws InvalidException {
		this.message = message;
		return validatePassword();
	}
	
	public  boolean validatePassword() throws InvalidException{
		UserValidation val = new UserValidation();
		boolean ans = val.isValidPassword(message);
		try {
			if (message.length() == 0) {
				throw new InvalidException(ExceptionType.ENTERED_EMPTY, "Password cannot be Empty.");
			} else if (ans == false) {
				throw new InvalidException(ExceptionType.ENTERED_WRONG, "Entered Password is Wrong.");
			}
		} catch (NullPointerException e) {
			throw new InvalidException(ExceptionType.ENTERED_NULL, "Password cannot be NULL.");
		}
		return ans;
	}
}







