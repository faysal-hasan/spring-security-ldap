package com.jbc.spring.security.ldap.model.base;

public interface GenericEntity<T> {

    void update(T source);

    Long getId();

    T createNewInstance();
}
