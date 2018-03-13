package com.besuricata.rest.services;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public abstract class BasicServiceAbstract<T, ID> implements BasicService<T, ID> {

    protected JpaRepository<T, ID> repository;

    @Override
    public T getById(ID identifier) {
        return repository.getOne(identifier);
    }

    @Override
    public Collection<T> findAll() {
        return repository.findAll();
    }

    @Override
    public T saveNew(T object) {
        return repository.save(object);
    }

    @Override
    public T update(T object) {
        return repository.save(object);
    }

    @Override
    public Boolean delete(ID identifier) {
        try {
            repository.deleteById(identifier);
            return true;
        } catch (EmptyResultDataAccessException exception) {
            return false;
        }
    }

}
