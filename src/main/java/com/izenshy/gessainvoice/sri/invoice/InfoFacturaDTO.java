package com.izenshy.gessainvoice.sri.invoice;

import com.izenshy.gessainvoice.sri.dto.collection.TotalConImpuestoDTO;
import com.izenshy.gessainvoice.sri.dto.single.PagoDTO;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
@XmlRootElement(name = "infoFactura")
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
    private List<TotalConImpuestoDTO> totalConImpuesto;
    private BigDecimal propina;
    private BigDecimal importeTotal;
    private String moneda;
    private List<PagoDTO> pagos;

}
