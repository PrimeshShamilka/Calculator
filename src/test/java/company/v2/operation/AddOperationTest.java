package company.v2.operation;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AddOperationTest {


    @Test
    public void should_return_correct_answer_when_positive_numbers_given() throws OperationException {
        AddOperation addOperation = new AddOperation(Arrays.asList(2.0,5.0));
        double result = addOperation.perform();

        // Assert statement
        assertThat(result, is(7.0));

    }

    @Test
    public void should_return_zero_when_zeros_are_given() throws OperationException {
        AddOperation addOperation = new AddOperation(Arrays.asList(0.0,0.0));
        double result = addOperation.perform();

        // Assert statement
        assertThat(result, is(0.0));
    }

    @Test (expected = OperationException.class)
    public void should_throw_an_exception_when_list_size_is_less_than_2() throws OperationException {
        AddOperation addOperation = new AddOperation(Arrays.asList(0.0));
        double result = addOperation.perform();

        // no Assert statement

    }

}