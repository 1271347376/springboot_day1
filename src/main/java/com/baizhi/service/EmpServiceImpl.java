package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.EmpDao;
import com.baizhi.entity.Emp;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpDao empDao;
	
	@Transactional(propagation=Propagation.SUPPORTS)
	@Override
	public List<Emp> showAllEmpByDept_Id(int id) {
		return empDao.showAllEmpByDept_Id(id);
	}

	@Override
	public void addEmp(Emp emp) {
		empDao.addEmp(emp);
	}

	@Override
	public void deleteAllEmp(int id) {
		empDao.deleteAllEmp(id);
	}

	@Override
	public void deleteEmpById(int id) {
		empDao.deleteEmpById(id);
	}

	@Override
	public void updateEmpById(Emp emp) {
		empDao.updateEmpById(emp);
		
	}

}
