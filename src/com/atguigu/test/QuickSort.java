package com.atguigu.test;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (99 - 0 + 1) + 0);
            sum += arr[i];

        }
        int maxValue = arr[0];
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue){
                maxValue = arr[i];
            }

            if (arr[i] < minValue){
                minValue = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
            System.out.println();

        }
        System.out.println(maxValue);
        System.out.println(minValue);
        System.out.println(sum);
        System.out.println(sum / arr.length);

    }
}
