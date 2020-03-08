package com.jreis.teste.controller;

import com.jreis.teste.domain.Sismsg;
import com.jreis.teste.repository.SismsgRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/sismsg"})
public class SismsgController {

    private SismsgRepository repository;

    SismsgController(SismsgRepository sismsgRepository) {
        this.repository = sismsgRepository;
    }


    @GetMapping
    public List findAll(){
        return (List) repository.findAll();
    }

    @PostMapping
    public Sismsg create(@RequestBody Sismsg sismsg){
        return repository.save(sismsg);
    }
}