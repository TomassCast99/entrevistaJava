package com.test.entrevista.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entrevista.model.Hijo;
import com.test.entrevista.service.IHijoService;

@RestController
@RequestMapping("/hijo")
public class HijoController {
	@Autowired
	 public IHijoService hijoService;

	    @GetMapping
		public ResponseEntity<List<Hijo>> listarT() {
			List<Hijo> lista = hijoService.listarTodo();
	        return new ResponseEntity<>(lista, HttpStatus.OK);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Hijo> obtenerTPorId(@PathVariable Integer id) {
	        Hijo entidad = hijoService.obtenerPorId(id);
	        return new ResponseEntity<>(entidad, HttpStatus.OK);
	    }

	    @PostMapping
	    public ResponseEntity<Hijo> guardarT(@RequestBody Hijo t) {
	        Hijo entidad = hijoService.guardar(t);
	        return new ResponseEntity<>(entidad, HttpStatus.CREATED);
	    }

	    @PutMapping
	    public ResponseEntity<Hijo> modificarT(@RequestBody Hijo t) {
	        Hijo entidad = hijoService.modificar(t);
	        return new ResponseEntity<>(entidad, HttpStatus.OK);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> eliminarTPorId(@PathVariable Integer id) {
	        hijoService.eliminarPorId(id);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

}
