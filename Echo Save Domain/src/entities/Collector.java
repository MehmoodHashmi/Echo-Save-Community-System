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
public class Collector extends User {

	private String address;

	private Collector(String password, String userName) {
		super(password, userName);
		address = new String();

	}

	public static Collector collectorFactory(String password, String userName) {
		
		return new Collector(password, userName);
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
