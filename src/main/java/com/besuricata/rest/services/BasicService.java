package com.besuricata.rest.services;

import java.util.Collection;

public interface BasicService<T, ID> {

    T getById(ID identifier);

    Collection<T> findAll();

    T saveNew(T object);

    T update(T object);

    Boolean delete(ID identifier);

}
