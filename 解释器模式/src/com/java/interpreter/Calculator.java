package com.java.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import com.java.interpreter.cls.RPN;


/**
 * 解释器模式，计算器方法，对数据进行加减乘除的运算
 */
public class Calculator {

    public Calculator() {


        // 随机生成需要运算3组数据，每组6个
        float[][] dataSource = new float[3][6];
        System.out.println("data source:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                dataSource[i][j] = (float) (Math.random() * 100);
                System.out.print(dataSource[i][j] + ",");
            }
            System.out.println(";");
        }

        try {


            // 让用户自定义输入各数据运算的规则
            System.out.println("Input a expression:");
            BufferedReader is = new BufferedReader(new InputStreamReader(
                    System.in));
            for (; ; ) {
                String input = new String();
                input = is.readLine().trim();
                if (input.equals("q"))
                    break;
                else {
                    RPN boya = new RPN(input);
                    HashMap<String, Float> var;

                    // 用abcdef代表存储在HashMap中数据的key
                    for (int i = 0; i < 3; i++) {
                        var = new HashMap<String, Float>();
                        var.put("a", dataSource[i][0]);
                        var.put("b", dataSource[i][1]);
                        var.put("c", dataSource[i][2]);
                        var.put("d", dataSource[i][3]);
                        var.put("e", dataSource[i][4]);
                        var.put("f", dataSource[i][5]);

                        boya.getResult(var);

                    }

                }
                System.out.println("Input another expression or input 'q' to quit:");
            }
            is.close();
        } catch (IOException e) {
            System.out.println("Wrong input!!!");
        }

    }

}
