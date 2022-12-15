package ec.edu.itsqmet.correccionprueba.singleton;

import java.util.List;

import ec.edu.itsqmet.correccionprueba.dto.BirdCategoryDTO;
import ec.edu.itsqmet.correccionprueba.service.IBirdCategoryService;

public final class BirdCategorySingleton {

	private static BirdCategorySingleton instance;
	private static List<BirdCategoryDTO> birdcategory;

	private BirdCategorySingleton() {
	}

	public static List<BirdCategoryDTO> getBirdCategory(IBirdCategoryService birdCategoryService) {
		if (birdcategory == null) {
			birdcategory = birdCategoryService.getAll();
		}
		return birdcategory;

	}

	public BirdCategorySingleton getInstance() {
		if (instance == null) {
			instance = new BirdCategorySingleton();
		}
		return instance;
	}

}
