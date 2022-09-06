package com.haohao.project3.domain;

public class Archiect extends Designer{
    private int stock;//股票

    public Archiect(){}
    public Archiect(int id,String name,int age,double salary
    ,Equipment equipment,double bonus,int stock){
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String toString(){
        return getDetails() + "\t架构师\t" + getStatus() + "\t" + getBonus() + "\t" + stock + "\t" + getEquipment().getDescirption();
    }

    public String getDetailsForTeam(){
        return getTeamBaseDetails() + "架构师" + "\t" + getBonus() + "\t" + stock;
    }
}
