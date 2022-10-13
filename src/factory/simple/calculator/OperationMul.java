package factory.simple.calculator;

public class OperationMul extends Operation {

    @Override
    public double result() {
	return numberA * numberB;
    }

}
