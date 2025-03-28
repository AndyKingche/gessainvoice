package com.izenshy.gessainvoice.sri.invoice;

import com.izenshy.gessainvoice.sri.dto.collection.PagosDTO;
import com.izenshy.gessainvoice.sri.dto.collection.TotalConImpuestoDTO;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;

@XmlRootElement(name = "infoFactura")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class InfoFacturaDTO implements Serializable {
    @XmlElement(name = "fechaEmision")
    private String fechaEmision;

    @XmlElement(name = "dirEstablecimiento")
    private String dirEstablecimiento;

    @XmlElement(name = "obligadoContabilidad")
    private String obligadoContabilidad;

    @XmlElement(name = "tipoIdentificacionComprador")
    private String tipoIdentificacionComprador;

    @XmlElement(name = "razonSocialComprador")
    private String razonSocialComprador;

    @XmlElement(name = "direccionComprador")
    private String direccionComprador;

    @XmlElement(name = "totalSinImpuestos")
    private BigDecimal totalSinImpuestos;

    @XmlElement(name = "totalDescuento")
    private BigDecimal totalDescuento;

    @XmlElement(name = "totalConImpuesto")
    private TotalConImpuestoDTO totalConImpuesto;

    @XmlElement(name = "propina")
    private BigDecimal propina;

    @XmlElement(name = "importeTotal")
    private BigDecimal importeTotal;

    @XmlElement(name = "moneda")
    private String moneda;

    @XmlElement(name = "pagos")
    private PagosDTO pagos;
}
