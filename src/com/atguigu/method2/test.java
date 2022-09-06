package com.atguigu.method2;

import java.util.Scanner;
import java.util.Vector;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector vector = new Vector();
        int max = 0;
        for (;;){
            System.out.println("请输入学生成绩(-1退出)：");
            int score = sc.nextInt();
            if (score < 0){
                break;
            }
            Integer myscore = score;
            vector.addElement(myscore);
            if(max < myscore){
                max = myscore;
            }

        }
        char leave;
        for (int i = 0;i < vector.size();i++){
            Object obj = vector.elementAt(i);
            Integer integer = (Integer)obj;
            int p = integer;
            if (max - p <= 10){
                leave = 'A';
            }else if (max - p <= 20){
                leave = 'B';
            }else if (max - p <= 30){
                leave = 'C';
            }else {
                leave = 'D';
            }

            System.out.println(leave);
        }
        System.out.println(max);
    }
}


