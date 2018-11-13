package com.baizhi.dao;

import java.util.List;

import com.baizhi.entity.Dept;

public interface DeptDao {
	public List<Dept> showAllDept();
	public void addDept(Dept dept);
	public void deleteDept(int id);
	public void updateDept(Dept dept);
}
