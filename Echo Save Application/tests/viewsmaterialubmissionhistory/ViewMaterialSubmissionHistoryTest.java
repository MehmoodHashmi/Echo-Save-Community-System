package viewsmaterialubmissionhistory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import controllerclasses.MaterialSubmissionController;
import entities.Collector;
import entities.Material;
import entities.Recycler;
import entities.Submission;
import enumerations.StateOfSubmission;
import maintainmaterialtype.MaintainMaterialType;
import viewsmaterialubmissionhistory.ViewMaterialSubmissionHistory;

public class ViewMaterialSubmissionHistoryTest {

	@DisplayName("when material is submitted")
	@Test
	public void whenMaterialIsSubmitted() {

		// Arrange
		ViewMaterialSubmissionHistory viewHistory = new ViewMaterialSubmissionHistory();
		MaintainMaterialType admin = new MaintainMaterialType();

		admin.addMaterial("Computers are well designed nowadys", "Computer", 10);
		admin.addMaterial("Laptops are well designed nowadys", "Laptop", 12);
		admin.addMaterial("Computers are well designed nowadys", "Computer", 13);

		Material material = Material.getMaterialList().get(0);
		Material materialTwo = Material.getMaterialList().get(2);

		Submission materialSubmission = new Submission(StateOfSubmission.PROPOSED, material);
		Submission materialSubmissionTwo = new Submission(StateOfSubmission.SUBMITTED, materialTwo);

		Recycler recycler = Recycler.recyclerFactory("1234", "Mehmood");
		Collector collector = Collector.collectorFactory("4321", "atta");
		Collector collectorTwo = Collector.collectorFactory("4321", "Hafeez");

		MaterialSubmissionController info = new MaterialSubmissionController(materialSubmission, recycler, collector);
		MaterialSubmissionController infoTwo = new MaterialSubmissionController(materialSubmissionTwo, recycler, collectorTwo);

		MaterialSubmissionController.addSubmissionInfo(info);
		MaterialSubmissionController.addSubmissionInfo(infoTwo);

		// Act
		int materialID = 0;
		ArrayList<MaterialSubmissionController> materialSubmissionInformationList;
		materialSubmissionInformationList = (ArrayList<MaterialSubmissionController>) viewHistory.getMaterialSubmissionInfoList(materialID);

		int actualSubmission = materialSubmissionInformationList.size();
		int expectedSubmission = 2;

		// Assert
		assertEquals(expectedSubmission, actualSubmission);

	}
	
	/*
	 * @DisplayName("when material is not submitted")
	 * 
	 * @Test public void testGetMaterialSubmissionList() {
	 * 
	 * // Arrange ViewSubmissionHistory viewHistory = new ViewSubmissionHistory();
	 * MaintainMaterialType maintainMaterialType = new MaintainMaterialType();
	 * 
	 * maintainMaterialType.addMaterial("Computers are well designed nowadys",
	 * "Computer", 10);
	 * maintainMaterialType.addMaterial("Laptops are well designed nowadys",
	 * "Laptop", 12);
	 * maintainMaterialType.addMaterial("Computers are well designed nowadys",
	 * "Computer", 13);
	 * 
	 * // Act int materialID = 0; ArrayList<SubmissionInfo>
	 * submissionInformationList; submissionInformationList =
	 * (ArrayList<SubmissionInfo>)
	 * viewHistory.getMaterialSubmissionInfoList(materialID);
	 * 
	 * int actual = submissionInformationList.size(); int expected = 0;
	 * 
	 * // Assert assertEquals(expected, actual);
	 * 
	 * }
	 */
}
