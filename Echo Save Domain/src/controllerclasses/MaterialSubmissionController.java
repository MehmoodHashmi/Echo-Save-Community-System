package controllerclasses;

import java.util.ArrayList;
import java.util.List;

import entities.Material;
import entities.Submission;
import entities.User;

public class MaterialSubmissionController {

	public static ArrayList<MaterialSubmissionController> 	allMaterialSubmissionHistory = new ArrayList<>();

	private User collector;
	private User recycler;
	private Submission submission;

	public MaterialSubmissionController(Submission submission, User recycler, User collector) {
		this.collector = collector;
		this.recycler = recycler;
		this.submission = submission;
	}

	public static List<MaterialSubmissionController> getMaterialSubmissionList(String materialName) {

		ArrayList<MaterialSubmissionController> requestedMaterialSubmissionHistory = new ArrayList<>();

		if (allMaterialSubmissionHistory.isEmpty()) {
			return new ArrayList<>();
		} else {
			for (int index = 0; index < allMaterialSubmissionHistory.size(); index++) {

				MaterialSubmissionController submissionInfo = allMaterialSubmissionHistory.get(index);
				Submission submission = submissionInfo.getSubmission();
				Material material = submission.getMaterial();
				
				String mName = material.getMaterialName();
				if (mName.equals(materialName)) {
					requestedMaterialSubmissionHistory.add(submissionInfo);
				}

			}
		}

		return requestedMaterialSubmissionHistory;
	}

	public static void addSubmissionInfo(MaterialSubmissionController submissionInfo) {

		allMaterialSubmissionHistory.add(submissionInfo);
	}

	public Submission getSubmission() {
		return submission;
	}

	public void setSubmission(Submission submission) {
		this.submission = submission;
	}

	public User getRecycler() {
		return recycler;
	}

	public void setRecycler(User recycler) {
		this.recycler = recycler;
	}

	public User getCollector() {
		return collector;
	}

	public void setCollector(User collector) {
		this.collector = collector;
	}

}
