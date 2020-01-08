package com.testacion.RestApi.resources;


import com.testacion.RestApi.models.Departamento;
import com.testacion.RestApi.models.Pessoa;
import com.testacion.RestApi.repository.DepartamentoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value="/api")

@Api(value="API REST Departamentos")
@CrossOrigin(origins="*")
public class DepartamentoResource {
    @Autowired
    DepartamentoRepository departamentoRepository;

    @GetMapping("/departamentos")
    @ApiOperation(value = "Retorna uma lista todos os departamentos")
    public List<Departamento> listaDepartamentos(){
        return departamentoRepository.findAll();
    }

    @GetMapping("/departamento/{id}")
    @ApiOperation(value = "Retorna um departamento específico")
    public Departamento listaUmDepartamento(@PathVariable(value="id") long id){
        return departamentoRepository.findById(id);
    }

    @PostMapping("/departamento")
    @ApiOperation(value = "Insere um novo departamento")
    public Departamento salvaDepartamento(@RequestBody @Valid Departamento departamento){
        return departamentoRepository.save(departamento);
    }

    @DeleteMapping("/departamento")
    @ApiOperation(value = "Remove um departamento")
    public void deletaDepartamento(@RequestBody Departamento departamento){
        departamentoRepository.delete(departamento);
    }
    @PutMapping("/departamento")
    @ApiOperation(value = "Atualiza os dados de um departamento")
    public Departamento atualizaDepartamento(@RequestBody Departamento departamento){
        return departamentoRepository.save(departamento);
    }
}
