package com.bridgelabz.LambdaExpression;

import org.junit.Test;
import org.junit.Assert;
import java.util.*;

public class UserValidationTest {
	
	//@Ignore
	@Test
	public void when_Valid_First_Name_Returns_True() {
		try {
			System.out.println("Enter valid first name down below: ");
			Scanner sc = new Scanner(System.in);
			String str =sc.nextLine();
			UserValidation v = new UserValidation();
			boolean firstName = v.validateFirstName(str);
			Assert.assertEquals(true, firstName);
		} catch (InvalidException e) {
			e.printStackTrace();
		}
	}
	
	//@Ignore
	@Test
	public void when_Valid_Last_Name_Returns_True() {
		try {
			System.out.println("Enter valid last name down below: ");
			Scanner sc = new Scanner(System.in);
			String str =sc.nextLine();
			UserValidation v = new UserValidation();
			boolean lastName = v.validateLastName(str);
			Assert.assertEquals(true, lastName);
		} catch (InvalidException e) {
			e.printStackTrace();
		}
	}
	
	//@Ignore
	@Test
	public void when_Valid_Email_Returns_True() {
		try {
			System.out.println("Enter valid email id down below: ");
			Scanner sc = new Scanner(System.in);
			String str =sc.nextLine();
			UserValidation v = new UserValidation();
			boolean email = v.validateEmail(str);
			Assert.assertEquals(true, email);
		} catch (InvalidException e) {
			e.printStackTrace();
		}
	}
	
	//@Ignore
	@Test
	public void when_Valid_Mobile_Number_Returns_True() {
		try {
			System.out.println("Enter valid mobile number down below: ");
			Scanner sc = new Scanner(System.in);
			String str =sc.nextLine();
			UserValidation v = new UserValidation();
			boolean mnumber = v.validateMobileNumber(str);
			Assert.assertEquals(true, mnumber);
		} catch (InvalidException e) {
			e.printStackTrace();
		}
	}
	
	//@Ignore
	@Test
	public void when_Valid_Password_Returns_True() {
		try {
			System.out.println("Enter valid password down below: ");
			Scanner sc = new Scanner(System.in);
			String str =sc.nextLine();
			UserValidation v = new UserValidation();
			boolean password = v.validatePassword(str);
			Assert.assertEquals(true, password);
		} catch (InvalidException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
