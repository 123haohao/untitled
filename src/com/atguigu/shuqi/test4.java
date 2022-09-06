package com.atguigu.shuqi;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int sum = sc.nextInt();
        int[] student = new int[sum];

        int max = 0;
        for (int i = 0; i < student.length; i++) {
            student[i] = (int)(Math.random() * (100 - 0 + 1) + 0);
            max = (student[i] > max)? student[i] : max;

        }

        for (int i = 0; i < student.length; i++) {
            if (max - student[i] <= 20){
                System.out.println("学生" + (i + 1) + "成绩为" + student[i] + "等级为A");
            }else if (max - student[i] <= 30){
                System.out.println("学生" + (i + 1) + "成绩为" + student[i] + "等级为B");
            }else if (max - student[i] <= 40){
                System.out.println("学生" + (i + 1) + "成绩为" + student[i] + "等级为C");
            }else System.out.println("学生" + (i + 1) + "成绩为" + student[i] + "等级为D");

        }
    }
}
