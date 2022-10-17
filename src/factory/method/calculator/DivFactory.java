package factory.method.calculator;

import factory.simple.calculator.Operation;
import factory.simple.calculator.OperationDiv;

public class DivFactory implements IFactory{

    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
