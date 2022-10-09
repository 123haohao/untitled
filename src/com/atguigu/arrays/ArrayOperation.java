package com.atguigu.arrays;

public class ArrayOperation {
    public static void main(String[] args) {
        //1.数组的赋值,把arr1的地址值赋值给arr2
        int[] arr1 = new int[]{1,3,5,7,9};
        int[] arr2;
        arr2 = arr1;
        System.out.println(arr1 + "\t" + arr2);
        //[I@677327b6	[I@677327b6



        //2.数组的复制,对arr3数组的元素依次赋给arr4，达到复制的效果
        int[] arr3 = new int[]{1,2,3,4,5};
        int[] arr4 = new int[arr3.length];
        for (int i = 0; i < arr3.length; i++) {
            arr4[i] = arr3[i];
            System.out.println(arr4[i]);
        }

        //3.数组的反转,单指针
        String[] arr5 = new String[]{"AA","BB","CC","DD","EE","FF"};
        for (int i = 0; i < arr5.length / 2; i++) {
            String temp = arr5[i];
            arr5[i] = arr5[arr5.length -i -1];
            arr5[arr5.length -i -1] = temp;
        }
        //双指针
        for (int i = 0,j = arr5.length -1; i < j; i++,j--) {
            String temp = arr5[i];
            arr5[i] = arr5[j];
            arr5[j] = temp;
        }

        //4.数组的遍历
        for (int i = 0; i < arr5.length; i++) {
            System.out.print(arr5[i] + "\t");
        }

        //5.线性查找，一个一个试
        String dest = "BB";
        boolean Flag1 = true;
        for (int i = 0; i < arr5.length; i++) {
            if (dest.equals(arr5[i])){
                System.out.println("找到了，索引是" + i);
                Flag1 = false;
                break;
            }
        }
        if (Flag1){
            System.out.println("很遗憾，没有找到");
        }

        //6.二分法查找，适用于有序数组,效率高
        int[] arr6 = new int[]{2,8,34,62,77,80,82,99};
        boolean Flag2 = true;
        int value = 62;
        //定义两个指针
        int head = 0;
        int end = arr6.length -1;
        while(head <= end){
            int middle = (head + end) /2;
            if (arr6[middle] == value){
                System.out.println("找到了，位置是" + middle);
                Flag2 = false;
                break;
                //如果中间值大于目标值，移动尾指针在中间值前一个
            }else if (arr6[middle] > value){
                end = middle - 1;
                //如果中间值小于目标值，移动头指针在中间值后一个
            }else {
                head = middle + 1;
            }
        }

        if (Flag2){
            System.out.println("没有找到");
        }

    }
}
