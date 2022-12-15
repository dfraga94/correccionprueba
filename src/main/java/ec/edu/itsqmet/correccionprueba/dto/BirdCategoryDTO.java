package ec.edu.itsqmet.correccionprueba.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity	(name = "birdcategory")
public class BirdCategoryDTO {

	@Id
	private Integer id;
	private String name;

	
}
