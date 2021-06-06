package controllerclasses;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LogInContorllerTest {

	@Test
	public void testLogIn() {

		// Arrange

		LogInContorller admin = new LogInContorller();
		String userName = "mehmood";
		String password = "1234";

		// Act
		boolean actual = admin.logIn(userName, password);
		boolean expected = true;
		
		// Assert
		
		assertEquals(expected, actual);
	}

}
