package com.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.model.ModelClass;

public interface repositoryInterface extends CrudRepository<ModelClass, Integer>{

}
