package com.atguigu.arrays;

public class YangHui {
    public static void main(String[] args) {
        //1.声明二维并动态初始化数组
        int[][] arr = new int[10][];

        //2.给二维数组赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];

            //2.1给首末元素赋值
            arr[i][0] = arr[i][i] = 1;

            //2.2给中间元素赋值
            for (int j = 1; j < arr[i].length -1; j++) {
                arr[i][j] = arr[i][j - 1] + arr[i - 1][j - 1];
            }
        }

        //遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
