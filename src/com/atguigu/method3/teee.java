package com.atguigu.method3;

import java.util.Scanner;

public class teee {
    private static Scanner sc = new Scanner(System.in);

    public static char readMenuSelection(){
        char c;
        for(;;){
          String str = readKeyBoard(1,false);
          c = str.charAt(0);
          if (c != '1' && c != '2' && c != '3'
          && c != '4' && c != '5'){
              System.out.println("选择错误，请重新输入：");
          }else{
              break;
          }
        }
        return c;
    }

    public static char readChar(){
        String str= readKeyBoard(1,false);
        return str.charAt(0);
    }

    public static char readChar(char defaultValue){
        String str = readKeyBoard(1,true);
        return (str.length() == 0) ? defaultValue : str.charAt(0);
    }


    public static int readInt(){
        int n;
        for(;;){
            String str = readKeyBoard(2,false);
            try {
                n = Integer.parseInt(str);
                break;
            }catch(NumberFormatException e){
                System.out.println("请重新输入数字：");
            }
        }
        return n;
    }

    public static int readInt(int defaultValue){
        int n;
        for (;;){
            String str = readKeyBoard(2,true);
            if (str.equals("")){
                return defaultValue;
            }

            try{
               n = Integer.parseInt(str);
               break;
            }catch(NumberFormatException e){
                System.out.println("请重新输入数字：");
            }
        }
        return n;
    }


    public static String readString(int limit){
        return readKeyBoard(limit,false);
    }

    public static String readString(int limit,String defaultValue){
        String str = readKeyBoard(limit,true);
        return str.equals("") ? defaultValue : str;
    }


    public static char readConfirmSelection(){
        char c;
        for(;;){
            String str = readKeyBoard(1,false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N'){
                break;
            }else {
                System.out.println("选择错误，请重新选择：");
            }
        }
        return c;
    }



    //从键盘读取指定个数的字符串，字符串为空看自己给的true还是false
    private static String readKeyBoard(int limit,boolean blankReturn){
        //先声明在外面，好返回
        String line = "";
        //判断是否输入
        while(sc.hasNextLine()){
            //输入的值赋给定义的字符串
            line = sc.nextLine();
            //判断字符串是否为空
            if (line.length() == 0){
                //是否是手动运行返回空字符串，return结束方法字符串直接返回给方法
                if (blankReturn) return line;
                //不是跳过本次循环，重新输入
                else continue;
            }
            //判断字符串是否长于自己指定的长度，不是跳过本次循环，重新输入
            if (line.length() < 1 || line.length() > limit){
                System.out.println("输入的长度不能超过" + limit + "的，请重新输入");
                continue;
            }
            //即不为空，又没有超出指定长度，退出循环
            break;
        }
        //把值返回给方法
        return line;
    }
}
