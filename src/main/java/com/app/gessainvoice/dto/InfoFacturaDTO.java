package com.app.gessainvoice.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class InfoFacturaDTO implements Serializable {
    private String fechaEmision;
    private String dirEstablecimiento;
    //private String contribuyenteEspecial;
    private String obligadoContabilidad;
    private String tipoIdentificacionComprador;
    private String razonSocialComprador;
    private String direccionComprador;
    private BigDecimal totalSinImpuestos;
    private BigDecimal totalDescuento;
    private String guiaRemision;
    private List<TotalImpuestoDTO> totalConImpuesto;
    private BigDecimal propina;
    private BigDecimal importeTotal;
    private String moneda;
    private List<PagoDTO> pagos;

}
