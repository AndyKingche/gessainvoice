package com.izenshy.gessainvoice.sri.dto.collection;

import com.izenshy.gessainvoice.sri.dto.single.ImpuestoDTO;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
@XmlRootElement(name = "impuestos")
@Data
public class ImpuestosDTO implements Serializable {
    private ImpuestoDTO impuesto;
}
