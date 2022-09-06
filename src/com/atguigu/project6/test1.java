package com.atguigu.project6;

public class test1 {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        int count = 0;
        for (int i = 2;i <= 100;i++){
            boolean Flag = true;
            for (int j = 2;j <= Math.sqrt(i);j++){
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
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);
        System.out.println(count);




        int i = 2;
        System.out.println(i << 1);
        System.out.println(i << 29);
    }
}
