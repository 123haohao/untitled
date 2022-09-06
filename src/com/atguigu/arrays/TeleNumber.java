package com.atguigu.arrays;

public class TeleNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{1,8,3,2,9,7,5,4};
        int[] number = new int[]{0,1,2,3,3,4,5,2,6,2,7};
        String phone = "";
        for (int i = 0;i < number.length;i++){
            phone += arr[number[i]];
        }
        System.out.println("电话号码是：" + phone);
    }
}
