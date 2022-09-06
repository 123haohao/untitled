package com.atguigu.project2;

import java.util.Scanner;

public class TeeP {
    private static Scanner sc = new Scanner(System.in);


    public static char readMainMenu(){
        char c;
        for (;;){
            String str = readKeyBroad(1,false);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4'){
                System.out.println("选择有误！");
                continue;
            }
            break;
        }
        return c;
    }

    public static char readMenuSelection(){
        char c;
        for (;;){
            String str = readKeyBroad(1,false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N'){
                break;
            }else System.out.println("选择错误，请重新输入：");
        }
        return c;
    }

    public static int readInt(){
        int n;
        for (;;){
            String str = readKeyBroad(2,false);
            try{
                n = Integer.parseInt(str);
                break;
            }catch(NumberFormatException e){
                System.out.println("请输入数字：");
            }
        }
        return n;
    }


    public static int readInt(int defaultValue){
        int n;
        for (;;){
            String str = readKeyBroad(2,true);
            if (str.length() == 0) return defaultValue;
            try{
                n = Integer.parseInt(str);
                break;
            }catch(NumberFormatException e){
                System.out.println("请输入数字：");
            }
        }
        return n;
    }


    public static char readChar(){
        String str = readKeyBroad(1,false);
        return str.charAt(0);
    }

    public static char readChar(char defaultValue){
        String str = readKeyBroad(1,true);
        return (str.length() == 0) ? defaultValue : str.charAt(0);
    }

    public static String readString(){
        return readKeyBroad(15,false);
    }


    public static String readString(String defaultValue){
        String str = readKeyBroad(15,true);
        return str.equals("") ? defaultValue : str;
    }



    public static void Return(){
        System.out.println("输入回车继续...");
        readKeyBroad(100,true);
    }










    private static String readKeyBroad(int limit,boolean blankReturn){
        String str = "";
        while(sc.hasNextLine()){
            str = sc.nextLine();
            if (str.length() == 0){
                if (blankReturn) return str;
                else continue;
            }

            if (str.length() < 1 || str.length() >limit){
                System.out.println("输入的长度不能大于(" + limit + ",请重新输入：)");
                continue;
            }
            break;
        }
        return str;
    }
}
