package com.test.entrevista.service;

import java.util.List;

import com.test.entrevista.model.Hijo;

public interface IHijoService extends IPersonaService<Hijo, Integer> {
	
	List<Hijo>listarTodo();
    Hijo obtenerPorId(Integer id);
    Hijo guardar(Hijo t);
    Hijo modificar(Hijo t);
    void eliminarPorId(Integer id);

}
