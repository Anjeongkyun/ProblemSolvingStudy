package codility;

import java.util.*;

public class L2_OddOccurrencesInArray {
    public static void main(String[] args) {
        int[] candiArr = {9, 3, 9, 7, 3, 9, 9};

        Set<Integer> candiSet = new HashSet<>();
        for (int i = 0; i < candiArr.length; i++) {
            if(candiSet.contains(candiArr[i]))
                candiSet.remove(candiArr[i]);
            else
                candiSet.add(candiArr[i]);
        }

        int answer = candiSet.iterator().next();
        System.out.println(answer);
    }
}
