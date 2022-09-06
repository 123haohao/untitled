package com.atguigu.project4.domain;

public class Designer extends Programmer {
    private double bouns;

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bouns) {
        super(id, name, age, salary, equipment);
        this.bouns = bouns;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public String toString() {
        return getString() + "\t设计师\t" + getStatus() + "\t" + bouns + "\t\t" + getEquipment().getToString();
    }

    public String getTeamString() {
        return getMemberId() + "/" + getString() + "\t设计师\t" + bouns;
    }
}




