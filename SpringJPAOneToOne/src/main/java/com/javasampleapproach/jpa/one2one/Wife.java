package com.javasampleapproach.jpa.one2one;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the wife database table.
 * 
 */
@Entity
@NamedQuery(name="Wife.findAll", query="SELECT w FROM Wife w")
public class Wife implements Serializable {
	private static final long serialVersionUID = 1L;

	@Transient
	String hname;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="husband_id")
	private int husbandId;

	private String name;

	public Wife() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHusbandId() {
		return this.husbandId;
	}

	public void setHusbandId(int husbandId) {
		this.husbandId = husbandId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
@OneToOne
@JoinColumn(name="husband_id",insertable=false,updatable=false)
	private Husband husband;
	
	
	public Wife( String name,String hname) {
		super();
		this.name = name;
		this.hname = hname;
		
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

}