package com.testacion.RestApi.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "DEPARTAMENTO")
public class Departamento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private  long id;

    private String depnome;

    @NotNull
    private int depnumero;

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getDepnome() { return depnome; }

    public void setDepnome(String depnome) { this.depnome = depnome; }

    public int getDepnumero() { return depnumero; }

    public void setDepnumero(int depnumero) { this.depnumero = depnumero; }
}
