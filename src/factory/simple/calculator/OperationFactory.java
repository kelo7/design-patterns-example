package factory.simple.calculator;

public class OperationFactory {
    public static Operation createOperation(char operator) {
	Operation operation = switch (operator) {
		case '+' -> new OperationAdd();
		case '-' -> new OperationSub();
		case '*' -> new OperationMul();
		case '/' -> new OperationDiv();
		default -> throw new RuntimeException("unsupported operation");
	};

		return operation;
    }
}
