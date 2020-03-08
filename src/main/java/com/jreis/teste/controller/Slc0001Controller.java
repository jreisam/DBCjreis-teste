package com.jreis.teste.controller;

import com.jreis.teste.domain.Slc0001;
import com.jreis.teste.domain.Slc0001Liquid;
import com.jreis.teste.repository.Slc0001LiquidRepository;
import com.jreis.teste.repository.Slc0001Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/slc0001"})
public class Slc0001Controller {

    private Slc0001Repository repository;

    Slc0001Controller(Slc0001Repository slc0001Repository) {
        this.repository = slc0001Repository;
    }


    @GetMapping
    public List findAll() {
        return (List) repository.findAll();
    }

    @PostMapping
    public Slc0001 create(@RequestBody Slc0001 slc0001) {
        return repository.save(slc0001);
    }
}