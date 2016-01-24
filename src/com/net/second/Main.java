package com.net.second;

import com.net.second.operation.Operation;
import com.net.second.operation.OperationFactory;

/**
 * Created by daidaijie on 2016/1/23.
 */
public class Main {
    public static void main(String[] args) {
        Operation oper;

        oper = OperationFactory.createOperate("-");
        oper.setNumberA(100);
        oper.setNumberB(50);

        double result = oper.getResult();

        System.out.println("result = " + result);
    }
}
