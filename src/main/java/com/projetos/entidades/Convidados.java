package com.projetos.entidades;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Builder
public class Convidados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    @Column(name = "mensagem", columnDefinition = "TEXT")
    private String mensagem;
    private List<String>  acompanhates;
    private String presente;
    private boolean confirmado;

    public Convidados(Integer id, String nome, String mensagem, List<String> acompanhates, String presente,
                      boolean confirmado) {
        this.id           = id;
        this.nome         = nome;
        this.mensagem     = mensagem;
        this.acompanhates = acompanhates;
        this.presente     = presente;
        this.confirmado   = confirmado;
    }

    public Convidados() {
    }
}
