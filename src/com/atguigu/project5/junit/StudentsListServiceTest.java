package com.atguigu.project5.junit;

import com.atguigu.project5.domain.Student;
import com.atguigu.project5.service.StudentsListService;
import org.junit.Test;

public class StudentsListServiceTest {
    StudentsListService service = new StudentsListService();

    @Test
    public void Students(){
        Student[] s = service.getAllStudents();
        System.out.println("id\t姓名\t年龄\t学力\t身份\t状态\t补贴\t奖金\t设备");
        for (int i = 0;i < s.length;i++){
            System.out.println(s[i]);
        }
    }
}
