package factory.simple.calculator;

public class OperationAdd extends Operation {

    @Override
    public double result() {
	return numberA + numberB;
    }

}
