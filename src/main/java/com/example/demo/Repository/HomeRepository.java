package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Model;

public interface HomeRepository extends JpaRepository<Model, Integer> {

	List<Model> findByname(String name);

}
