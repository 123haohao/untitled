package com.atguigu.shuqi;

import java.util.Scanner;

public class branch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;){
            System.out.println("请输入第一个数字：");
            int one = sc.nextInt();
            System.out.println("请输入第二个数字：");
            int two = sc.nextInt();
            System.out.println("请输入要的运算符(退出输入q)：");
            String operator = sc.next();
            switch(operator){
                case "+":
                    System.out.println(one + two);
                    break;
                case "-":
                    System.out.println(one - two);
                    break;
                case "/":
                    System.out.println(one / two);
                    break;
                case "%":
                    System.out.println(one % two);
                    break;
                case "q":
                    return;
            }
        }
    }
}
