package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.ModelClass;
import com.demo.service.serviceClass;

@RestController

public class controllerClass {
	
	@Autowired
	serviceClass sc;
	
	@GetMapping("/")
    public String home() {

        return "Home page";
    }
	
	@GetMapping("/login")
	private String LoginPage()
	{
		return "Login Here..";
	}
	
	@PostMapping("/saveData")
	private int SaveData(@RequestBody ModelClass m)
	{
		sc.saveOrUpdate(m);
		return 1;
	}
	
	@PutMapping("/UpdateData")
	private int DataUpdate(@RequestBody ModelClass m)
	{
		sc.saveOrUpdate(m);
		return sc.getDataById();
	}
	
	@DeleteMapping("/deleteData/{id}")
	private int DeleteData(@PathVariable("id") int id)
	{
		sc.delete(id);
		return sc.getDataById();
	}

}
