package com.atguigu.arrays;

public class Random {
    public static void main(String[] args) {
        //数值型数组元素的操作
        //定义一个一维10的数组，每个元素都是两位数的随机数
        int[] arr = new int[10];
        System.out.print("随机生成的数组元素有 ");
        for(int i = 0;i < arr.length;i++){
            //返回的double类型,int强制类型转换
            arr[i] = (int)(Math.random() * (99 - 10 + 1) + 10);
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        //求最大值
        int max = arr[0];
        for(int i = 1;i < arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("最大值是 " + max);
        //求最小值
        int min = arr[0];
        for(int i = 1;i < arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("最小值是 " + min);
        //求总和
        int sum = arr[0];
        for(int i = 1;i < arr.length;i++){
            sum += arr[i];
        }
        System.out.println("总和是 " + sum);
        //求平均值
        int avg = 0;
        avg = sum / arr.length;
        System.out.println("平均值是 " + avg);
    }
}
