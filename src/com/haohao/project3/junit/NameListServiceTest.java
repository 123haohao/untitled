package com.haohao.project3.junit;

import com.haohao.project3.service.NameListService;
import com.haohao.project3.service.TeamException;
import com.haohao.project3.domain.Employee;
import org.junit.Test;

public class NameListServiceTest {
    @Test
    public void testGetAllEmployees(){
        NameListService service = new NameListService();
        Employee[] employees = service.getAllEmployee();
        for (int i = 0;i < employees.length;i++){
            System.out.println(employees[i]);
        }
    }

    @Test
    public void testGetEmployee(){
        NameListService service = new NameListService();
        try {
            Employee employees = service.getEmployee(1);
            System.out.println(employees);
        }catch(TeamException e){
            System.out.println(e.getMessage());
        }

    }

}
