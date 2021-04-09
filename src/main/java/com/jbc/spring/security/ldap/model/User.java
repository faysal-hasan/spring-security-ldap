package com.jbc.spring.security.ldap.model;

import com.jbc.spring.security.ldap.model.base.GenericEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "tUser")
public class User implements Serializable, GenericEntity<User> {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "rid")
  private long rid;

  @Column(name = "firstName")
  private String firstName;

  @Column(name = "lastName")
  private String lastName;

  @Column(name = "email")
  private String email;

  @Override
  public void update(User user) {
  }

  @Override
  public Long getId() {
    return this.rid;
  }

  @Override
  public User createNewInstance() {
    return new User();
  }
}
