package company.v2.operation;

import java.util.List;

public class DivOperation implements Operation {
    private List<Double> numbers;

    public DivOperation(List<Double> numbers) {
        this.numbers = numbers;
    }

    @Override
    public double perform() {
        return numbers.get(0)/numbers.get(1);
    }
}
