package com.baizhi.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.entity.Dept;
import com.baizhi.entity.Emp;
import com.baizhi.service.DeptService;
import com.baizhi.service.EmpService;

@Controller
@RequestMapping("/emp")
public class EmpController {

	@Autowired
	private EmpService empService;
	@Autowired
	private DeptService deptService;
	
	@RequestMapping("/showEmp")
	public String showAllEmp(Integer id,HttpServletRequest request){
		HttpSession session = request.getSession();
		Integer dept_id = (Integer) session.getAttribute("id");
		if(id==null){
			id=dept_id;
		}
		List<Emp> empList = empService.showAllEmpByDept_Id(id);
		request.setAttribute("empList", empList);
		return "/ems1.0//emp/emplist";
	}
	
	@RequestMapping("/showDept")
	public String showDept(HttpServletRequest request){
		List<Dept> list = deptService.showAllDept();
		request.setAttribute("list", list);
		return "/ems1.0//emp/addEmp";
	}
	
	@RequestMapping("/showDept2")
	public String showDept2(HttpServletRequest request,Integer dept_id){
		List<Dept> list = deptService.showAllDept();
		request.setAttribute("list", list);
		request.setAttribute("dept_id", dept_id);
		return "/ems1.0//emp/updateEmp";
	}
	
	@RequestMapping("/addEmp")
	public String addEmp(Emp emp,HttpSession session){
		empService.addEmp(emp);
		session.setAttribute("id", emp.getDept_id());
		return "redirect:/emp/showEmp";
	}
	
	@RequestMapping("/deleteEmp")
	public String deleteEmp(Emp emp,HttpSession session){
		empService.deleteEmpById(emp.getId());
		session.setAttribute("id", emp.getDept_id());
		return "redirect:/emp/showEmp";
	}
	
	@RequestMapping("/updateEmp")
	public String updateEmp(Emp emp,HttpSession session){
		empService.updateEmpById(emp);
		session.setAttribute("id", emp.getDept_id());
		return "redirect:/emp/showEmp";
	}
	
}
