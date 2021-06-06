/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author soni
 */
public class EchoSaveAdmin {

	private String userName;
	private String password;

	private static EchoSaveAdmin admin;

	private EchoSaveAdmin() {

		this.userName = new String("mehmood");
		this.password = new String("1234");
	}

	public static EchoSaveAdmin getInstance() {

		if (admin == null) {
			admin = new EchoSaveAdmin();
			return admin;
		}
		return admin;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
