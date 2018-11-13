package com.baizhi.dao;

import java.util.List;

import com.baizhi.entity.Emp;

public interface EmpDao {
	public List<Emp> showAllEmpByDept_Id(int id);
	public void addEmp(Emp emp);
	public void deleteAllEmp(int dept_id);
	public void deleteEmpById(int id);
	public void updateEmpById(Emp emp);
}
