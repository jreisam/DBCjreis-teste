package com.jreis.teste.controller;

import com.jreis.teste.domain.Bcmsg;
import com.jreis.teste.domain.Sequence;
import com.jreis.teste.domain.Slc0001LiquidProdt;
import com.jreis.teste.repository.BcmsgRepository;
import com.jreis.teste.repository.Slc0001LiquidProdtRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/slc0001liquidprodt"})
public class Slc0001LiquidProdtController {

    private Slc0001LiquidProdtRepository repository;

    Slc0001LiquidProdtController(Slc0001LiquidProdtRepository slc0001LiquidProdtRepository) {
        this.repository = slc0001LiquidProdtRepository;
    }


    @GetMapping
    public List findAll(){
        return (List) repository.findAll();
    }

    @PostMapping
    public Slc0001LiquidProdt create(@RequestBody Slc0001LiquidProdt slc0001LiquidProdt){
        return repository.save(slc0001LiquidProdt);
    }
}