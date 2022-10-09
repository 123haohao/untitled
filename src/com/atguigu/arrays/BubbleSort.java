package com.atguigu.arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //1.冒泡排序，外层循环是比的是轮数，内层循环是比的个数
        String[] arr = new String[]{"AA","GG","II","BB","DD","CC"};
        //length - 1，是因为6个元素只需要比5轮
        for (int i = 0; i < arr.length - 1; i++) {
            //2.length -i -1，因为是最后一个数不用比，每一轮会出一个最大值，减去轮次
            for (int j = 0; j < arr.length - i - 1; j++) {
                //3.引用数据类型比大小需要用比较器
                if (arr[j].compareTo(arr[j + 1]) > 0){
                    String temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
