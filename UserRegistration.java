package com.capgemini.userregistration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;
public class UserRegistration {
	private static final Logger LOG = LogManager.getLogger(UserRegistration.class);
	private boolean validateMobileNo(String no) {
		return no.matches("^[0-9]{2}[ ][0-9]{10}$");
	}
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		LOG.info("Mobile Number: ");
		String no = sc.nextLine();
		UserRegistration userRegistration = new UserRegistration();
		if(userRegistration.validateMobileNo(no))
			LOG.info("Valid");
		else
			LOG.info("Invalid");
	}
}
