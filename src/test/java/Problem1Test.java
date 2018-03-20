import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class Problem1Test {

    private Problem1 problem1 = new Problem1();

    @Test
    public void shouldBeABleToGetAllPermutationsOfAList() {
        List<List<Integer>> expectedPermutations = new ArrayList<>();
        expectedPermutations.add(Arrays.asList(1,2));
        expectedPermutations.add(Arrays.asList(1,7));
        expectedPermutations.add(Arrays.asList(1,10));

        expectedPermutations.add(Arrays.asList(2,7));
        expectedPermutations.add(Arrays.asList(2,10));

        int[] ary = {10, 15, 3, 7};
        expectedPermutations.add(Arrays.asList(7,10));

        int k = 17;
        boolean permutations = problem1.checkIfPermutationsSumsToK(ary, k);

        assertTrue(permutations);
    }


}