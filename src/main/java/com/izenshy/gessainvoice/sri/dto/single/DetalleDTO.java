package com.izenshy.gessainvoice.sri.dto.single;

import com.izenshy.gessainvoice.sri.dto.collection.ImpuestosDTO;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;

@XmlRootElement(name = "detalle")
@Data
public class DetalleDTO implements Serializable {
    private String codigoPrincipal;
    private String descripcion;
    private BigDecimal cantidad;
    private BigDecimal precioUnitario;
    private BigDecimal descuento;
    private BigDecimal precioTotalSinImpuesto;
    private ImpuestosDTO impuestos;
}
