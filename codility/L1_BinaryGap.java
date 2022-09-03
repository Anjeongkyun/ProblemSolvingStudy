package codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L1_BinaryGap {
    public static void main(String[] args) {
        //10010001 -> 3
        // 100000 -> 0
        // 11111 -> 0

        int N = 529;
        String binary = Integer.toBinaryString(N);
        System.out.println(binary);
        String[] binaryArr = binary.split("");

        int zeroCnt = 0;
        int tempZeroCnt = 0;
        List<Integer> zeroCntList = new ArrayList<>();

        for(String str : binaryArr){
            if(str.equals("0")){
                zeroCnt ++;
            }else{
                tempZeroCnt = zeroCnt;
                zeroCnt = 0;
                zeroCntList.add(tempZeroCnt);
            }
        }

        System.out.println(Collections.max(zeroCntList));

    }
}
