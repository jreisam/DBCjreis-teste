package com.jreis.teste.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jreis.teste.domain.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Slc0001Prodt extends BaseEntity {

    private String CodProdt;

	@ManyToOne
	@JoinColumn
	private Slc0001Liquid slc0001Liquid;

	@OneToMany(cascade = CascadeType.MERGE,
			fetch = FetchType.EAGER,
			mappedBy = "slc0001Prodt")
	private Set<Slc0001LiquidProdt> slc0001LiquidProdts = new HashSet<>();
   
}