package com.atguigu.project5.domain;

public class GL extends AC{
    private double subsidy;
    public GL(){}
    public GL(int id,String name,int age,int la,Equipment equipment,double subsidy){
        super(id, name, age, la, equipment);
        this.subsidy = subsidy;
    }

    public double getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(double subsidy) {
        this.subsidy = subsidy;
    }

    public String toString(){
        return getString() + "\t\t组长\t" + getStatus() + "\t" + subsidy + "\t\t\t" + getEquipment().getToString();
    }

    public String getTemaString(){
        return getMemberId() + "/" + getString() + "\t\t组长\t" + subsidy;
    }
}
