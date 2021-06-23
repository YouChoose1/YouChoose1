package pt.iade.youchoose.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.youchoose.models.TipoEvento;


@RestController
@RequestMapping(path = "/api/tipoevento")
public class TipoEventoController {
    private Logger logger = LoggerFactory.getLogger(TipoEventoController.class);
    @Autowired
    private TipoEvento TipoEventoRepository;

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<TipoEvento> getUtilizasdores() {
        logger.info("Sending all type of events");
        return TipoEventoRepository.findAll();
    }

}