package com.izenshy.gessainvoice.controller;

import com.izenshy.gessainvoice.sri.invoice.FacturaSRI;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.io.StringWriter;

@RestController
@RequestMapping("api/v1/gessa/sri/")
@CrossOrigin
@Tag(name = "SRI", description = "Esta sección es dedicada a las operaciones relacionadas con los procesos de uso del SRI")
public class SRIController {
    @PostMapping("invoice-builder")
    public ResponseEntity<String> invoiceBuilder(@RequestBody FacturaSRI facturaSRI) {
        try {
            StringWriter stringWriter = new StringWriter();
            JAXBContext context = JAXBContext.newInstance(FacturaSRI.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(facturaSRI, stringWriter);
            String xmlFactura = stringWriter.toString();
            return ResponseEntity.ok(xmlFactura);
        } catch (Exception e) {
            System.out.println("ERROR"+e.getMessage());
            throw new RuntimeException(e);
        }

    }
}
