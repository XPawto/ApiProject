package com.domain.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.models.entities.TrustApi;
import com.domain.services.TrustService;

@RestController
@RequestMapping("api/trust")
public class TrustController {

  @Autowired
  private TrustService trustService;

  @PostMapping
  public TrustApi create(@RequestBody TrustApi trustApi){
    return trustService.save(trustApi);
  }

  @GetMapping
  public Iterable<TrustApi> findAll(){
    return trustService.findAll();
  }

  @GetMapping("/{id}")
  public TrustApi findOne(@PathVariable("id") Long x){
    return trustService.findOne(x);
  }

  @PutMapping
  public TrustApi update(@RequestBody TrustApi trustApi){
    return trustService.save(trustApi);
  }

  @DeleteMapping("/{id}")
  public void removeOne(@PathVariable("id") Long id){
    trustService.removeOne(id);
  }
}
