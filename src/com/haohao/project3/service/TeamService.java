package com.haohao.project3.service;

import com.haohao.project3.domain.Archiect;
import com.haohao.project3.domain.Designer;
import com.haohao.project3.domain.Employee;
import com.haohao.project3.domain.Programmer;

//关于开发团队成员的管理：添加，删除等
public class TeamService {
    private static int counter = 1;//给memberId赋值使用
    private final int MAX_MEMBER = 5;//限制开发团队的人数
    private Programmer[] team = new Programmer[MAX_MEMBER];//保存开发团队成员
    private int total;//记录开发团队中实际的人数


    public Programmer[] getTeam(){
        Programmer[] team = new Programmer[total];
        for (int i = 0;i < team.length;i++){
            team[i] = this.team[i];
        }
        return team;
    }

    //将指定员工添加到开发团队中
    public void addMember(Employee e) throws TeamException{
        if (total >= MAX_MEMBER){
            throw new TeamException("团队成员已满,无法添加");
        }

        if (!(e instanceof Programmer)){
            throw new TeamException("该成员不是开发成员,无法添加");
        }

        if (isExit(e)){
            throw new TeamException("该员工已在本开发团队中");
        }

        Programmer p = (Programmer) e;//一定为true

        switch (p.getStatus()){
            case BUSY:
                throw new TeamException("该员工已是某团队中成员");
            case VACATION:
                throw new TeamException("该员工正在休假");
        }


        int numOfArch = 0,numOfDesi = 0,numOfPro = 0;
        for (int i = 0;i < total;i++){
            if (team[i] instanceof Archiect){
                numOfArch++;
            }else if (team[i] instanceof Designer){
                numOfDesi++;
            }else if (team[i] instanceof Programmer){
                numOfPro++;
            }
        }

        if (p instanceof Archiect){
            if (numOfArch >= 1){
                throw new TeamException("团队中最多只有一名架构师");
            }
        }else if (p instanceof Designer){
            if (numOfDesi >= 2){
                throw new TeamException("团队中最多只有两名设计师");
            }
        }else if (p instanceof Programmer){
            if (numOfPro >= 3){
                throw new TeamException("团队中最多只有三名程序员");
            }
        }


        team[total++] = p;
        p.setStatus(Status.BUSY);
        p.setMemberId(counter++);

    }


    public void removeMember(int memberId) throws TeamException{
        //total结束i为total个
        int i = 0;
        for (;i < total;i++){
            if (team[i].getMemberId() == memberId){
                team[i].setStatus(Status.FREE);
                break;
            }
        }
        if (i == total){
            throw new TeamException("找不到指定memberId员工,删除失败！");
        }

        for (int j = i;j < total - 1;j++){
            team[j] = team[j + 1];
        }

        team[--total] = null;
    }





    //判断指定员工是否已经在现有开发团队中
    public boolean isExit(Employee e){
        for (int i = 0;i < total;i++){
           return team[i].getId() == e.getId();
        }
        return false;
    }
}
