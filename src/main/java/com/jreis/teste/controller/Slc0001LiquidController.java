package com.jreis.teste.controller;

import com.jreis.teste.domain.Slc0001Liquid;
import com.jreis.teste.domain.Slc0001Prodt;
import com.jreis.teste.repository.Slc0001LiquidRepository;
import com.jreis.teste.repository.Slc0001ProdtRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/slc0001liquid"})
public class Slc0001LiquidController {

    private Slc0001LiquidRepository repository;

    Slc0001LiquidController(Slc0001LiquidRepository slc0001LiquidRepository) {
        this.repository = slc0001LiquidRepository;
    }


    @GetMapping
    public List findAll() {
        return (List) repository.findAll();
    }

    @PostMapping
    public Slc0001Liquid create(@RequestBody Slc0001Liquid slc0001Liquid) {
        return repository.save(slc0001Liquid);
    }
}