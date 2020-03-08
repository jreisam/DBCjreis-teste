package com.jreis.teste.controller;

import com.jreis.teste.domain.Bcmsg;
import com.jreis.teste.repository.BcmsgRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/bcmsg"})
public class BcmsgController {

    private BcmsgRepository repository;

    BcmsgController(BcmsgRepository bcmsgRepository) {
        this.repository = bcmsgRepository;
    }


    @GetMapping
    public List findAll(){
        return (List) repository.findAll();
    }

    @PostMapping
    public Bcmsg create(@RequestBody Bcmsg bcmsg){
        return repository.save(bcmsg);
    }
}