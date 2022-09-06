package codility;

import java.util.Arrays;
import java.util.stream.Collectors;

public class L6_Distinct {
    public static void main(String[] args) {

        int[] arr = {2, 1, 1, 2, 3, 1};
        System.out.println(solve(arr));
    }
    private static int solve(int[] A){


        return Arrays.stream(A).distinct().toArray().length;
    }
}
