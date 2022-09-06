package com.atguigu.test;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[]{89,23,43,11,64,3,1,77};


        for (int i = 0;i < arr.length - 1;i++){
            for (int j = 0;j < arr.length - 1 -i;j++){
                if (arr[j] > arr[j + 1]) {
                    int team = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = team;
                }
            }
        }

        for (int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
