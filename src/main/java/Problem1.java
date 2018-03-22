import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of numbers, return whether any two sums to K.
 * For example, given [10, 15, 3, 7] and K of 17, return true since 10 + 7 is 17.
 */

class Problem1 {

    boolean checkIfPermutationsSumsToK(int[] ary, int k) {
        return getPermutations(ary, new ArrayList<>()).stream()
                                                      .map(l -> l.get(0) + l.get(1))
                                                      .anyMatch(x -> x == k);

    }

    private List<List<Integer>> getPermutations(int[] ary, List<List<Integer>> buffer) {
        if (ary.length == 2) {
            buffer.add(Arrays.asList(ary[0], ary[1]));
            return buffer;
        } else {
            int numBuffer = ary[0];

            for (int x = 1; x< ary.length; x++) {
                buffer.add(Arrays.asList(numBuffer, ary[x]));
            }
            return getPermutations(Arrays.copyOfRange(ary, 1, ary.length), buffer);
        }
    }
}
