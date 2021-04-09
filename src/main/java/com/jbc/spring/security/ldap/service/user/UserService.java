package com.jbc.spring.security.ldap.service.user;

import com.jbc.spring.security.ldap.model.User;
import com.jbc.spring.security.ldap.repository.UserRepository;
import com.jbc.spring.security.ldap.service.GenericService;
import org.springframework.stereotype.Service;

@Service
public class UserService extends GenericService<User> implements BaseUserService {
  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    super(userRepository);
    this.userRepository = userRepository;
  }
}
