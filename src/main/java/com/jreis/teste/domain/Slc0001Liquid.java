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
public class Slc0001Liquid extends BaseEntity {
    private String DtLiquid;
    private String NumSeqCicloLiquid;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Slc0001 slc0001;

    @OneToMany(cascade = CascadeType.MERGE,
            fetch = FetchType.EAGER,
            mappedBy = "slc0001Liquid")
    private Set<Slc0001Prodt> slc0001Prodts = new HashSet<>();
   
}