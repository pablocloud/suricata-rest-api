package com.besuricata.rest.controllers;

import java.util.Collection;

interface BasicController<T, ID> {

    T getById(ID identifier);

    Collection<T> get();

    T post(T object);

    T put(ID identifier, T object);

    Boolean delete(ID identifier);

}
