package com.izenshy.gessainvoice.sri.invoice;

import com.izenshy.gessainvoice.sri.dto.collection.DetallesDTO;
import com.izenshy.gessainvoice.sri.dto.single.InfoTributariaDTO;
import lombok.Data;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
@XmlRootElement(name = "factura")
@Data
public class FacturaSRI implements Serializable {
    @XmlAttribute(name = "id")
    private String id;
    @XmlAttribute(name = "version")
    private String version;
    private InfoTributariaDTO infoTributaria;
    private InfoFacturaDTO infoFactura;
    private DetallesDTO detalles;
}
