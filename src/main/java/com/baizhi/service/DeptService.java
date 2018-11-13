package com.baizhi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.baizhi.entity.Dept;


public interface DeptService {
	public List<Dept> showAllDept();
	public void addDept(Dept dept);
	public void deleteDept(int id);
	public void updateDept(Dept dept);
}
