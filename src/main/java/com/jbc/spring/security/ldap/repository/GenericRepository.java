package com.jbc.spring.security.ldap.repository;

import com.jbc.spring.security.ldap.model.base.GenericEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericRepository<T extends GenericEntity<T>> extends JpaRepository<T, Long> {
}
