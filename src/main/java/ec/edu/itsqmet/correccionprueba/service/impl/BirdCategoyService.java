package ec.edu.itsqmet.correccionprueba.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import ec.edu.itsqmet.correccionprueba.dto.BirdCategoryDTO;
import ec.edu.itsqmet.correccionprueba.repository.IbirdCategoryRepository;
import ec.edu.itsqmet.correccionprueba.service.IBirdCategoryService;

@Component
@Service
public class BirdCategoyService implements IBirdCategoryService  {

	@Autowired
	private IbirdCategoryRepository birdCategoryRepository;
	
	@Override
	public List<BirdCategoryDTO> getAll() {
		List<BirdCategoryDTO> result = birdCategoryRepository.findAll();
		return result;
	}

}
