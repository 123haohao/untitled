package com.atguigu.project4.service;

import com.atguigu.project4.domain.Architect;
import com.atguigu.project4.domain.Designer;
import com.atguigu.project4.domain.Employee;
import com.atguigu.project4.domain.Programmer;

public class TeamService {
    private static int count = 1;
    private final int MAX_MEMBER = 5;
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total;


    public TeamService(){

    }

    public Programmer[] getProgrammers(){
        Programmer[] team = new Programmer[total];
        for (int i = 0;i < total;i++){
            team[i] = this.team[i];
        }
        return team;
    }


    public void addMember(Employee e) throws TeamException{
        if (total >= MAX_MEMBER){
            throw new TeamException("开发团队已满！");
        }

        if (!(e instanceof Programmer)){
            throw new TeamException("该员工不是开发人员！");
        }
        Programmer p = (Programmer) e;

        if (isExit(p)){
            throw new TeamException("该员工已在本团队中！");
        }

        if (Status.BUSY.equals(p.getStatus())){
            throw new TeamException("该员工已在别的团队中！");
        }
        if (Status.VACATION.equals(p.getStatus())){
            throw new TeamException("该员工正在休假！");
        }

        int pSum = 0,dSum = 0,aSum = 0;

        for (int i = 0;i < total;i++){
            if (team[i] instanceof Architect){
                aSum++;
            }else if (team[i] instanceof Designer){
                dSum++;
            }else pSum++;
        }

        if (p instanceof Architect){
            if (aSum >= 1){
                throw new TeamException("开发团队最多只有一名架构师");
            }
        }else if (p instanceof Designer){
            if (dSum >= 2){
                throw new TeamException("开发团队最多只有两名设计师");
            }
        }else {
            if (pSum >= 3){
                throw new TeamException("开发团队最多只有三名程序员");
            }
        }

        team[total++] = p;
        p.setStatus(Status.BUSY);
        p.setMemberId(count++);
    }

    public void deleteMember(int memberId) throws TeamException{
        int i = 0;
        for (;i < total;i++){
            if (team[i].getMemberId() == memberId){
                team[i].setStatus(Status.FREE);
                break;
            }
        }

        if (i == total){
            throw new TeamException("找不到memberId的员工");
        }

        for (int j = i;j < total - 1;j++){
            team[j] = team[j + 1];
        }

        team[--total] = null;

    }

    public boolean isExit(Programmer p){
        for (int i = 0;i < total;i++){
            if (team[i].getMemberId() == p.getMemberId()){
                return true;
            }
        }
        return false;
    }
}
