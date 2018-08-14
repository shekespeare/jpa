package com.javasampleapproach.jpa.one2one.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.javasampleapproach.jpa.one2one.Wife;

@Repository
public interface WifeRepository extends JpaRepository<Wife, Integer>{

	@Query("SELECT w.name FROM Wife w WHERE w.id=:id ")
	String findById(@Param("id")int id);
	
	String findByIdAndName(int id,String name);

}
