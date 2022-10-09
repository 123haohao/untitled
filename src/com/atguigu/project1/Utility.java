package com.atguigu.project1;

import java.util.Scanner;

public class Utility {
    private static Scanner sc = new Scanner(System.in);

    public static char readMenuSelection(){
        char c;
        for (;;){
            c = readKeyBorad(1,false).charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4'){
                System.out.println("输入有误，请重新输入：");
            } else break;
        }
        return c;
    }

    public static String readString(){
        String str = readKeyBorad(20,true);
        return str;
    }


    public static int readInt(){
        int n;
        for (;;){
            String str = readKeyBorad(10,false);
            try {
                n = Integer.parseInt(str);
                break;
            }catch (NumberFormatException e){
                System.out.println("请输入数字：");
            }
        }
        return n;
    }

    public static char readConfirmSelection(){
        char c;
        for (;;){
            c = readKeyBorad(1,false).toLowerCase().charAt(0);
            if(c == 'y' || c == 'n'){
                break;
            }else System.out.println("输入有误，请重新输入！");
        }
        return c;
    }



    private static String readKeyBorad(int limit,boolean blank){
        String str = "";
        while(sc.hasNextLine()){
            str = sc.nextLine();
            if (str.length() == 0){
                if (blank) return str;
                else continue;
            }

            if (str.length() < 1 || str.length() > limit){
                System.out.println("输入的长度不能大于" + limit + "请重新输入：");
                continue;
            }
            break;
        }
        return str;
    }
}
