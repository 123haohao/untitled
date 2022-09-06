package com.atguigu.project5.view;

import java.util.Scanner;

public class TSUtility {
    private static Scanner sc = new Scanner(System.in);


    public static char readMenuSelect(){
        char c;
        for (;;){
            c = readKeyBoard(1,false).charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4'){
                System.out.println("输入错误，请重新输入！");
            }else break;
        }
        return c;
    }


    public static void readReturn(){
        System.out.println("按回车继续...");
        readKeyBoard(150,true);
    }


    public static int readInt(){
        int i;
        for (;;){
            String str = readKeyBoard(2,false);
            try{
                i = Integer.parseInt(str);
                break;
            }catch(Exception e){
                System.out.println("数字输入错误，请重新输入！");;
            }
        }
        return i;
    }


    public static char readConfirmSelection(){
        char c;
        for (;;){
            c= readKeyBoard(1,false).toUpperCase().charAt(0);
            if (c == 'Y' || c == 'N'){
                break;
            }else System.out.println("输入有误，请重新输入！");
        }
        return c;
    }
    private static String readKeyBoard(int limit,boolean BlankReturn){
        String str = "";
        while(sc.hasNextLine()){
            str = sc.nextLine();
            if (str.length() == 0){
                if (BlankReturn){
                    return str;
                }
                continue;
            }

            if (str.length() > limit){
                System.out.println("输入的长度不能大于(" + limit + "长度)");
            }
            break;
        }
        return str;
    }
}
