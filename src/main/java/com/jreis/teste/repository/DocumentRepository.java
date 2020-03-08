package com.jreis.teste.repository;

import com.jreis.teste.domain.Document;
import org.springframework.data.repository.CrudRepository;

public interface DocumentRepository extends CrudRepository<Document, Long> {
	
}

