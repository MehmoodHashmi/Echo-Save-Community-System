package controllerclasses;

import java.util.ArrayList;
import java.util.List;

import entities.Collector;

public class RegisteredCollectorsController {
	
	private static List<Collector> registeredCollectorsList = new ArrayList<>();

	private RegisteredCollectorsController() {

	}

	public static boolean registerCollector(Collector collector) {

		return collector == null ? false : getRegisteredCollectorsList().add(collector);
	}

	public static List<Collector> getRegisteredCollectorsList() {
		return registeredCollectorsList;
	}
}
