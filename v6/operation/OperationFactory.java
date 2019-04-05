package com.company.v6.operation;

import java.util.List;

public class OperationFactory {


    public Operation getInstance(String Operator, List<Double> inputNumbers){

        Operation operation = null;
        if ("add".equals(Operator)) {
            operation = new AddOperation(inputNumbers.get(0), inputNumbers.get(1));
        } else if ("sub".equals(Operator)) {
            operation = new SubOperation(inputNumbers.get(0), inputNumbers.get(1));
        } else if ("mul".equals(Operator)) {
            operation = new MulOperation(inputNumbers.get(0), inputNumbers.get(1));
        } else if ("div".equals(Operator)) {
            operation = new DivOperation(inputNumbers.get(0), inputNumbers.get(1));
        }
        return operation;
    }
}
