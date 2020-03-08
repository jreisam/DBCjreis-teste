package com.jreis.teste.repository;

import com.jreis.teste.domain.Sequence;
import org.springframework.data.repository.CrudRepository;

public interface SequenceRepository extends CrudRepository<Sequence, Long> {
	
}

