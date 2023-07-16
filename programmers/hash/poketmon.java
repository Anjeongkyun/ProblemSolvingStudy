package programmers.hash;

import java.util.Arrays;
import java.util.stream.Collectors;

public class poketmon {
    public static void main(String[] args) {
        int[] nums1 = {3, 3, 3, 2, 2, 4};
        int[] nums2 = {3,3,3,2,2,2};

        System.out.println(solve(nums1));
        System.out.println(solve(nums2));
    }

    private static int solve(int[] nums) {
        var map = Arrays.stream(nums)
            .boxed()
            .collect(
                Collectors.toMap(
                    idx -> idx,
                    idx -> 1,
                    Integer::sum
                )
            );

        return map.size() < nums.length / 2 ? map.size() : nums.length / 2;
    }
}
