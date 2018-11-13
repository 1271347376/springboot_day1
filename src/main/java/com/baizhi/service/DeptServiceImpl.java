package com.baizhi.service;

import java.util.List;

import com.baizhi.aspect.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.DeptDao;
import com.baizhi.entity.Dept;


@Service("deptService")
@Transactional
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao deptDao;

	@Log(name = "showAllDept")
	@Transactional(propagation=Propagation.SUPPORTS)
	@Override
	public List<Dept> showAllDept() {
		return deptDao.showAllDept();
	}

	@Override
	public void addDept(Dept dept) {
		deptDao.addDept(dept);
		
	}

	@Override
	public void deleteDept(int id) {
		deptDao.deleteDept(id);
	}

	@Override
	public void updateDept(Dept dept) {
		deptDao.updateDept(dept);
	}

}
