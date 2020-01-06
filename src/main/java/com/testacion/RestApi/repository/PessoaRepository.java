package com.testacion.RestApi.repository;

import com.testacion.RestApi.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    Pessoa findById(long id);
}
