package com.izenshy.gessainvoice.sri.dto.single;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;
@XmlRootElement(name = "pago")
@Data
public class PagoDTO implements Serializable {
    private String formaPago;
    private BigDecimal total;
    private String plazo;
    private String unidadTiempo;
}
