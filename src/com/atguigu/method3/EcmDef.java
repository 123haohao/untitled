package com.atguigu.method3;

public class EcmDef {
    public static void main(String[] args) {
        try{
            Integer i = Integer.parseInt(args[0]);
            Integer j = Integer.parseInt(args[1]);
            int value = e(i,j);
            System.out.println(value);
        }catch(NumberFormatException e){
            System.out.println("输入的参数有误");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("参数不全");
        }catch(ArithmeticException e){
            System.out.println("除数为0");
        }catch (EcDef e){
            e.getMessage();
        }
    }

    public static int e(int i,int j) throws EcDef{
        if (i < 0 || j < 0){
            throw new EcDef("分子或分母为负数");
        }
        return i / j;
    }
}
