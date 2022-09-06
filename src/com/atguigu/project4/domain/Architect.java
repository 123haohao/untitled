package com.atguigu.project4.domain;

public class Architect extends Designer{
    private int stock;

    public Architect(){}
    public Architect(int id,String name,int age,double salary,Equipment equipment,double bouns,int stock){
        super(id, name, age, salary, equipment, bouns);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    public String toString(){
        return getString() + "\t架构师\t" + getStatus() + "\t" + getBouns() + "\t" + stock + "\t" + getEquipment().getToString();

    }

    public String getTeamString(){
        return getMemberId() + "/" + getString() + "\t架构师\t" + getBouns() + "\t" + stock;
    }
}
