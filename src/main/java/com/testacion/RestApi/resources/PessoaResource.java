package com.testacion.RestApi.resources;

import com.testacion.RestApi.models.Pessoa;
import com.testacion.RestApi.repository.PessoaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value="/api")

@Api(value = "API REST Pessoas")
@CrossOrigin(origins = "*")
public class PessoaResource {

    @Autowired
    PessoaRepository pessoaRepository;

    @GetMapping("/pessoas")
    @ApiOperation(value = "Retorna uma lista todas as pessoas")
    public List<Pessoa> listaPessoas(){
        return pessoaRepository.findAll();
    }

    @GetMapping("/pessoa/{id}")
    @ApiOperation(value = "Retorna uma pessoa específica")
    public Pessoa listaUmaPessoas(@PathVariable(value="id") long id){
        return pessoaRepository.findById(id);
    }

    @PostMapping("/pessoa")
    @ApiOperation(value = "Insere uma nova pessoa")
    public Pessoa salvaPessoa(@RequestBody @Valid Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }
    
    @DeleteMapping("/pessoa")
    @ApiOperation(value = "Remove uma pessoa")
    public void deletaPessoa(@RequestBody Pessoa pessoa){
        pessoaRepository.delete(pessoa);
    }
    @PutMapping("/pessoa")
    @ApiOperation(value = "Atualiza os dados de uma pessoa")
    public Pessoa atualizaPessoa(@RequestBody Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }
}
