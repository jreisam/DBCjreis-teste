package com.jreis.teste.controller;

import com.jreis.teste.domain.Document;
import com.jreis.teste.repository.DocumentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/document"})
public class DocumentController {

    private DocumentRepository repository;

    DocumentController(DocumentRepository documentRepository) {
        this.repository = documentRepository;
    }


    @GetMapping
    public List findAll(){
        return (List) repository.findAll();
    }

    @PostMapping
    public Document create(@RequestBody Document document){
        return repository.save(document);
    }
}