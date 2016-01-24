package com.net.second.operation;

/**
 * Created by daidaijie on 2016/1/23.
 */
public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        double result = 0.0;

        result = getNumberA() + getNumberB();

        return result;
    }
}
