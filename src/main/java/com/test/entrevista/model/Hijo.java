package com.test.entrevista.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "hijo")
public class Hijo extends Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idHijo;

}
