package com.atguigu.stream;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\123\\IdeaProjects\\untitled\\src\\com\\atguigu\\generic\\hello.txt");
        System.out.println(file.getAbsolutePath());//获取绝对路径
        System.out.println(file.getPath());//获取路径
        System.out.println(file.getName());//获取文件名
        System.out.println(file.getParent());//获取文件上层的绝对路径
        System.out.println(file.length());//获取文件的长度(字节数)
        System.out.println(file.lastModified());//获取最后一次的修改时间,毫秒值

        System.out.println(file.list());//获取指定目录下的所有文件或文件目录名称的数组
        System.out.println(file.listFiles());//获取指明目录下的所有文件或文件目录的File数组

        File file1 = new File("C:\\Users\\123\\Documents\\QQ飞车");
        String[] list = file1.list();
        for (String s : list) {
            System.out.println(s);
        }

        File[] files = file1.listFiles();
        for (File file2 : files) {
            System.out.println(file2);

        }

        File file5 = new File("C:\\Users\\123\\Desktop\\hhh.txt");
        File file6 = new File("D:\\io\\hello.txt");

        System.out.println(file6.renameTo(file5));

        System.out.println("*************************");

        System.out.println(file5.isFile());//判读是否是文件
        System.out.println(file5.isDirectory());//判断是否是目录
        System.out.println(file5.exists());//判断是否存在
        System.out.println(file5.canRead());//判断是否可读
        System.out.println(file5.canWrite());//判断是否可写
        System.out.println(file5.isHidden());//判断是否隐藏
    }


    @Test
    public void test() throws IOException {
        File file1 = new File("D:\\io\\hello.txt");

        if (!file1.exists()){
            file1.createNewFile();
            System.out.println("创建成功");
        }else {
            file1.delete();
            System.out.println("删除成功");
        }


        File file2 = new File("D:\\io\\io1\\io1\\ioo");
        System.out.println(file2.mkdir());


        File file3 = new File("D:\\io\\io1\\ioo");
        System.out.println(file3.mkdirs());
    }

    @Test
    public void test2(){
        File file = new File("C:\\Users\\123\\Documents\\QQ飞车\\1936974241\\截图");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s.endsWith(".jpg"));
        }
    }
}
