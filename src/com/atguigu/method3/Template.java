package com.atguigu.method3;

//模板方法
public abstract class Template {


    public void spendTime(){
        long strat = System.currentTimeMillis();

        code();

        long end = System.currentTimeMillis();

        System.out.println(end - strat);
    }

    public abstract void code();
}

class SubTemplate extends Template{
    public void code(){
        for (int i = 2;i <= 1000;i++){
            boolean isFlag = true;
            for (int j = 2;j <= Math.sqrt(i);j++){
                if (i % j == 0){
                    isFlag = false;
                    break;
                }
                }if (isFlag){
                System.out.println(i);
            }
        }
    }
}


class TemplateTest{
    public static void main(String[] args) {
        Template t = new SubTemplate();
        t.spendTime();
    }
}
