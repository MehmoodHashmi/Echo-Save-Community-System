/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.net.PasswordAuthentication;

/**
 *
 * @author soni
 */
public abstract class User {

	private int totalPoints;
	private String fullName;
	private PasswordAuthentication userNameAndPassword;

	public User(String password, String userName) {
		userNameAndPassword = new PasswordAuthentication(userName, password.toCharArray());
	}

	public int getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public PasswordAuthentication getUserNameAndPassword() {
		return userNameAndPassword;
	}

}
