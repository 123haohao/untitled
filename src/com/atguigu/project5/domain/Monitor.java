package com.atguigu.project5.domain;

public class Monitor extends GL{
    private double bonus;

    public Monitor(){}
    public Monitor(int id,String name,int age,int la,Equipment equipment,double subsidy,double bonus){
        super(id, name, age, la, equipment, subsidy);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public String toString(){
        return getString() + "\t\t班长\t" + getStatus() + "\t" + getSubsidy() + "\t"
                + bonus + "\t" + getEquipment().getToString();
    }

    public String getTeamString(){
        return getMemberId() + "/" + getString() + "\t\t班长\t" + getSubsidy() + "\t" + bonus;
    }
}
