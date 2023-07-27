package com.test.entrevista.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entrevista.model.Hijo;
import com.test.entrevista.repository.IHijoRepository;
import com.test.entrevista.repository.IPersonaRepository;
import com.test.entrevista.service.IHijoService;

@Service
public class HijoServiceImpl extends PersonaServiceImpl<Hijo, Integer> implements IHijoService {

	@Autowired
	private IHijoRepository hijo;

	@Override
	public IPersonaRepository<Hijo, Integer> getRepo() {

		return hijo;
	}

}
