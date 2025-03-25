package com.app.gessainvoice.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
@Data
public class TotalImpuestoDTO implements Serializable {
    private String codigoPorcentaje;
    private BigDecimal descuentoAdicional;

    private BigDecimal baseImponible;
    private BigDecimal tarifa;

    private BigDecimal valor;
}
