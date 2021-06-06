/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import enumerations.StateOfSubmission;
import valueobjects.ActualDate;
import valueobjects.ProposedDate;
import valueobjects.SubmissionState;

/**
 *
 * @author soni
 */
public class Submission {

	private ActualDate actualDate;// done
	private ProposedDate proposedDate;// done
	private int pointsAwarded;// done
	private SubmissionState submissionState;// Testing Done
	private int weightInKg;
	private Material material;

	public Submission(StateOfSubmission state, Material material) {

		submissionState = new SubmissionState(state);
		proposedDate = new ProposedDate();
		actualDate = new ActualDate();
		this.material = material;
		
	}

	public StateOfSubmission getStateOfSubmission() {
		return submissionState.getSubmissionState();

	}

	public void setActualDate(int day, int month, int year) {
		//actualDate.set(year, month, day);

	}

	public ActualDate getActualDate() {
		return this.actualDate;
	}

	public void setProposedDate(int day, int month, int year) {
		proposedDate.set(year, month, day);

	}

	public ProposedDate getProposedDate() {
		return this.proposedDate;
	}

	public int getWeightInKg() {
		return weightInKg;
	}

	public void setWeightInKg(int weightInKg) {
		this.weightInKg = weightInKg;
	}

	public int getPointsAwarded() {
		return pointsAwarded;
	}

	public void setPointsAwarded(int pointsAwarded) {
		this.pointsAwarded = pointsAwarded;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}
}
