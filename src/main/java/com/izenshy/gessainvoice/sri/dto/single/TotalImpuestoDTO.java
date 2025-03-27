package com.izenshy.gessainvoice.sri.dto.single;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;
@XmlRootElement(name = "totalImpuesto")
@Data
public class TotalImpuestoDTO implements Serializable {
    private String codigo;
    private String codigoPorcentaje;
    private BigDecimal baseImponible;
    private BigDecimal valor;
}
