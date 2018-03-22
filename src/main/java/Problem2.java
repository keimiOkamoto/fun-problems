import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
 *
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 *
 * Follow-up: what if you can't use division?
 */
class Problem2 {

    private static final Function<List<Integer>, Optional<Integer>> getProductsum = (x -> x.stream().reduce((z , y) -> z * y));

    List<Integer> getProduct(int[] ary, List<Integer> buffer) {
        List<Integer> array = Arrays.stream(ary).boxed().collect(Collectors.toList());

        for (int x = 0; x < array.size(); x++) {
            List<Integer> original = new ArrayList<>(array);
            array.remove(x);
            buffer.add(getProductsum.apply(array).get());
            array = new ArrayList<>(original);
        }
        return buffer;
    }

}
