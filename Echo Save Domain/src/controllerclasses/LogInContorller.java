package controllerclasses;

import entities.EchoSaveAdmin;

public class LogInContorller {

	EchoSaveAdmin admin = EchoSaveAdmin.getInstance();

	public boolean logIn(String userName, String password) {

		return isUserNameAndPasswordValid(userName, password);
	}

	private boolean isUserNameAndPasswordValid(String userName, String password) {
		
		return isValid(userName, password) ? true : false;

	}

	private boolean isValid(String userName, String password) {

		boolean checkUserName = admin.getUserName().equals(userName);
		boolean checkPassword = admin.getPassword().equals(password);

		boolean result = checkPassword && checkUserName;

		return result;
	}

}
