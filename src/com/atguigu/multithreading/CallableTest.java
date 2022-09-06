package com.atguigu.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


//Callable的使用
public class CallableTest implements Callable<Integer> {

    @Override
    public Integer call() throws Exception{
        int sum = 0;
        for (int i = 0;i <= 100;i++){
            if (i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }
}



class callable{
    public static void main(String[] args) {
        CallableTest c = new CallableTest();
        FutureTask<Integer> t = new FutureTask<Integer>(c);
        new Thread(t).start();
        try {
            int sum = t.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
