package cmpn.PT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println(x);
        // 12
        // 5 9 3 8 2 4 6 7 8 5 1 2
        int[] arr = new int[x];
        for(int i=0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }



    }
}
