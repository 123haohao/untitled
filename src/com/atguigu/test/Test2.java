package com.atguigu.test;

public class Test2 {
    public static void main(String[] args) {


        Test2Student[] arr = new Test2Student[20];

        for (int i = 0;i < arr.length;i++){
            arr[i] = new Test2Student();
            arr[i].setId(i + 1);
            arr[i].setState((int) (Math.random() * (6 - 1 + 1) - 1));
            arr[i].setScore((int) (Math.random() * (100 - 0 + 1) - 0));

//            if (arr[i].getState() == 3){
//                System.out.println(arr[i]);
//            }
        }

        for (int i = 0;i < arr.length - 1;i++){
            for (int j = 0;j < arr.length - 1 - i;j++){
                if (arr[j].getScore() > arr[j + 1].getScore()){
                    Test2Student temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        for (int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }


    }
}


class Test2Student{
    private int id;
    private int state;
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String toString(){
        return "学号" + id + "\t年级\t" + state + "\t成绩\t" + score;
    }
}