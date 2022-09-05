package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class L3_TapeEquilibrium {
    public static void main(String[] args) {
        int[] candArr = {3, 1, 2, 4, 3};
//        Math.abs(-1);

        List<Integer> list = new ArrayList<>();
        int calculVal = -1;
        boolean isFirst = true;
        for (int i = 0; i < candArr.length - 1; i++) {
            int[] oneArr = Arrays.copyOfRange(candArr, 0, i + 1);
            int oneSum = Arrays.stream(oneArr).sum();

            int[] twoArr = Arrays.copyOfRange(candArr, i + 1, candArr.length);
            int twoSum = Arrays.stream(twoArr).sum();

            list.add(Math.abs(oneSum - twoSum));
        }

        System.out.println(Arrays.asList(list));
        System.out.println(Collections.min(list));
    }
}
