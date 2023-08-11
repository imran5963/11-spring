package com.imrankhan.back.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.imrankhan.back.entity.Data;
import com.imrankhan.back.service.Data_service;

@CrossOrigin("*")
@RestController
public class Data_controller {

	private Data_service ds;
	
	 public Data_controller(Data_service ds) {
	        this.ds = ds;
	    }
	 
	 
	@PostMapping("/addData")
	public Data addData(@RequestBody Data data) {
		return ds.saveData(data);	}
	
	@PostMapping("/addDatas")
	public List<Data> addDatas(@RequestBody List<Data> data) {
		return ds.saveDatas(data);	}
	
	@GetMapping("/datas")
	public List<Data> findAllDatas() {
		return ds.getDatas();	}
	
	@GetMapping("/databyid/{id}")
	public Data findDataById(@PathVariable int id) {
		return ds.getDataById(id);	}
	

	@GetMapping("/databyname/{name}")
	public Data findDataByName(@PathVariable String name) {
		return ds.getDataByName(name);	}
	
	@PutMapping("/update")
	public Data updateData(@RequestBody Data data){
		return ds.updateData(data);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable int id){
		return ds.deleteData(id);
	}
	
}
