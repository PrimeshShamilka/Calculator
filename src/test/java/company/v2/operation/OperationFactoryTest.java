package company.v2.operation;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class OperationFactoryTest {

    @Test
    public void should_return_AddOperation_when_add_is_given(){
        OperationFactory factory = new OperationFactory();
        Operation operation = factory.getInstance("add", new ArrayList<>());

        // search in google - junit assert instance of

        assertThat(operation, instanceOf(AddOperation.class));

    }

}