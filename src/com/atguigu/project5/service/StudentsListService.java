package com.atguigu.project5.service;

import com.atguigu.project5.domain.*;
import com.haohao.project3.service.TeamException;

import static com.atguigu.project5.service.Data.EQUIPMENTS;
import static com.atguigu.project5.service.Data.STUDENTS;

public class StudentsListService {
    private Student[] students;

    public StudentsListService(){
        students = new Student[STUDENTS.length];

        for(int i = 0;i < students.length;i++){
            int type = Integer.parseInt(STUDENTS[i][0]);

            int id = Integer.parseInt(STUDENTS[i][1]);
            String name = STUDENTS[i][2];
            int age = Integer.parseInt(STUDENTS[i][3]);
            int la = Integer.parseInt(STUDENTS[i][4]);

            Equipment equipment;
            double subsidy;
            double bouns;

            switch (type){
                case 1:
                    students[i] = new Student(id,name,age,la);
                    break;
                case 2:
                    equipment = getEquipment(i);
                    students[i] = new AC(id,name,age,la,equipment);
                    break;
                case 3:
                    equipment = getEquipment(i);
                    subsidy = Double.parseDouble(STUDENTS[i][5]);
                    students[i] = new GL(id,name,age,la,equipment,subsidy);
                    break;
                case 4:
                    equipment = getEquipment(i);
                    subsidy = Double.parseDouble(STUDENTS[i][5]);
                    bouns = Double.parseDouble(STUDENTS[i][6]);
                    students[i] = new Monitor(id,name,age,la,equipment,subsidy,bouns);
                    break;
            }
        }
    }

    public Equipment getEquipment(int i){
        int type = Integer.parseInt(EQUIPMENTS[i][0]);

        Equipment equipment = null;
        switch(type){
            case 11:
                equipment = new PC(EQUIPMENTS[i][1],EQUIPMENTS[i][2]);
                break;
            case 12:
                equipment = new Book(EQUIPMENTS[i][1],Double.parseDouble(EQUIPMENTS[i][2]));
                break;
            case 13:
                equipment = new Printer(EQUIPMENTS[i][1],EQUIPMENTS[i][2]);
                break;
        }
        return equipment;
    }


    public Student[] getAllStudents(){
        return students;
    }

    public Student getStudent(int id) throws TeamException {
        for (int i = 0;i < students.length;i++){
            if (students[i].getId() == id){
                return students[i];
            }
        }
        throw new TeamException("找不到指定学生！");
    }
}
