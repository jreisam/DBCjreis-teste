package com.jreis.teste.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jreis.teste.domain.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Bcmsg extends BaseEntity {
    private Integer identdEmissor;
    private Integer identdDestinatario;
    private String domSist;
    private BigInteger nUOp;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Document document;

    @OneToMany(cascade = CascadeType.MERGE,
            fetch = FetchType.EAGER,
            mappedBy = "bcmsg")
    private Set<Sequence> sequence = new HashSet<>();
;
}