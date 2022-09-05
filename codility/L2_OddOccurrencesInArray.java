package codility;

import java.util.*;

public class L2_OddOccurrencesInArray {
    public static void main(String[] args) {
        int[] candiArr = {9, 3, 9, 7, 3, 9, 9};

        Map<Integer, Integer> candiMap = new HashMap<>();

        for (int i = 0; i < candiArr.length; i++) {
            if(candiMap.containsKey(candiArr[i]))
                candiMap.put(candiArr[i], candiMap.get(candiArr[i]) + 1);
            else
                candiMap.put(candiArr[i], 1);

        }

        for(int candi : candiMap.keySet()){
            if(candiMap.get(candi) % 2 == 1){
                System.out.println(candi);
                break;
            }
        }
    }
}
