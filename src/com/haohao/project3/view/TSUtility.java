package com.haohao.project3.view;

import java.util.Scanner;

public class TSUtility {
    private static Scanner sc = new Scanner(System.in);


    public static char readMenuSelection(){
        char c;
        for(;;){
            String str = readKeyBorad(1,false);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c!= '4'){
                System.out.println("输入有误，请重新输入：");
            }else break;
        }
        return c;
    }

    public static void readReturn(){
        System.out.print("按回车继续...");
        readKeyBorad(100,true);
    }

    public static int readInt(){
        int n;
        for(;;){
            String str = readKeyBorad(2,false);
            try{
                n = Integer.parseInt(str);
                break;
            }catch(NumberFormatException e){
                System.out.println("数字输入有误,请重新输入：");
            }
        }
        return n;
    }

    public static char readConfirmSelection(){
        char c;
        for (;;){
            String str = readKeyBorad(1,false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N'){
                break;
            }else System.out.println("选择错误，请重新输入：");
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
                System.out.println("输入长度不能大于" + limit + ",请重新输入：");
                continue;
            }
            break;
        }
        return str;
    }
}
