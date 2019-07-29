package com.ys.algorithmproject.leetcode.demo.IO;

import org.junit.Test;

import java.io.*;

/**
 * Create by YSOcean
 */
public class IOTest {

    @Test
    public void readFile(){
        Reader in = null;
        try {
            //1、构造文件
            File file = new File("D:\\WorkSpace\\IDEAWorkspace\\algorithmproject\\src\\hello.txt");

            //2、构造流
            //in = new FileInputStream(file);
            in = new FileReader(file);
            //3、读取文件
            char[] buffer = new char[1024];
            int len = 0;
            while((len = in.read(buffer)) != -1){
                System.out.print(new String(buffer,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4、关闭流
            if(in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }

    @Test
    public void testCopyFile(){
        InputStream in = null;
        OutputStream out = null;
        try {
            //1、构造文件
            File file1 = new File("D:\\WorkSpace\\IDEAWorkspace\\algorithmproject\\src\\hello.txt");
            File file2 = new File("D:\\WorkSpace\\IDEAWorkspace\\algorithmproject\\src\\hello2.txt");

            //2、构造流
            in = new FileInputStream(file1);
            out = new FileOutputStream(file2);

            //3、进行复制操作
            byte[] buffer = new byte[1024];
            int len = 0;
            while((len = in.read(buffer)) != -1){
                out.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4、关闭流
            if(in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}
