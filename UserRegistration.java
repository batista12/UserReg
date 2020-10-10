package com.capgemini.userregistration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;
public class UserRegistration {
	private static final Logger LOG = LogManager.getLogger(UserRegistration.class);
	public boolean validateFirstName(String firstName) {
		return firstName.matches("^[A-Z]{1}[a-z]{2,}$");
	}
	public boolean validateLastName(String lastName) {
		return lastName.matches("^[A-Z]{1}[a-z]{2,}$");
	}
	public boolean validateEmail(String emailId) {
		return emailId.matches("^[a-zA-Z0-9_]+([.+-]{1}[a-zA-Z0-9_]+)*[@]{1}[a-zA-Z0-
				9]+[.]{1}[a-zA-Z0-9]{2,}([.]{1}[a-zA-Z]{2,})?$");
	}
	public boolean validateMobileNo(String mobileNo) {
		return mobileNo.matches("^[0-9]{2}[ ][0-9]{10}$");
	}
	public boolean validatePassword(String password) {
		return password.matches("(?=^.{8,}$)(?=.[A-Z])(?=.[0-9])[a-zA-Z0-9][@#$%_][0-9azA-Z]");
	}
	public static void main( String[] args ) {
		UserRegistration userRegistration = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		LOG.info("First Name: ");
		String firstName = sc.nextLine();
		if(userRegistration.validateFirstName(firstName))
			LOG.info("Valid First Name");
		else
			LOG.info("Invalid First Name");
		LOG.info("Last Name: ");
		String lastName = sc.nextLine();
		if(userRegistration.validateLastName(lastName))
			LOG.info("Valid Last Name");
		else
			LOG.info("Invalid Last Name");
		LOG.info("Email ID: ");
		String emailId = sc.nextLine();
		if(userRegistration.validateEmail(emailId))
			LOG.info("Valid Email Id");
		else
			LOG.info("Invalid Email Id");
		LOG.info("Mobile No: ");
		String mobileNo = sc.nextLine();
		if(userRegistration.validateMobileNo(mobileNo))
			LOG.info("Valid Mobile No");
		else
			LOG.info("Invalid Mobile No");
		LOG.info("Password: ");
		String password = sc.nextLine();
		if(userRegistration.validatePassword(password))
			LOG.info("Valid Password");
		else
			LOG.info("Invalid Password");
	}
}
package com.capgemini.userregistration;
import org.junit.Assert;
import org.junit.Test;
public class UserRegistrationTest {
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateFirstName("Manasi");
		Assert.assertTrue(result);
	}

	@Test
	public void givenFirstName_WhenNotStartCapital_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateFirstName("Singh");
		Assert.assertFalse(result);
	}

	@Test
	public void givenFirstName_WhenContainOtherThanLetters_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateFirstName("m@nasi");
		Assert.assertFalse(result);
	}
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateLastName("Singh");
		Assert.assertTrue(result);
	}

	@Test
	public void givenLastName_WhenNotStartCapital_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateLastName("mans&hs");
		Assert.assertFalse(result);
	}

	@Test
	public void givenLastName_WhenContainOtherThanLetters_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateLastName("asnbm*bkj");
		Assert.assertFalse(result);
	}

	@Test
	public void givenEmailId_WhenPoper_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateEmail("manasisingh2602@gmail.com");
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmailId_WhenNotAtTheSymbol_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateEmail("manasi.com");
		Assert.assertFalse(result);
	}

	@Test
	public void givenMobileNo_WhenProper_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateMobileNo("91 8458587325");
		Assert.assertTrue(result);
	}

	@Test
	public void givenMobileNo_WhenNotProper_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateMobileNo("21477784");
		Assert.assertFalse(result);
	}



	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validatePassword("Manasi@29230");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_WhenNotProper_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validatePassword("maask89");
		Assert.assertFalse(result);
	}
}
