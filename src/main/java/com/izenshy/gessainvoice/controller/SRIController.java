package com.izenshy.gessainvoice.controller;

import com.izenshy.gessainvoice.sri.invoice.FacturaSRI;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

@RestController
@RequestMapping("api/v1/gessa/sri/")
@CrossOrigin
public class SRIController {
    @PostMapping("invoice-builder")
    public ResponseEntity<String> invoiceBuilder(@RequestBody FacturaSRI facturaSRI) throws JAXBException {
        StringWriter stringWriter = new StringWriter();
        JAXBContext context = JAXBContext.newInstance(FacturaSRI.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(facturaSRI, stringWriter);


        String xmlFactura = stringWriter.toString();
        return ResponseEntity.ok(xmlFactura);
    }
}
