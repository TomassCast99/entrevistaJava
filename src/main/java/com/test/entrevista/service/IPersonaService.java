package com.test.entrevista.service;

import java.util.List;

public interface IPersonaService<T, ID> {

	List<T> listarTodo();

	T obtenerPorId(ID id);

	T guardar(T t);

	T modificar(T t);

	void eliminarPorId(ID id);

}
