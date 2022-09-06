package com.atguigu.arrays;

import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的个数：");
        int number = sc.nextInt();
        int[] arr = new int[number];


        int maxScore = 0;
        for (int i = 0;i < arr.length;i++){
            System.out.println("还需输入：" + number-- + "个学生成绩");
            arr[i] = sc.nextInt();

            if (maxScore < arr[i]){
                maxScore = arr[i];
            }
        }

        char level;
        for (int j = 0;j < arr.length;j++){
            if (maxScore - arr[j] <= 10){
                level = 'A';
            }else if (maxScore - arr[j] <= 20){
                level = 'B';
            }else if (maxScore - arr[j] <= 30){
                level = 'C';
            }else {
                level = 'D';
            }
            System.out.println("student：" + (j + 1) + "\tscore：" + arr[j] + "\tlevel：" + level);
        }
    }
}

