package com.jreis.teste.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jreis.teste.domain.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import sun.swing.StringUIClientPropertyKey;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Sismsg extends BaseEntity {

    @ManyToOne
    @JoinColumn
    private Document document;

    @OneToMany(cascade = CascadeType.MERGE,
            fetch = FetchType.EAGER,
            mappedBy = "sismsg")
    private Set<Slc0001> slc0001s = new HashSet<>();

}