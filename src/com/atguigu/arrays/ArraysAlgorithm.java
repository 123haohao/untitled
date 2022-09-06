package com.atguigu.arrays;

public class ArraysAlgorithm {
    public static void main(String[] args) {
        //数组的复制
        int[] arr = new int[]{1,2,3,5,4,6,7};
        int[] arr2 = new int[arr.length];
        //给数组的元素赋值
        for (int i = 0;i < arr.length;i++){
            arr2[i] = arr[i];
        }

        //数组赋值,就是把arr的地址值复制给了arr3
        int[] arr3 = arr;
        System.out.println(arr);
        System.out.println(arr3);

        //数组反转ajj
       String[] ajj = new String[]{"jj","kk","oo","ww","aa"};
       for (int i = 0;i < ajj.length / 2;i++){
           String temp = ajj[i];
           ajj[i] = ajj[ajj.length - i - 1];
           ajj[ajj.length - i -1] = temp;
       }
        //遍历ajj数组
        for(String s : ajj) {
            System.out.print(s + "\t");
        }
        System.out.println();

        //线性查找
        String p = "jj";
        boolean isFlag = true;
        for (int i = 0;i < ajj.length;i++){
            if (p.equals(ajj[i])){
                System.out.println("找到指定的位置元素：" + i);
                isFlag = false;
                break;
            }
        }
        if (isFlag){
            System.out.println("没有找到指定元素！");
        }

        //二分法查找，排列有序的数组
        int[] number = new int[]{1,3,4,5,6,7,8,9,0,33};
        int value = 33;
        int head = 0;
        int end = number.length - 1;
        boolean Flag = true;
        for (int i = 0;i < number.length;i++){
            int heaf = (head + end) / 2;
            if (value == number[heaf]){
                System.out.println("找到指定元素位置：" + heaf);
                Flag = false;
                break;
            }else if (value < number[heaf]){
                end = heaf - 1;
            }else {
                head = heaf + 1;
            }
        }
        if (Flag){
            System.out.println("找不到指定元素！");
        }

    }
}
