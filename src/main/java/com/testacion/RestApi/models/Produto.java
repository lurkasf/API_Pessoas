package com.testacion.RestApi.models;


import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table( name = "PRODUTO")
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private  long id;

    @NotNull
    private String prodnome;

    @NotNull
    private  int quantidade ;

    @NotNull
    private BigDecimal precocompra;

    @NotNull
    private BigDecimal precovenda;

    private String categoria;





    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProdnome() {
        return prodnome;
    }

    public void setProdnome(String prodnome) {
        this.prodnome = prodnome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPrecocompra() {
        return precocompra;
    }

    public void setPrecocompra(BigDecimal precocompra) {
        this.precocompra = precocompra;
    }

    public BigDecimal getPrecovenda() {
        return precovenda;
    }

    public void setPrecovenda(BigDecimal precovenda) {
        this.precovenda = precovenda;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}