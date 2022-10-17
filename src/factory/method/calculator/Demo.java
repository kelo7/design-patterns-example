package factory.method.calculator;

import factory.simple.calculator.Operation;


public class Demo {
    public static void main(String[] args) {
        IFactory operFactory = new AddFactory();
        Operation operation = operFactory.createOperation();

        operation.numberA = 1;
        operation.numberB = 2;
        double result = operation.result();
        System.out.println(result);
    }


}
