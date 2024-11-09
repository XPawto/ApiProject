package com.domain.models.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.domain.models.entities.TrustApi;

public interface TrustRepo extends CrudRepository<TrustApi, Long>{

  List<TrustApi> findByNameContains(String name);
}
