package com.test.entrevista.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IPersonaRepository <T,ID> extends JpaRepository<T, ID>{

}
