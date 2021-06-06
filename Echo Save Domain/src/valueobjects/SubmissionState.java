/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valueobjects;

import enumerations.StateOfSubmission;

/**
 *
 * @author soni
 */
public class SubmissionState {
	// 1 submitted
	// 2 proposed

	private boolean submitted;
	private boolean proposed;

	public SubmissionState(StateOfSubmission status) {

		if (status.equals(StateOfSubmission.SUBMITTED)) {
			submitted = true;
		} else if (status.equals(StateOfSubmission.PROPOSED)) {
			proposed = true;

		}
	}

	public void setSubmissionState(StateOfSubmission status) {

		if (status.equals(StateOfSubmission.SUBMITTED)) {
			submitted = true;
		} else if (status.equals(StateOfSubmission.PROPOSED)) {
			proposed = true;

		}
	}

	public StateOfSubmission getSubmissionState() {

		if (submitted) {
			return StateOfSubmission.SUBMITTED;
		} else if (proposed) {
			return StateOfSubmission.PROPOSED;
		}
		return null;
	}
}
