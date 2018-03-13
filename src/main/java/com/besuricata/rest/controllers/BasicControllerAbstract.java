package com.besuricata.rest.controllers;

import com.besuricata.rest.services.BasicService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

public abstract class BasicControllerAbstract<T, ID> implements BasicController<T, ID> {

    protected BasicService<T, ID> service;

    @RequestMapping(value = {"/{identifier}", "/{identifier}/"}, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @Override
    public T getById(@PathVariable ID identifier) {
        return service.getById(identifier);
    }

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @Override
    public Collection<T> get() {
        return service.findAll();
    }

    @RequestMapping(value = {"", "/"}, method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @Override
    public T post(T object) {
        return service.saveNew(object);
    }

    @RequestMapping(value = {"/{identifier}", "/{identifier}/"}, method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @Override
    public T put(@PathVariable ID identifier, T object) {
        return service.update(object);
    }

    @RequestMapping(value = {"/{identifier}", "/{identifier}/"}, method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @Override
    public Boolean delete(@PathVariable ID identifier) {
        return service.delete(identifier);
    }

}
