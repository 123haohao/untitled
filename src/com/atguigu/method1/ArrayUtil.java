package com.atguigu.method1;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] arr = new int[]{3,-11,0,22,-99,67};
        ArrayUtil.sort(arr);
        ArrayUtil.print(arr);
        System.out.println(ArrayUtil.getIndex(arr,0));
        ArrayUtil.getIndex(arr,7);

    }
    //求数组的最大值
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    //求数组的最小值
    public static int getMin(int[] arr){
        int min = arr[0];
        for(int i = 1;i < arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    //求数组的总和
    public static int getSum(int[] arr){
        int sum = arr[0];
        for(int i = 1;i < arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
    //求数组的平均数
    public static int getAvg(int[] arr){
        return getSum(arr) / arr.length;
    }
    //反转数组
    public static void reverse(int[] arr){
        for(int i = 0,j = arr.length - 1;i < j;i++,j--) {
            int tel = arr[i];
            arr[i] = arr[j];
            arr[j] = tel;
        }
    }
    //复制数组
    public static int[] copy(int[] arr){
        int[] arr2 = new int[arr.length];
        //把每个元素依次赋值给arr2
        for(int i = 0;i < arr.length;i++){
            arr2[i] = arr[i];
            System.out.println(arr2[i]);
        }
        return arr2;
    }
    //数组冒泡排序
    public static void sort(int[] arr){
        for(int i = 0;i < arr.length - 1;i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    int tel = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tel;
                }
            }
        }
    }
    //数组遍历
    public static void print(int[] arr){
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    //查找指定元素
    public static int getIndex(int[] arr,int dest){
        for(int i = 0;i < arr.length;i++){
            if(dest == arr[i]){
                return  i;
            }
        }
        return -1;
    }
}