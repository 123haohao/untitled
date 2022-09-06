package com.atguigu.project4.view;

import java.util.Scanner;

public class TSUtility {
    private static Scanner sc = new Scanner(System.in);


    public static char readMenuSelection(){
        char c;
        for (;;){
           c = readKeyBoard(1,false).charAt(0);
           if (c != '1' && c != '2' && c != '3' && c != '4'){
               System.out.println("选择错误，请重新输入！");
           }else break;
        }
        return c;
    }


    public static int readInt(){
        int n;
        for (;;){
            String str = readKeyBoard(2,false);
            try {
                n = Integer.parseInt(str);
                break;
            }catch (Exception e){
                System.out.println("数字输入错误！");
            }
        }
        return n;
    }


    public static void readReturn(){
        System.out.println("按回车继续...");
        readKeyBoard(150,true);
    }


    public static char readConfirmSelcetion(){
        char c;
        for (;;){
            c = readKeyBoard(1,false).toUpperCase().charAt(0);
            if (c == 'Y' || c == 'N'){
                break;
            }else{
                System.out.println("选择错误，请重新输入：");
            }
        }
        return c;
    }


    private static String readKeyBoard(int limit,boolean Blank){
        String str = "";
        while(sc.hasNextLine()){
            str = sc.nextLine();
            if (str.length() == 0){
                if (Blank) return str;
                else continue;
            }

            if (str.length() > limit){
                System.out.println("输入的长度不能大于" + limit + "长度");
                continue;
            }
            break;
        }
        return str;
    }
}
