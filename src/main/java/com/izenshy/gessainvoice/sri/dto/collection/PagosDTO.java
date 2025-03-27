package com.izenshy.gessainvoice.sri.dto.collection;

import com.izenshy.gessainvoice.sri.dto.single.PagoDTO;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;
@XmlRootElement(name = "pagos")
@Data
public class PagosDTO implements Serializable {
    private List<PagoDTO> pago;
}
