package com.java.jikexueyuan.myiodecorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 自定义IO流的一层装饰者
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new UpperCaseInputStream(new BufferedInputStream(
                    new FileInputStream("F:\\test.txt")));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
