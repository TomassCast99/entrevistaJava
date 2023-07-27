package com.test.entrevista.service.implement;

import java.util.List;

import com.test.entrevista.repository.IPersonaRepository;
import com.test.entrevista.service.IPersonaService;

public abstract class PersonaServiceImpl<T, ID> implements IPersonaService<T, ID> {

	public abstract IPersonaRepository<T, ID> getRepo();

	@Override
	public List<T> listarTodo() {

		return getRepo().findAll();
	}

	@Override
	public T obtenerPorId(ID id) {

		return getRepo().findById(id).orElse(null);
	}

	@Override
	public T guardar(T t) {

		return getRepo().save(t);
	}

	@Override
	public T modificar(T t) {

		return getRepo().save(t);
	}

	@Override
	public void eliminarPorId(ID id) {

		getRepo().deleteById(id);

	}

}
