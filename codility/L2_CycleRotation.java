package codility;

import java.util.Arrays;

public class L2_CycleRotation {
    public static void main(String[] args) {
        int[] candiArr = {1, 2, 3, 4};
        int K = 4;

        for (int i = 0; i < K; i++) {
            boolean isFirst = true;
            int[] newArr = new int[candiArr.length];
            for (int j = 0; j < candiArr.length; j++) {
                if (isFirst) {
                    newArr[j] = candiArr[newArr.length - 1];
                    isFirst = false;
                } else {
                    newArr[j] = candiArr[j - 1];
                }
            }
            candiArr = newArr;
        }

        System.out.println(Arrays.toString(candiArr));
    }
}
