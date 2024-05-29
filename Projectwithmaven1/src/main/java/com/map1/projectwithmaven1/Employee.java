package com.map1.projectwithmaven1;

import java.util.List;
import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	private int id;
	@Column(name = "emp_name")
	private String name;

	@ManyToMany
	private List<Project> project;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	public Employee(int id, String name, List<Project> project) {
		super();
		this.id = id;
		this.name = name;
		this.project = project;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}