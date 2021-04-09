package com.jbc.spring.security.ldap.repository;

import com.jbc.spring.security.ldap.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends GenericRepository<User> {
}
