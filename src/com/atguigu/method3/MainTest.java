package com.atguigu.method3;

public class MainTest {
    public static void main(String[] args) {
        for (int i = 0;i < args.length;i++){
            System.out.println("**" + args[i]);

            int num = Integer.parseInt(args[i]);
            System.out.println(num + 1);
            MainTest mainTest = new MainTest();
            System.out.println(mainTest.pr(2));
        }
    }

    public int pr(final int i){
        return i + 1;
    }
}
