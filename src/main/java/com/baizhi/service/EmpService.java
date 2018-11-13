package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.Emp;

public interface EmpService {
	public List<Emp> showAllEmpByDept_Id(int id);
	public void addEmp(Emp emp);
	public void deleteAllEmp(int id);
	public void deleteEmpById(int id);
	public void updateEmpById(Emp emp);
}
