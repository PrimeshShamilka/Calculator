package company.v2.operation;

import java.util.List;

public class MulOperation implements Operation {
    private List<Double> numbers;

    public MulOperation(List<Double> numbers) {
        this.numbers = numbers;
    }

    @Override
    public double perform() {
        return numbers.get(0)*numbers.get(1);
    }
}
