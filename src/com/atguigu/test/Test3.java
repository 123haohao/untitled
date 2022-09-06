package com.atguigu.test;

public class Test3 {
    public void mOL(int i){
        System.out.println(i * i);
    }

    public void mOL(int i,int j){
        System.out.println(i * j);
    }

    public void mOL(String str){
        System.out.println(str);
    }

    public void mOL(int i,int...arr){
        for (int o = 0;o < arr.length;o++){
            System.out.print(i + arr[o]);
        }
    }

    public static void main(String[] args) {
        Test3 test3 = new Test3();
        test3.mOL(3);
        test3.mOL(3,4,2,3,1,12);
        System.out.println("------------");
        System.out.println(test3.sum(3));


    }

    public int sum(int num){
        if (num == 1){
            return 1;
        }

        return num + sum(num - 1);
    }
}
