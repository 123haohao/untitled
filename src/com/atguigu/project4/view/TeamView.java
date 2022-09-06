package com.atguigu.project4.view;

import com.atguigu.project4.domain.Employee;
import com.atguigu.project4.domain.Programmer;
import com.atguigu.project4.service.NameListService;
import com.atguigu.project4.service.TeamException;
import com.atguigu.project4.service.TeamService;

public class TeamView {
    NameListService listService = new NameListService();
    TeamService service = new TeamService();



    public void enterMainMenu(){
        boolean isFlag = true;
        char menu = 0;
        while(isFlag){
            if (menu != '1'){
                showAll();
            }

            System.out.println("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出(1~4)：");
            menu = TSUtility.readMenuSelection();
            switch(menu){
                case '1':
                    showTeam();
                    break;
                case '2':
                    addTeam();
                    break;
                case '3':
                    removeTeam();
                    break;
                case '4':
                    System.out.println("是否确认退出(Y/N):");
                    char c = TSUtility.readConfirmSelcetion();
                    if (c == 'Y'){
                        isFlag = false;
                        break;
                    }
            }
        }
    }


    private void showAll(){
        System.out.println("-------------------开发团队调度软件---------------------\n");
        Employee[] e = listService.getEmployees();
        System.out.println("id\t姓名\t年龄\t工资\t身份\t状态\t奖金\t股票\t设备");
        for (int i = 0;i < e.length;i++){
            System.out.println(e[i]);
        }
        System.out.println("---------------------------------------------------------");
    };

    private void showTeam(){
        System.out.println("----------------------团队列表-------------------");
        Programmer[] p = service.getProgrammers();
        if (p == null || p.length == 0){
            System.out.println("开发团队没有成员！");
        }else {
            System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票");
            for (int i = 0; i < p.length; i++) {
                System.out.println(p[i].getTeamString());
            }
        }
        System.out.println("-------------------------------------------------");
    }

    private void addTeam(){
        System.out.println("----------------------添加成员-------------------");
        System.out.println("请输入要添加的员工Id");
        int n = TSUtility.readInt();
        try {
            Employee employee = listService.getIdEmployee(n);
            service.addMember(employee);
            System.out.println("添加成功！");
            TSUtility.readReturn();
        } catch (TeamException e) {
            System.out.println("添加失败，原因：" + e.getMessage());
        }
    }

    private void removeTeam(){
        System.out.println("-------------------删除成员-----------------------");
        System.out.println("请输入要删除的员工memberId");
        int n = TSUtility.readInt();
        System.out.println("是否确认删除(Y/N):");
        char c = TSUtility.readConfirmSelcetion();
        if (c == 'N'){
            return;
        }
        try {
            service.deleteMember(n);
            System.out.println("删除成功！");
            TSUtility.readReturn();
        } catch (TeamException e) {
            System.out.println("删除失败，原因：" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        TeamView view = new TeamView();
        view.enterMainMenu();
    }
}
