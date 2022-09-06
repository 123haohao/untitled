package com.haohao.project3.service;

import com.haohao.project3.domain.*;

import static com.haohao.project3.service.Data.*;


public class NameListService {
    private Employee[] employees;


    //初始化数组，给数组的元素赋值
    public NameListService(){
        employees = new Employee[EMPLOYEES.length];
        for (int i = 0;i < employees.length;i++){
            //在EMPLOYEES第一个元素，拿到标识符
            int type = Integer.parseInt(EMPLOYEES[i][0]);

            //把所有员工都有的属性方法外面，供创建对象时用
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);

            //声明接口，用作后续员工的属性
            Equipment equipment;
            //子类属性需在里面赋值
            double bonus;
            int stock;

            //根据标识符创建不同的员工，不同员工的参数不同
            switch(type){
                case EMPLOYEE:
                    employees[i] = new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id,name,age,salary,equipment);
                    break;
                case DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id,name,age,salary,equipment,bonus);
                    break;
                case ARCHITECT:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Archiect(id,name,age,salary,equipment,bonus,stock);
                    break;
            }
        }
    }
    //给接口的实现类赋值，返回接口给
    public Equipment createEquipment(int index){
        int type = Integer.parseInt(EQUIPMENTS[index][0]);

        Equipment equipment = null;
        switch(type){
            case PC:
                equipment = new Pc(EQUIPMENTS[index][1],EQUIPMENTS[index][2]);
                break;
            case NOTEBOOK:
                equipment = new NoteBook(EQUIPMENTS[index][1],Double.parseDouble(EQUIPMENTS[index][2]));
                break;
            case PRINTER:
                equipment = new Printer(EQUIPMENTS[index][1],EQUIPMENTS[index][2]);
                break;
        }
        return equipment;
    }


    public Employee[] getAllEmployee(){
        return employees;
    }


    public Employee getEmployee(int id) throws TeamException{
        for (int i = 0;i < employees.length;i++){
            if (employees[i].getId() == id){
                return employees[i];
            }
        }

        throw new TeamException("找不到指定的员工");
    }

}
