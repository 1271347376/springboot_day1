package com.baizhi.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.entity.Dept;
import com.baizhi.service.DeptService;
import com.baizhi.service.EmpService;

@Controller
@RequestMapping("/dept")
public class DeptController {

	@Autowired
	private DeptService deptService;
	@Autowired
	private EmpService empService;
	
	
	@RequestMapping("/showAllDept")
	public String showAllDept(HttpServletRequest request){
		List<Dept> list = deptService.showAllDept();
		request.setAttribute("list", list);
		return "/ems1.0/dept/deptlist";
	}
	
	@RequestMapping("/addDept")
	public String addDept(Dept dept){
		deptService.addDept(dept);
		return "redirect:/dept/showAllDept";
	}
	
	@RequestMapping("/deleteDept")
	public String deleteDept(int id){
		empService.deleteAllEmp(id);
		deptService.deleteDept(id);
		return "redirect:/dept/showAllDept";
	}
	@RequestMapping("/updateDept")
	public String updateDept(Dept dept){
		deptService.updateDept(dept);
		return "redirect:/dept/showAllDept";
	}
}
