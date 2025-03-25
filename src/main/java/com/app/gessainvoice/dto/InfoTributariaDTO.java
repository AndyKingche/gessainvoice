package com.app.gessainvoice.dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class InfoTributariaDTO implements Serializable {
    private String ambiente;
    private String tipoEmision;
    private String razonSocial;
    private String nombreComercial;
    private String ruc;
    private String claveAcceso;
    private String codDoc;
    private String estab;
    private String ptoEmi;
    private String secuencial;
    private String dirMatriz;
}
