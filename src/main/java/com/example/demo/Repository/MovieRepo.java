package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Model2;

public interface MovieRepo extends JpaRepository<Model2, String> {

	List<Model2> findBylanguage(String language);

}
