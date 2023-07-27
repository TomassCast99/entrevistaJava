package com.test.entrevista.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@MappedSuperclass
@Data
public abstract class Persona {
	
	private String nombre;
	private String apellido;
	private String dni;

}
