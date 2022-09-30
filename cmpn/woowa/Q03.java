package cmpn.woowa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q03 {
    public static void main(String[] args) {
        int[] A = {3, 2, -2, 5, -3};
        int[] B = {1, 1, 2, -1, 2, -1};
        solve2(B);
    }

    private static int solve(int[] A){

        int[] newA = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            newA[i] = Math.abs(A[i]);
        }

        Arrays.sort(newA);

        for (int i = newA.length - 1; i > 0; i--) {
            if (newA[i] != newA[i - 1]) {
                continue;
            } else {
                return Arrays.stream(newA).max().getAsInt();
            }
        }

        return 0;
    }

    private static int solve2(int[] A) {
        // -가 있는것만 배열로 새로 만들고
        List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
        int[] newA = new int[A.length];
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                int abs = Math.abs(A[i]);
                if (list.contains(abs)) {
                    newA[i] = abs;
                }
            }
        }
            if (newA.length == 0)
                return 0;
            else
                return Arrays.stream(newA).max().getAsInt();
    }
}
