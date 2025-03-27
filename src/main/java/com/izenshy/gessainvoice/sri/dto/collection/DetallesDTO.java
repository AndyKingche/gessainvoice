package com.izenshy.gessainvoice.sri.dto.collection;

import com.izenshy.gessainvoice.sri.dto.single.DetalleDTO;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;
@XmlRootElement(name = "detalles")
@Data
public class DetallesDTO implements Serializable {
    private List<DetalleDTO> detalle;
}
