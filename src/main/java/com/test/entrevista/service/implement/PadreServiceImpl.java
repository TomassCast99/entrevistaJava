package com.test.entrevista.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entrevista.model.Padre;
import com.test.entrevista.repository.IPadreRepository;
import com.test.entrevista.repository.IPersonaRepository;
import com.test.entrevista.service.IPadreService;

@Service
public class PadreServiceImpl extends PersonaServiceImpl<Padre, Integer> implements IPadreService {

	@Autowired
	private IPadreRepository padre;

	@Override
	public IPersonaRepository<Padre, Integer> getRepo() {

		return padre;
	}

}
