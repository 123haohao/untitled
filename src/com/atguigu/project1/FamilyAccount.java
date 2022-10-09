package com.atguigu.project1;

public class FamilyAccount {
    public static void main(String[] args) {
        boolean Flag = true;
        int balance = 1000;
        String details = "";
        while (Flag) {
            System.out.println("-----------家庭收支记账软件------------\n");
            System.out.println("            1 收支明细");
            System.out.println("            2 登记收入");
            System.out.println("            3 登记支出");
            System.out.println("            4 退    出");
            System.out.print("请选择(1~4)：");


            char selection = Utility.readMenuSelection();
            switch (selection) {
                case '1':
                    System.out.println("------------当前收支明细记录-----------\n");
                    System.out.println("收支\t账户金额\t\t收支金额\t\t说 明");
                    System.out.println(details);
                    System.out.println("---------------------------------------");
                    break;
                case '2':
                    System.out.println("请输入本次收入金额：");
                    int addMoney = Utility.readInt();
                    System.out.println("请输入本次收入说明：");
                    String addInfo = Utility.readString();
                    System.out.println("------------------登记完成--------------\n");

                    balance += addMoney;
                    details = "收入\t" + balance + "\t\t" + addMoney + "\t\t\t" + addInfo;
                    break;
                case '3':
                    System.out.println("请输入本次支出金额：");
                    int costMoney = Utility.readInt();
                    System.out.println("请输入本次支出说明：");
                    String costInfo = Utility.readString();
                    System.out.println("-----------------登记完成-------------\n");

                    balance -= costMoney;
                    details = "支出\t" + balance + "\t\t" + costMoney + "\t\t\t" + costInfo;
                    break;
                case '4':
                    System.out.print("确认是否退出(y/n)：");
                    char exit = Utility.readConfirmSelection();
                    if (exit == 'y')
                        Flag = false;
            }

        }
    }
}
