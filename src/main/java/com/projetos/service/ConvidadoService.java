package com.projetos.service;

import com.projetos.entidades.Convidados;
import com.projetos.repositorio.ConvidadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@Service
@RestController
@RequestMapping("/convidados")
public class ConvidadoService {

    @Autowired
    ConvidadosRepository repository;

    @PostMapping("/confirmar")
    public ResponseEntity<?> cadastrar(@RequestBody Convidados convidado){

       Convidados criado =repository.save(convidado);
       return  ResponseEntity.created(URI.create("/"+criado.getId())).build();
    }


    @GetMapping("/confirmados")
    public  ResponseEntity<List<Convidados>> listaTudo(){
        return ResponseEntity.ok(repository.findAll());
    }

}
