package controllerclasses;

import java.util.ArrayList;
import java.util.List;

import entities.Recycler;

public class RegisteredRecyclersController {

	private static List<Recycler> registeredRecyclersList = new ArrayList<>();

	private RegisteredRecyclersController() {

	}

	public static boolean registerRecycler(Recycler recycler) {

		return recycler == null ? false : getRegisteredRecyclersList().add(recycler);
	}

	public static List<Recycler> getRegisteredRecyclersList() {
		return registeredRecyclersList;
	}
}
