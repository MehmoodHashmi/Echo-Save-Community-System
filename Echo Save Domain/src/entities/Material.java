package entities;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Material {

	private static ArrayList<Material> materialList = new ArrayList<Material>();

	
	private String materialDescription;
	private String materialName;
	private int pointsPerKg;

	private Material(String materialDescription, String materialName, int pointsPerKg) {
		this.materialDescription = new String(materialDescription);
		this.materialName = new String(materialName);
		this.pointsPerKg = pointsPerKg;
	}

	public static Material materialFactory(String materialDescription, String materialName, int pointsPerKg) {
		return new Material(materialDescription, materialName, pointsPerKg);

	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public int getPointsPerKg() {
		return pointsPerKg;
	}

	public void setPointsPerKg(int pointsPerKg) {
		this.pointsPerKg = pointsPerKg;
	}

	public String getMaterialDescription() {
		return materialDescription;
	}

	public void setMaterialDescription(String materialDescription) {
		this.materialDescription = materialDescription;
	}

	public static ArrayList<Material> getMaterialList() {
		return materialList;
	}
}
