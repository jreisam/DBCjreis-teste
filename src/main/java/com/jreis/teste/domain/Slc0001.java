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
public class Slc0001 extends BaseEntity {
    private String codMsg;
    private String numCtrlSLC;
    private String ispbif;
    private String tpInf;
    private String dtHrSlc;
    private String dtMovto;

    @ManyToOne
    @JoinColumn
    private Sismsg sismsg;
}