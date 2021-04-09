package com.jbc.spring.security.ldap.controller;

import com.jbc.spring.security.ldap.model.base.GenericEntity;
import com.jbc.spring.security.ldap.service.GenericService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public abstract class GenericController<T extends GenericEntity<T>> {

  private final GenericService<T> service;

  //  @GetMapping("")
  //  public ResponseEntity<Page<T>> getPage(Pageable pageable) {
  //    return ResponseEntity.ok(service.getPage(pageable));
  //  }

  @GetMapping("")
  public ResponseEntity<List<T>> findAll() {
    return ResponseEntity.ok(service.findAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<T> findById(@PathVariable Long id) {
    return ResponseEntity.ok(service.findById(id));
  }

  //  @PutMapping("")
  //  public ResponseEntity<T> update(@RequestBody T updated) {
  //    return ResponseEntity.ok(service.update(updated));
  //  }

  //  @PostMapping("")
  //  public ResponseEntity<T> create(@RequestBody T created) {
  //    return ResponseEntity.ok(service.create(created));
  //  }

  //  @DeleteMapping("/{id}")
  //  public ResponseEntity<String> delete(@PathVariable Long id) {
  //    service.delete(id);
  //    return ResponseEntity.ok("Ok");
  //  }
}
