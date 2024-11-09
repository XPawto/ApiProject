package com.domain.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.models.entities.TrustApi;
import com.domain.models.repos.TrustRepo;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class TrustService {
  
  @Autowired
  private TrustRepo trustRepo;

  public TrustApi save(TrustApi trustApi){
    return trustRepo.save(trustApi);
  }

  public TrustApi findOne(Long id){
    Optional<TrustApi> trustApi = trustRepo.findById(id);
    if (!trustApi.isPresent()){
      return null;
    }
    return trustApi.get();
  }

  public Iterable<TrustApi> findAll(){
    return trustRepo.findAll();
  }

  public void removeOne(Long id){
    trustRepo.deleteById(id);
  }

  public List<TrustApi> findByName(String name){
    return trustRepo.findByNameContains(name);
  }
  
}
