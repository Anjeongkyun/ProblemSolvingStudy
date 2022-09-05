package codility;

import java.util.Arrays;

public class L3_PermMissingElem {
    public static void main(String[] args) {
        int[] candiArr = {2, 3, 1, 5};

        Arrays.sort(candiArr);

        for (int i = 0; i < candiArr.length; i++) {
            if(candiArr[i] != i+1){
                System.out.println(i+1);
                break;
            }
        }
    }
}
