package baekjoon.bruteforce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q2798 {

    static int N, M;
    static int[] inputArr;


    public static void main(String[] args) {
        input();
        solve();
    }

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        inputArr = new int[N];

        for (int i = 0; i < N; i++) {
            inputArr[i] = sc.nextInt();
        }
    }

    static void solve() {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < N - 2; i++) {
            for(int j = i+ 1; j < N -1; j++){
                for(int k = j + 1; k < N; k++){
                    if((inputArr[i] + inputArr[j] + inputArr[k]) <= M){
                        list.add(inputArr[i] + inputArr[j] + inputArr[k]);
                    }
                }
            }
        }

        int max = Collections.max(list);
        System.out.println(max);

    }
}
