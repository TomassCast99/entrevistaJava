package com.test.entrevista.service;

import java.util.List;

import com.test.entrevista.model.Padre;

public interface IPadreService extends IPersonaService<Padre, Integer> {
	
	List<Padre>listarTodo();
    Padre obtenerPorId(Integer id);
    Padre guardar(Padre t);
    Padre modificar(Padre t);
    void eliminarPorId(Integer id);

}
