package com.jreis.teste.controller;

import com.jreis.teste.domain.Sequence;
import com.jreis.teste.repository.SequenceRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/sequence"})
public class SequenceController {

    private SequenceRepository repository;

    SequenceController(SequenceRepository sequenceRepository) {
        this.repository = sequenceRepository;
    }
    // métodos do CRUD aqui

    @GetMapping
    public List findAll(){
        return (List) repository.findAll();
    }

    @PostMapping
    public Sequence create(@RequestBody Sequence sequence){
        return repository.save(sequence);
    }
}