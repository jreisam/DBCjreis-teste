package com.jreis.teste.controller;

import com.jreis.teste.domain.Slc0001LiquidProdt;
import com.jreis.teste.domain.Slc0001Prodt;
import com.jreis.teste.repository.Slc0001LiquidProdtRepository;
import com.jreis.teste.repository.Slc0001ProdtRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/slc0001prodt"})
public class Slc0001ProdtController {

    private Slc0001ProdtRepository repository;

    Slc0001ProdtController(Slc0001ProdtRepository slc0001ProdtRepository) {
        this.repository = slc0001ProdtRepository;
    }


    @GetMapping
    public List findAll(){
        return (List) repository.findAll();
    }

    @PostMapping
    public Slc0001Prodt create(@RequestBody Slc0001Prodt slc0001Prodt){
        return repository.save(slc0001Prodt);
    }
}