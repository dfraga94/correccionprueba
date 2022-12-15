package ec.edu.itsqmet.correccionprueba;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ec.edu.itsqmet.correccionprueba.service.IBirdCategoryService;

@SpringBootTest
class CorrecionpruebaApplicationTests {

	// @Autowired
	//private IbirdCategoryRepository birdCategoryRepository;
	
	@Autowired
	private IBirdCategoryService categoryService;
	
	@Test
	void contextLoads() {
		System.out.println(categoryService.getAll().size());
	}

}
