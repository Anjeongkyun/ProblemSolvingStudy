package resolving.codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class O_120220918 {
    public static void main(String[] args) {
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
