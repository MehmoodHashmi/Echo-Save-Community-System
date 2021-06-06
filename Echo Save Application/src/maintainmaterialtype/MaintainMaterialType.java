package maintainmaterialtype;

import java.util.List;

import entities.Material;

public class MaintainMaterialType {

	public List<Material> materialList = Material.getMaterialList();

	public void addMaterial(String materialDescription, String materialName, int pointsPerKg) {

		Material material = Material.materialFactory(materialDescription, materialName, pointsPerKg);
		materialList.add(material);
	}

	public void deleteMaterial(int materialID) {

		if (!(materialList.isEmpty()) && materialList.size() >= materialID) {

			materialList.remove(materialID);
		}

	}

	public boolean changeMaterial(int materialID, String materialName, String materialDescription, int pointsPerKg) {

		if (materialList.isEmpty()) {
			return false;

		} else if (materialList.size() <= materialID) {

			materialList.remove(materialID);
			Material material = Material.materialFactory("Apple", "is used for eating", 100);
			materialList.add(material);
		}
		return true;
	}

}
