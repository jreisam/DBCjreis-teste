package com.jreis.teste.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jreis.teste.domain.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Sequence extends BaseEntity {

    private Integer numSeq;
    private Character indrCont;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Bcmsg bcmsg;

    public Sequence(Integer numSeq, Character indrCont) {
        this.numSeq = numSeq;
        this.indrCont = indrCont;
    }
}
