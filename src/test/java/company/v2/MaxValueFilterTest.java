package company.v2;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;


public class MaxValueFilterTest {

    @Test
    public void should_return_a_negative_value_when_all_values_in_the_list_are_negative(){
        MaxValueFilter maxValueFilter = new MaxValueFilter();
        int result = maxValueFilter.filter(new int[]{-1,-2});

        assertThat(result, is(-1));

    }
}