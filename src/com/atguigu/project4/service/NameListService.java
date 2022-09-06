package com.atguigu.project4.service;

import com.atguigu.project4.domain.*;

import static com.atguigu.project4.domain.Data.*;

public class NameListService {
    private Employee[] employees;

    public NameListService(){
        employees = new Employee[EMPLOYEES.length];


        for (int i = 0;i < employees.length;i++){
            int type = Integer.parseInt(EMPLOYEES[i][0]);


            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            int salary = Integer.parseInt(EMPLOYEES[i][4]);


            Equipment equipment;
            double bouns;
            int stock;


            switch(type){
                case EMPLOYEE:
                    employees[i] = new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER:
                    equipment = getEquipment(i);
                    employees[i] = new Programmer(id,name,age,salary,equipment);
                    break;
                case DESIGNER:
                    equipment = getEquipment(i);
                    bouns = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id,name,age,salary,equipment,bouns);
                    break;
                case ARCHITECT:
                    equipment = getEquipment(i);
                    bouns = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id,name,age,salary,equipment,bouns,stock);
                    break;
            }
        }
    }

    public Equipment getEquipment(int i){
        int type = Integer.parseInt(EQUIPMENTS[i][0]);
        Equipment equipment = null;
        switch(type){
            case PC:
                equipment = new Pc(EQUIPMENTS[i][1],EQUIPMENTS[i][2]);
                break;
            case NOTEBOOK:
                equipment = new NoteBook(EQUIPMENTS[i][1],Double.parseDouble(EQUIPMENTS[i][2]));
                break;
            case PRINTER:
                equipment = new Printer(EQUIPMENTS[i][1],EQUIPMENTS[i][2]);
                break;
        }
        return equipment;
    }



    public Employee[] getEmployees(){
        return employees;
    }

    public Employee getIdEmployee(int id) throws TeamException{
        for (int i = 0;i < employees.length;i++){
            if (employees[i].getId() == id){
                return employees[i];
            }
        }
        throw new TeamException("找不到指定的员工啊！");
    }
}
