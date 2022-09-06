package com.atguigu.test;

public class Test5 {
    public static void main(String[] args) {
        try{
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            Test5 t = new Test5();
            t.ecm(i,j);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("缺少参数");
        }catch (NumberFormatException e) {
            System.out.println("需要输入数字");
        }catch (ArithmeticException e){
            System.out.println("分母为0");
        }catch (TestException e){
            System.out.println(e.getMessage());
        }
    }

    public int ecm(int i,int j) throws TestException{
        if (i < 0 || j < 0){
            throw new TestException("除数或被除数小于0");
        }
        return i / j;
    }
}

class TestException extends Exception{
    static final long serialVersionUID = -3387512993124229948L;

    public TestException(){

    }
    public TestException(String messaage){
        super(messaage);
    }
}