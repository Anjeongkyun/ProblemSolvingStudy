package codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L1_BinaryGap {
    public static void main(String[] args) {
        //10010001 -> 3
        // 100000 -> 0
        // 11111 -> 0

        int N = 9;
        String binary = Integer.toBinaryString(N);
        String[] binaryArr = binary.split("");
        System.out.println(binary);

        int tempVal = 0;
        List<Integer> answerList = new ArrayList<>();
        answerList.add(0);

        boolean isZero = false;
        for (int i = 0; i < binaryArr.length; i++) {
            if(binaryArr[i].contains("1")){
                isZero = true;
                tempVal++;
            }else{
                if(binaryArr[i].contains("1")){
                    isZero = false;
                    answerList.add(tempVal);
                    tempVal = 0;
                }
                if(isZero)
                    tempVal++;
            }
        }

        System.out.println(Collections.max(answerList));
    }
}
