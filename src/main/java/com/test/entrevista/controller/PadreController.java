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

import com.test.entrevista.model.Padre;
import com.test.entrevista.service.IPadreService;


@RestController
@RequestMapping("/padre")
public class PadreController {
	@Autowired
	 public IPadreService padreService;

	    @GetMapping
		public ResponseEntity<List<Padre>> listarT() {
			List<Padre> lista = padreService.listarTodo();
	        return new ResponseEntity<>(lista, HttpStatus.OK);
	        
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Padre> obtenerTPorId(@PathVariable Integer id) {
	        Padre entidad = padreService.obtenerPorId(id);
	        return new ResponseEntity<>(entidad, HttpStatus.OK);
	    }

	    @PostMapping
	    public ResponseEntity<Padre> guardarT(@RequestBody Padre t) {
	        Padre entidad = padreService.guardar(t);
	        return new ResponseEntity<>(entidad, HttpStatus.CREATED);
	    }

	    @PutMapping
	    public ResponseEntity<Padre> modificarT(@RequestBody Padre t) {
	        Padre entidad = padreService.modificar(t);
	        return new ResponseEntity<>(entidad, HttpStatus.OK);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> eliminarTPorId(@PathVariable Integer id) {
	        padreService.eliminarPorId(id);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

}
