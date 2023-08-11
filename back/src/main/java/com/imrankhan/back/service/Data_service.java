package com.imrankhan.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imrankhan.back.entity.Data;
import com.imrankhan.back.repository.Data_Repositoy;

@Service
public class Data_service {

	@Autowired
	private Data_Repositoy repo;
	
	public Data saveData(Data data) {
		return repo.save(data);
	}
	
	public List<Data> saveDatas(List<Data> datas) {
		return repo.saveAll(datas);
	}
	public List<Data> getDatas(){
		return repo.findAll();
	}
	
	public Data getDataById(int id){
		return repo.findById(id).orElse(null);
	}
	
	public Data getDataByName(String name ){
		return repo.findByName(name);
	}
	
	public String deleteData(int id){
		 repo.deleteById(id);
		 return "Product Deleted || "+id;
	}
	
	public Data updateData(Data data ){
		Data existingData=repo.findById(data.getId()).orElse(null);
		existingData.setName(data.getName());
		existingData.setEmail(data.getEmail());
		existingData.setNumber(data.getNumber());
		return repo.save(existingData);
	}
}
