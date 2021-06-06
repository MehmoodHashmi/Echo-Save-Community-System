package maintainmaterialtype;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import entities.EchoSaveAdmin;
import entities.Material;

class MaintainMaterialTypeTest {

	private EchoSaveAdmin admin = EchoSaveAdmin.getInstance();

	@Test
	void testAddMaterial() {

		// Arrange
		MaintainMaterialType maintainMaterialType = new MaintainMaterialType();
		String material = "computer";
		String description = "computer was invented in 1956, \"" 
				+ "+ \"it is of different kind & used for \" "
				+ "+ \"different purposes";
		int pointsPerKg = 200;

		// Act
		maintainMaterialType.addMaterial(material, description, pointsPerKg);

		int expected = 1;
		int actual = Material.getMaterialList().size();

		// Assert
		assertEquals(expected, actual);

	}

	@Test
	public void testDeleteMaterial() {

		// Arrange
		MaintainMaterialType maintainMaterialType = new MaintainMaterialType();
		String material = "computer";
		String description = "computer was invented in 1956, \"" + " + \"it is of different kind & used for \" "
				+ "+ \"different purposes";
		int pointsPerKg = 200;

		// Act
		maintainMaterialType.addMaterial(material, description, pointsPerKg);

		maintainMaterialType.deleteMaterial(0);/*
												 * I'm not removing the "material" which i had added in the
												 * testAddMaterial() method, so i have to call deleteMaterial twice
												 */
		maintainMaterialType.deleteMaterial(0);

		int expected = 0;
		int actual = Material.getMaterialList().size();

		// Assert
		assertEquals(expected, actual);
	}

	@Test
	public void testChangeMaterial() {

		// Arrange
		MaintainMaterialType maintainMaterialType = new MaintainMaterialType();
		String materialName = "computer";
		
		String materialDescription = "computer was invented in 1956, \"" 
		+ " + \"it is of different kind & used for \" "
		+ "+ \"different purposes";
		
		int pointsPerKg = 200;

		// Act 

		int expectedPointsPerKg = 200;
		Material material = Material.getMaterialList().get(0);
		int actualPointsPerKg = material.getPointsPerKg();

		// Assert

		assertEquals(expectedPointsPerKg, actualPointsPerKg);

	}

}
