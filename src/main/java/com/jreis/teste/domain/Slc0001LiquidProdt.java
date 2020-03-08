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
public class Slc0001LiquidProdt extends BaseEntity {

    private String identdLinhaBilat, tpDeb_Cred, isPBIFCredtd, isPBIFDebtd, vlrLanc;
    private String cnpjLiqdantDebtd, nomCliDebtd, cnpjNLiqdantCredtd, nomCliCredtd, tpTranscSLC;

    @ManyToOne
    @JoinColumn
    private Slc0001Prodt slc0001Prodt;
}