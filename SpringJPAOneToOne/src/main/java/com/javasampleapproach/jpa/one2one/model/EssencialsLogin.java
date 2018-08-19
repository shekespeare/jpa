package com.javasampleapproach.jpa.one2one.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the essencials_login database table.
 * 
 */
@Entity
@Table(name="essencials_login")
@NamedQuery(name="EssencialsLogin.findAll", query="SELECT e FROM EssencialsLogin e")
public class EssencialsLogin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="login_id")
	private int loginId;

	@Column(name="login_email")
	private String loginEmail;

	@Column(name="login_password")
	private String loginPassword;
	
	@Column(name="login_name")
	private String loginName;
	
	public EssencialsLogin() {
	}

	public int getLoginId() {
		return this.loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getLoginEmail() {
		return this.loginEmail;
	}

	public void setLoginEmail(String loginEmail) {
		this.loginEmail = loginEmail;
	}

	public String getLoginPassword() {
		return this.loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

}