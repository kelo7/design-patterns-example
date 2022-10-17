package factory.method.calculator;

import factory.simple.calculator.Operation;
import factory.simple.calculator.OperationAdd;

public class AddFactory implements IFactory{

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
