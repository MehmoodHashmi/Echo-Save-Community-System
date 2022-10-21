package viewsmaterialubmissionhistory;

import java.util.List;

import controllerclasses.MaterialSubmissionController;
import entities.Material;

public class MaterialSubmissionHistory {// I'm working in Intellij

	public List<MaterialSubmissionController> getMaterialSubmissionList(int materialID) {

		String materialName = getMaterialName(materialID);
		return filterMaterialSubmission(materialName);
	}

	private List<MaterialSubmissionController> filterMaterialSubmission(String materialName) {
		return MaterialSubmissionController.getMaterialSubmissionList(materialName);
	}

	private String getMaterialName(int materialID) {

		List<Material> materialList;
		materialList = Material.getMaterialList();

		if (!(materialList.isEmpty())) {
			Material material = Material.getMaterialList().get(materialID);
			return material.getMaterialName();
		}

		return "";
	}
}
