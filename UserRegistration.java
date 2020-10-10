package com.capgemini.userregistration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;
public class UserRegistration {
	private static final Logger LOG = LogManager.getLogger(UserRegistration.class);
	private boolean validateEmail(String mail) {
		return mail.matches("^[a-zA-Z0-9_]+([.+-]{1}[a-zA-Z0-9_]+)*[@]{1}[a-zA-Z0-
				9]+[.]{1}[a-zA-Z0-9]{2,}([.]{1}[a-zA-Z]{2,})?$");
	}
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		LOG.info("Email Id: ");
		String mail = sc.nextLine();
		UserRegistration userRegistration = new UserRegistration();
		if(userRegistration.validateEmail(mail))
			LOG.info("Valid");
		else
			LOG.info("Invalid");
	} }
