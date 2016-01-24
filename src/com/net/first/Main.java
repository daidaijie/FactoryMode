package com.net.first;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try {


            Scanner in = new Scanner(System.in);


            System.out.println("请输入数字A:");
            double numberA = in.nextDouble();

            System.out.println("请输入运算符号:");
            String strOperate = in.next();

            System.out.println("请输入数字B:");
            double numberB = in.nextDouble();


            double result = Operation.getResult(numberA, numberB, strOperate);

            System.out.println("result = " + result);
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}
