package com.imrankhan.back.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imrankhan.back.entity.Data;

public interface Data_Repositoy extends JpaRepository<Data,Integer> {

	Data findByName(String name);

}
