package com.test.entrevista.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entrevista.model.Hijo;
import com.test.entrevista.service.IHijoService;
import com.test.entrevista.service.IPersonaService;

@RestController
@RequestMapping("/hijo")
public abstract class HijoController extends PersonaController<Hijo, Integer> {

	@Autowired
	private IHijoService hijoService;

	@Override
	public IPersonaService<Hijo, Integer> getService() {
		return hijoService;
	}

}
