package com.atguigu.stream;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountTest {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        FileReader fr = null;
        BufferedWriter bfw = null;
        try {
            fr = new FileReader("C:\\Users\\123\\Desktop\\hello.txt");

            int c = 0;
            while ((c = fr.read()) != -1) {
                char ch = (char) c;
                if (map.get(ch) == null) {
                    map.put(ch, 1);
                } else {
                    map.put(ch, map.get(ch) + 1);
                }
            }

            bfw = new BufferedWriter(new FileWriter("C:\\Users\\123\\Desktop\\count.txt"));
            Set<Map.Entry<Character, Integer>> entries = map.entrySet();
            for (Map.Entry<Character, Integer> entry : entries) {
                switch (entry.getKey()) {
                    case ' ':
                        bfw.write("空格=" + entry.getValue());
                        break;
                    case '\t':
                        bfw.write("tab键=" + entry.getValue());
                        break;
                    case '\r':
                        bfw.write("回车" + entry.getValue());
                        break;
                    case '\n':
                        bfw.write("换行" + entry.getValue());
                        break;
                    default:
                        bfw.write(entry.getKey() + "=" + entry.getValue());
                        break;
                }
                bfw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (bfw != null) {
                try {
                    bfw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
