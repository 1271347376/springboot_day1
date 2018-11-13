package com.baizhi.test;

import com.baizhi.entity.Dept;
import com.baizhi.service.DeptService;
import com.baizhi.service.EmpService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DeptTest extends BasicTest {

    @Autowired
    private DeptService deptService;


    @Test
    public void test01(){
        List<Dept> deptList = deptService.showAllDept();
        for (Dept dept : deptList) {
            System.out.println(dept);
        }
    }

}
