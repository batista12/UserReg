package com.capgemini.userregistration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;
public class UserRegistration {
	private static final Logger LOG = LogManager.getLogger(UserRegistration.class);
	private boolean validatePassword(String password) {
		return password.matches("(?=^.{8,}$)(?=.[A-Z])(?=.[0-9])[a-zA-Z0-9][@#$%_][0-9azA-Z]");
	}
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		LOG.info("Password: ");
		String password = sc.nextLine();
		UserRegistration userRegistration = new UserRegistration();
		if(userRegistration.validatePassword(password))
			LOG.info("Valid");
		else
			LOG.info("Invalid");
	}
}
