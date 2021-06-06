/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import enumerations.EchoLevel;

/**
 *
 * @author soni
 */
public class Recycler extends User {

	private EchoLevel echoLevel;
	private int points;

	private Recycler(String password, String userName) {
		super(password, userName);
	}

	public static Recycler recyclerFactory(String password, String userName) {

		return new Recycler(password, userName);
	}

	public void setEchoLevel(EchoLevel level) {
		echoLevel = level;
	}

	public EchoLevel getEchoLevel() {

		return echoLevel;
	}

	public int getPoints() {

		return points;
	}

	public void setPoints(int points) {

		this.points = points;
	}
}
