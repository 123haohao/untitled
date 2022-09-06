package com.atguigu.project5.service;

import com.atguigu.project5.domain.*;
import com.haohao.project3.service.TeamException;

public class TeamService {
    private static int count = 1;
    private static final int MAX_MEMBER = 5;
    private AC[] team = new AC[MAX_MEMBER];
    private int total;

    public TeamService(){}
    public AC[] getTeam(){
        AC[] team = new AC[total];
        for (int i = 0;i < total;i++){
            team[i] = this.team[i];
        }
        return team;
    }


    public void addTeam(Student s) throws TeamException{
        if (total >= MAX_MEMBER){
            throw new TeamException("学习小组已满！");
        }

        if (!(s instanceof AC)){
            throw new TeamException("该学生不是学习人员，无法添加！");
        }

        for (int i = 0;i < total;i++){
            if (team[i].getId() == s.getId()){
                throw new TeamException("该学生已在本小组中！");
            }
        }

        AC a = (AC) s;
        if (Status.BUSY.equals(a.getStatus())){
            throw new TeamException("该学生已在别的小组中！");
        }

        if (Status.VACATION.equals(a.getStatus())){
            throw new TeamException("该学生请假了！");
        }

        int ACSum = 0,GLSum = 0,MonitorSum = 0;

        for (int i = 0;i < total;i++){
            if (a instanceof Monitor){
                MonitorSum++;
            }else if (a instanceof GL){
                GLSum++;
            }else ACSum++;
        }


        if (a instanceof Monitor){
            if (MonitorSum >= 1){
                throw new TeamException("学习小组最多只能有一名班长！");
            }
        }else if (a instanceof GL){
            if (GLSum >= 2){
                throw new TeamException("学习小组最多只能有两名组长！");
            }
        }else {
            if (ACSum >= 3){
                throw new TeamException("学习小组最多只能有三名学委！");
            }
        }


        team[total++] = a;
        a.setStatus(Status.BUSY);
        a.setMemberId(count++);

    }


    public void deleteTeam(int memberId) throws TeamException{
        int i = 0;
        for (;i < total;i++){
            if (team[i].getMemberId() == memberId){
                team[i].setStatus(Status.FREE);
                break;
            }
        }

        if (i == total){
            throw new TeamException("找不到要删除的学生！");
        }

        for (int j = i;j < total - 1;j++){
            team[j] = team[j + 1];
        }

        team[--total] = null;
    }
}
