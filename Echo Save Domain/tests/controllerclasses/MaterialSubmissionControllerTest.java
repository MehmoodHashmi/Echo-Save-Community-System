package controllerclasses;

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

public class MaterialSubmissionControllerTest {

	@DisplayName("testing size of submissionInfo list")
	@Test
	public void testGetSubmissionList() {

		// Arrange

		// submission-0
		Material materialNumberOne = Material.materialFactory("laptop is new but broken", "Laptop", 10);
		Submission submission = new Submission(StateOfSubmission.PROPOSED, materialNumberOne);
		Recycler recycler = Recycler.recyclerFactory("1234", "mehmood");
		Collector collector = Collector.collectorFactory("1234", "atta");
		MaterialSubmissionController submissionInfo = new MaterialSubmissionController(submission, recycler, collector);

		// submission-1 
		Material materialNumberTwo = Material.materialFactory("laptop is new but broken", "mini computer", 12);
		Submission submission1 = new Submission(StateOfSubmission.SUBMITTED, materialNumberTwo);
		Recycler recycler1 = Recycler.recyclerFactory("1234", "hafeez");
		Collector collector1 = Collector.collectorFactory("1234", "ijaz");
		MaterialSubmissionController submissionInfo1 = new MaterialSubmissionController(submission1, recycler1, collector1);

		MaterialSubmissionController.addSubmissionInfo(submissionInfo);
		MaterialSubmissionController.addSubmissionInfo(submissionInfo1);

		// Act

		int actual = MaterialSubmissionController.allMaterialSubmissionHistory.size();
		int expected = 2;
		// Assert

		assertEquals(expected, actual);

	}

	@DisplayName("testing size of requested material Submissin list")
	@Test
	public void testSubmissionList() {

		// Arrange

		// submission-0

		Material materialNumberOne = Material.materialFactory("materialDescription", "Laptop", 111);
		Submission submission = new Submission(StateOfSubmission.PROPOSED, materialNumberOne);
		Recycler recycler = Recycler.recyclerFactory("1234", "mehmood");
		Collector collector = Collector.collectorFactory("1234", "atta");
		MaterialSubmissionController submissionInfo = new MaterialSubmissionController(submission, recycler, collector);

		// submission-1

		Material materialNumberTwo = Material.materialFactory("materialDescription1", "Computer", 21);
		Submission submission1 = new Submission(StateOfSubmission.SUBMITTED, materialNumberTwo);
		Recycler recycler1 = Recycler.recyclerFactory("1234", "hafeez");
		Collector collector1 = Collector.collectorFactory("1234", "ijaz");
		MaterialSubmissionController submissionInfo1 = new MaterialSubmissionController(submission1, recycler1, collector1);

		Material materialNumberThree = Material.materialFactory("materialDescription1", "Computer", 21);
		Submission submission2 = new Submission(StateOfSubmission.SUBMITTED, materialNumberThree);
		Recycler recycler2 = Recycler.recyclerFactory("1234", "hafeez");
		Collector collector2 = Collector.collectorFactory("1234", "ijaz");
		MaterialSubmissionController submissionInfo2 = new MaterialSubmissionController(submission2, recycler2, collector2);

		
		MaterialSubmissionController.addSubmissionInfo(submissionInfo);
		MaterialSubmissionController.addSubmissionInfo(submissionInfo1);
		MaterialSubmissionController.addSubmissionInfo(submissionInfo2);

//		ArrayList<SubmissionInfo> submissionList = SubmissionInfo.getSubmissionList("mini computer");// must be 1
//		ArrayList<SubmissionInfo> submissionList = SubmissionInfo.getSubmissionList("Computer");// must be 2
		
		ArrayList<MaterialSubmissionController> submissionList; 
		submissionList = (ArrayList<MaterialSubmissionController>) MaterialSubmissionController.getMaterialSubmissionList("Laptop");// must be 2
		
		// Act

		int actual = submissionList.size();
		int expected = 2;
		// Assert

		assertEquals(expected, actual);

	}

}
