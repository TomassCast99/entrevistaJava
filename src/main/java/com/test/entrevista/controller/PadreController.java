package com.test.entrevista.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entrevista.model.Padre;
import com.test.entrevista.service.IPadreService;
import com.test.entrevista.service.IPersonaService;

@RestController
@RequestMapping("/padre")
public abstract class PadreController extends PersonaController<Padre, Integer> {

	@Autowired
	private IPadreService padreService;

	@Override
	public IPersonaService<Padre, Integer> getService() {
		return padreService;
	}

}
