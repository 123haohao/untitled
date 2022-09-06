package com.atguigu.project5.view;

import com.atguigu.project5.domain.AC;
import com.atguigu.project5.domain.Student;
import com.atguigu.project5.service.StudentsListService;
import com.atguigu.project5.service.TeamService;
import com.haohao.project3.service.TeamException;

public class TeamView {
    StudentsListService listService = new StudentsListService();
    TeamService teamService = new TeamService();

    public TeamView(){}


    public void enterMainMenu(){
        boolean isFlag = true;
        char menu = 0;
        while(isFlag){
            if (menu != '1'){
                showAll();
            }
            System.out.println("1-小组列表 2-添加小组成员 3-删除团队成员 4-退出 请选择(1~4)：");
            menu = TSUtility.readMenuSelect();
            switch(menu){
                case '1':
                    showTeam();
                    break;
                case '2':
                    addTeam();
                    break;
                case '3':
                    remove();
                    break;
                case '4':
                    System.out.println("确认是否退出(Y/N):");
                    char n = TSUtility.readConfirmSelection();
                    if (n == 'Y'){
                        isFlag = false;
                    }
            }
        }
    }

    private void showAll(){
        System.out.println("----------------------学习小组调度软件------------------\n");
        Student[] students = listService.getAllStudents();
        System.out.println("id\t姓名\t年龄\t学力\t身份\t状态\t补贴\t奖金\t设备");
        for (int i = 0;i < students.length;i++){
            System.out.println(students[i]);
        }
        System.out.println("--------------------------------------------------------");
    }
    private void showTeam(){
        System.out.println("-----------------------添加小组成员-------------------\n");
        AC[] acs = teamService.getTeam();
        if (acs == null || acs.length == 0){
            System.out.println("学习小组没有成员！");
        }else {
            System.out.println("TID/ID\t姓名\t年龄\t学力\t身份\t补贴\t奖金");
            for (int i = 0; i < acs.length; i++) {
                System.out.println(acs[i].getTeamString());
            }
        }
        System.out.println("----------------------------------");
    }
    private void addTeam(){
        System.out.println("-------------------------添加小组成员------------------");
        System.out.println("请输入你要添加的学生ID");
        int id = TSUtility.readInt();
        try {
            Student student = listService.getStudent(id);
            teamService.addTeam(student);
            System.out.println("添加成功！");
            TSUtility.readReturn();
        } catch (TeamException e) {
            System.out.println("添加失败，原因：" + e.getMessage());
        }
        System.out.println("----------------------------------");
    }
    private void remove(){
        System.out.println("-----------------删除小组成员--------------------------");
        System.out.println("请输入要删除的成员的MemberId");
        int MerberId = TSUtility.readInt();
        System.out.println("确认是否删除(Y/N)");
        char c = TSUtility.readConfirmSelection();
        if (c == 'N'){
            return;
        }
        try {
            teamService.deleteTeam(MerberId);
            System.out.println("删除成功!");
            TSUtility.readReturn();
        } catch (TeamException e) {
            System.out.println("删除失败，原因:" + e.getMessage());
        }

    }

    public static void main(String[] args) {
        TeamView teamView = new TeamView();
        teamView.enterMainMenu();
    }
}
