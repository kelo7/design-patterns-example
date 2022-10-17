package factory.method.calculator;

import factory.simple.calculator.Operation;
import factory.simple.calculator.OperationSub;

public class SubFactory implements IFactory{

    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
