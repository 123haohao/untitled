package com.atguigu.shuqi;

public class test2 {
    public static void main(String[] args) {
        Student[] arr = new Student[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Student();
            arr[i].number = i +  1;
            arr[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
            arr[i].score = (int) (Math.random() * (100 - 0 + 1) + 0);
        }

        for (int i = 0;i < arr.length - 1;i++){
            for (int j = 0;j < arr.length - 1 -i;j++){
                if (arr[j].score > arr[j + 1].score) {
                    Student student = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = student;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].state == 3){
                System.out.println(arr[i].getInfo());
            }
        }

    }
}

class Student{
    int number;
    int state;
    int score;

    public String getInfo(){
        return "学号" + number + "\t年级" + state + "\t成绩" + score;
    }
}
