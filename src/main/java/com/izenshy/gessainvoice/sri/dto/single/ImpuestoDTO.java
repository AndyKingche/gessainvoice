package com.izenshy.gessainvoice.sri.dto.single;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;
@XmlRootElement(name = "impuesto")
@Data
public class ImpuestoDTO implements Serializable {
    private String codigo;
    private String codigoPorcentaje;
    private String tarifa;
    private BigDecimal baseImponible;
    private BigDecimal valor;
}
