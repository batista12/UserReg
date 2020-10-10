package com.capgemini.userregistration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;
public class UserRegistration {
	private static final Logger LOG = LogManager.getLogger(UserRegistration.class);
	private boolean validateLastName(String lastName) {
		return lastName.matches("^[A-Z]{1}[a-z]{2,}$");
	}
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		LOG.info("Last Name: ");
		String lastName = sc.nextLine();
		UserRegistration userRegistration = new UserRegistration();
		if(userRegistration.validateLastName(lastName))
			LOG.info("Valid");
		else
			LOG.info("Invalid");
	}
}
