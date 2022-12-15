package ec.edu.itsqmet.correccionprueba;

import java.util.Iterator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ec.edu.itsqmet.correccionprueba.service.IBirdCategoryService;
import ec.edu.itsqmet.correccionprueba.singleton.BirdCategorySingleton;

@SpringBootTest
class CorrecionpruebaApplicationTests {

	// @Autowired
	// private IbirdCategoryRepository birdCategoryRepository;

	@Autowired
	private IBirdCategoryService categoryService;

	@Test
	void contextLoads() {

		for (int i = 0; i < 10; i++) {
			System.out.println(BirdCategorySingleton.getBirdCategory(categoryService).size());
		}

	}

}
