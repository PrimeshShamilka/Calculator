package company.v2.operation;

import java.util.List;

public class OperationFactory {
    public Operation getInstance(String operator, List<Double> numbers) {
        Operation operation = null;
        switch (operator) {
            case "add":
                operation = new AddOperation(numbers);
                break;
            case "sub":
                operation = new SubOperation(numbers);
                break;
            case "mul":
                operation = new MulOperation(numbers);
                break;
            case "div":
                operation = new DivOperation(numbers);
                break;
        }
        return operation;
    }
}
