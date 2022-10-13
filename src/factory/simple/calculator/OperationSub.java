package factory.simple.calculator;

public class OperationSub extends Operation {

    @Override
    public double result() {
	return numberA - numberB;
    }

}
