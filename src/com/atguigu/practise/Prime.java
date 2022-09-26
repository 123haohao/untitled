package com.atguigu.practise;

public class Prime {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i < 100; i++) {
            boolean Flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0){
                    Flag = false;
                    break;
                }
            }
            if (Flag){
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
