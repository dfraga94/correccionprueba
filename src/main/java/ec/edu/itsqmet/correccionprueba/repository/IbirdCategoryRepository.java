package ec.edu.itsqmet.correccionprueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.itsqmet.correccionprueba.dto.BirdCategoryDTO;

public interface IbirdCategoryRepository extends JpaRepository<BirdCategoryDTO, Integer>{

}
