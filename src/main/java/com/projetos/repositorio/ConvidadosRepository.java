package com.projetos.repositorio;


import com.projetos.entidades.Convidados;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ConvidadosRepository extends JpaRepository<Convidados, Integer> {

}
