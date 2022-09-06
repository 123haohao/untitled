package com.haohao.project3.domain;

import com.haohao.project3.service.Status;

public class Programmer extends Employee{
    private int memberId;
    private Status status = Status.FREE;
    private Equipment equipment;//把接口当作属性

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Programmer(){}
    public Programmer(int id,String name,int age,double salary,Equipment equipment){
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public String toString(){
        return getDetails() + "\t程序员\t" + status + "\t\t\t\t\t" + equipment.getDescirption();

    }

    public String getTeamBaseDetails(){
        return memberId + "/" + getDetails() + "\t";
    }

    public String getDetailsForTeam(){
        return getTeamBaseDetails() + "程序员";
    }
}
