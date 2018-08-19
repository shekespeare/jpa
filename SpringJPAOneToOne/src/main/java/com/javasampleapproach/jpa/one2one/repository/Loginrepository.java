package com.javasampleapproach.jpa.one2one.repository;

import javax.persistence.Column;

import org.hibernate.annotations.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.javasampleapproach.jpa.one2one.model.EssencialsLogin;

@Repository
public interface Loginrepository extends JpaRepository<EssencialsLogin, Integer>{
//	@Column(name="login_email")
//	private String loginEmail;
//
//	@Column(name="login_password")
//	private String loginPassword;
	
	@Query("SELECT  login.loginName FROM EssencialsLogin login WHERE login.loginEmail=:loginEmail AND login.loginPassword=:loginPassword")
	String getRepositoryId(@Param("loginEmail")String loginEmail, @Param("loginPassword")String loginPassword);

}
