package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.domain.Girl;

public interface GirlRepository extends JpaRepository<Girl, Integer>{

	//通过年龄来查询
	List<Girl> findByAge(Integer age);
}
