package com.javasampleapproach.jpa.one2one;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the husband database table.
 * 
 */
@Entity
@NamedQuery(name="Husband.findAll", query="SELECT h FROM Husband h")
public class Husband implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String name;

	public Husband() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}