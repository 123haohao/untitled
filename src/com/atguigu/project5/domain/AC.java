package com.atguigu.project5.domain;

public class AC extends Student{
    private int memberId;
    private Status status;
    private Equipment equipment;

    public AC(){}
    public AC(int id,String name,int age,int la,Equipment equipment){
        super(id, name, age, la);
        this.equipment = equipment;
    }

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

    public String toString(){
        return getString() + "\t\t学委\t" + status + "\t\t\t\t\t" + equipment.getToString();
    }

    public String getTeamString(){
        return memberId + "/" + getString() + "\t\t学委";
    }
}
