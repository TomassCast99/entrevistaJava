package com.test.entrevista.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.test.entrevista.service.IPersonaService;

public abstract class PersonaController <T,ID> {
	
	public abstract IPersonaService<T, ID> getService();

    @GetMapping
    public ResponseEntity<List<T>> listarT(){
        List lista = getService().listarTodo();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity <T> obtenerTPorId(@PathVariable ID id){
        T entidad = getService().obtenerPorId(id);
        return new ResponseEntity<>(entidad, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity <T> guardarT(@RequestBody T t){
        T entidad = getService().guardar(t);
        return new ResponseEntity<>(entidad, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity <T> modificarT(@RequestBody T t){
        T entidad = getService().modificar(t);
        return  new ResponseEntity<>(entidad, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <Void> eliminarTPorId(@PathVariable ID id){
        getService().eliminarPorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
