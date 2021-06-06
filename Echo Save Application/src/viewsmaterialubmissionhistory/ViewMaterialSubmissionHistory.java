package viewsmaterialubmissionhistory;

import java.util.List;

import controllerclasses.MaterialSubmissionController;
import entities.Material;

public class ViewMaterialSubmissionHistory {

	public List<MaterialSubmissionController> getMaterialSubmissionInfoList(int materialID) {

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
