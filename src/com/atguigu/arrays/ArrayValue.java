package com.atguigu.arrays;

public class ArrayValue {
    public static void main(String[] args) {
        //1.声明一个维数组并动态初始化
        int[] arr = new int[10];
        int sum = 0;
        //2.给数组的元素附上随机值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (99 - 10 + 1) + 10);
        }

        //3.遍历一维数组，并累加到sum变量中
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum += arr[i];
        }

        //4.声明最大小值变量并用数组的第一个元素赋值
        int maxValue = arr[0];
        int minValue = arr[0];
        //5.对比整个数组取出最大小值
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue){
                maxValue = arr[i];
            }

            if (arr[i] < minValue){
                minValue = arr[i];
            }
        }
        System.out.println("最大值" + maxValue);
        System.out.println("最小值" + minValue);
        System.out.println("总和" + sum);
        System.out.println("平均值" + sum / arr.length);
    }
}
