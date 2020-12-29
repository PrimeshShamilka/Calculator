package company.v2.operation;

import javax.management.OperationsException;
import java.util.List;

public class AddOperation implements Operation {
    private List<Double> numbers;

    public AddOperation(List<Double> numbers) {
        this.numbers = numbers;
    }

    @Override
    public double perform() throws OperationException {

        // handling unchecked exception

        if(numbers.size()<2){
            throw new OperationException("Number list does not contain at least two elements");
        }
        return numbers.get(0)+numbers.get(1);
    }
}
