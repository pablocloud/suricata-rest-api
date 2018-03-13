package com.besuricata.rest.controllers.impl;

import com.besuricata.rest.controllers.BasicControllerAbstract;
import com.besuricata.rest.domain.Suricata;
import com.besuricata.rest.services.impl.SuricataService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(value = "/suricata")
public class SuricataController extends BasicControllerAbstract<Suricata, Long> {

    public SuricataController(SuricataService suricataService) {
        this.service = suricataService;
    }

    @RequestMapping(value = {"/name", "/name/"}, method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Suricata getByName(Suricata suricata) {
        return ((SuricataService) service).findSuricataByName(suricata.getName());
    }

    @RequestMapping(value = {"/height", "/height/"}, method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Collection<Suricata> getAllByMinimunHeight(Suricata suricata) {
        return ((SuricataService) service).findAllByMinimunHeight(suricata.getHeight());
    }

}
