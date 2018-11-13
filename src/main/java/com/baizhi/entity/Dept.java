package com.baizhi.entity;

import java.util.ArrayList;
import java.util.List;

public class Dept {
	private Integer id;
	private String name;
	private List<Emp> emp = new ArrayList<Emp>();
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dept(Integer id, String name, List<Emp> emp) {
		super();
		this.id = id;
		this.name = name;
		this.emp = emp;
	}
	
	public Dept(String name) {
		super();
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Emp> getEmp() {
		return emp;
	}
	public void setEmp(List<Emp> emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", emp=" + emp + "]";
	}
	
}
