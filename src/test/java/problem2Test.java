import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class problem2Test {

    private static final int [] ary = {1,2,3,4,5};


    @Test
    public void shouldBeAbleToGetProductOfAGivenArrayFromAGivenIndex() {
        Problem2 problem2 = new Problem2();

        List<Integer> actual = problem2.getProduct(ary, new ArrayList<>());

        List<Integer> expected = Arrays.asList(120, 60, 40, 30, 24);

        assertThat(actual, is(expected));
    }

}