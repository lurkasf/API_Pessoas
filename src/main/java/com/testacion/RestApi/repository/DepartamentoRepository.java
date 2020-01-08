package com.testacion.RestApi.repository;

import com.testacion.RestApi.models.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {

    Departamento findById(long id);
}
