import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.function.Consumer;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 2, 6, 3);
        // int sum = 0;
        // for (int n : nums) {
        // if (n % 2 == 0) {
        // n = n * 2;
        // sum = sum + n;
        // }
        // }
        // System.out.println(sum);
        // System.out.println(nums);

        // we have stream api to do this
        // Consumer<Integer> con = new Consumer<Integer>() {

        // public void accept(Integer t) {
        // System.out.println(t);
        // }

        // };
        // Consumer<Integer> con = (Integer t) -> {
        // System.out.println(t);
        // };
        // nums.forEach(con);
        // that's how foreach works
        // nums.forEach(n -> System.out.println(n));
        Stream<Integer> s1 = nums.stream(); // returns stream of objects
        // if you changes stream values // changes wil not be reflected in nums
        // // s1.forEach(n -> System.out.println(n));// once you use stream we can't re
        // use
        // // it
        // // s1.forEach(n->System.out.println(n)); // this will give you an error
        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        // // System.out.println(s2);
        // // s2.forEach(n -> System.out.println(n));
        // Stream<Integer> s3 = s2.map(n -> n * 2);
        // // s3.forEach(n -> System.out.println(n));
        // int result = s3.reduce(0, (c, e) -> c + e);
        // System.out.println(result);
        // applying
        int result = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);
        System.out.println(result);

    }
}
