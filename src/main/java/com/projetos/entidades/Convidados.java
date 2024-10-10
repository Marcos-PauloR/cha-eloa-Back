package com.projetos.entidades;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class Convidados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String mensagem;
    private Integer acompanhates;
    private String presente;
    private boolean confirmado;
}
