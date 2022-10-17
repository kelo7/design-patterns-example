package factory.method.calculator;

import factory.simple.calculator.Operation;
import factory.simple.calculator.OperationMul;

public class MulFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
