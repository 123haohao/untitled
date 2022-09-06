package com.atguigu.multithreading;



//匿名子类
public class myThread extends Thread{

    public static void main(String[] args) {
        new Thread(){
            public void run(){
                for (int i = 0;i < 100;i++){
                    if (i % 2 == 0) System.out.println(i + "*******");
                }
            }
        }.start();


        for (int i = 1;i <= 100;i++){
            boolean isFlag = true;
            for (int j = 1;j <= Math.sqrt(i);j++){
                if (j % i == 0){
                    isFlag = false;
                    break;
                }
            }if (isFlag){
                System.out.println(i);
            }
        }


        new Thread(){
            public void run(){
                for (int i = 0;i < 100;i++){
                    if (i % 2 != 0) System.out.println(i);
                }
            }
        }.start();


    }

}
