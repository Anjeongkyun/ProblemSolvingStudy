package codility;

import java.util.Arrays;

public class L3_PermCheck {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 2};
        Arrays.sort(arr);

        int answer = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                answer = 0;
                break;
            }
        }

        System.out.println(answer);

    }
}
