package com.izenshy.gessainvoice.sri.dto.collection;

import com.izenshy.gessainvoice.sri.dto.single.TotalImpuestoDTO;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;
@XmlRootElement(name = "totalConImpuestos")
@Data
public class TotalConImpuestoDTO implements Serializable {
    private List<TotalImpuestoDTO> totalImpuesto;
}
