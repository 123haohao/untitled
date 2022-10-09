package com.atguigu.arrays;

public class ArrayRecall {
    public static void main(String[] args) {
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (30 - 1 + 1) + 1);

            for (int j = 0; j < i; j++) {
                //如果相等，控制i给元素重新赋值，回溯思想
                if (arr[i] == arr[j]){
                    i--;
                    break;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
