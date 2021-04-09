package com.jbc.spring.security.ldap.service;

import com.jbc.spring.security.ldap.model.base.GenericEntity;
import com.jbc.spring.security.ldap.repository.GenericRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public abstract class GenericService<T extends GenericEntity<T>> {

  private final GenericRepository<T> repository;

  //  public Page<T> getPage(Pageable pageable) {
  //    return repository.findAll(pageable);
  //  }
  public List<T> findAll() {
    return repository.findAll();
  }

  public T findById(Long id) {
    return repository.findById(id).get();
  }

  //  @Transactional
  //  public T update(T updated) {
  //    T dbDomain = get(updated.getId());
  //    dbDomain.update(updated);
  //
  //    return repository.save(dbDomain);
  //  }

  //  @Transactional
  //  public T create(T newDomain) {
  //    T dbDomain = newDomain.createNewInstance();
  //    return repository.save(dbDomain);
  //  }

  //  @Transactional
  //  public void delete(Long id) {
  //    // check if object with this id exists
  //    get(id);
  //    repository.deleteById(id);
  //  }
}
