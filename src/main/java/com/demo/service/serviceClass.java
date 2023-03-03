package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.ModelClass;
import com.demo.repository.repositoryInterface;

@Service
public class serviceClass {
	
	@Autowired
	repositoryInterface ri;

	public void saveOrUpdate(ModelClass m) {
		// TODO Auto-generated method stub
		ri.save(m);
	}

	public int getDataById() {
		// TODO Auto-generated method stub
		return 1;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		ri.deleteById(id);
	}

}
