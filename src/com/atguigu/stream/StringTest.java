package com.atguigu.stream;

import org.junit.Test;

import java.io.*;

public class StringTest {
    @Test
    public void ObjectOutputStream(){
        ObjectOutputStream oos = null;
        try {
            //1.提供File类、字节流、对象流
            oos = new ObjectOutputStream(new FileOutputStream("huh.txt"));
            //2.写出操作
            oos.writeObject(new String("我爱你"));
            oos.flush();//刷新操作
            oos.writeObject(new String("一万年"));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //3.关闭流
            if (oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    @Test
    public void ObjectInputStream(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("huh.txt"));

            Object obj = ois.readObject();
            System.out.println(obj);
            System.out.println(ois.readObject());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

