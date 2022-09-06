package com.atguigu.method3;

public interface USB {

    void start();

    void stop();
}


class Phone implements USB{

    public void start(){
        System.out.println("开始传输王者荣耀");
    }

    public void stop(){
        System.out.println("结束传输！");
    }
}


class  Computer implements USB{

    public void start(){
        System.out.println("开始传输小电影");
    }

    public void stop(){
        System.out.println("传输失败！");
    }
}



class p{
    //虚拟方法调用
    public void i(USB s){
        s.start();
        s.stop();
    }
}


class USBTest{
    public static void main(String[] args) {
        p p = new p();
        USB s = new Computer();
        p.i(s);


        //有名对象匿名类
        USB q = new USB() {
            @Override
            public void start() {
                System.out.println("oo");
            }

            @Override
            public void stop() {
                System.out.println("oo");
            }
        };
        //匿名对象匿名类
        p.i(new USB() {
            @Override
            public void start() {
                System.out.println("nice");
            }

            @Override
            public void stop() {
                System.out.println("perfect");
            }
        });
    }
}