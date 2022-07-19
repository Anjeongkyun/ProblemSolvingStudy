package baekjoon.bruteforce;

import java.util.Scanner;

public class Q15650 {

    static StringBuilder sb = new StringBuilder();
    static int N,M;
    static int[] selected;

    public static void main(String[] args) {
        input();
        recFunc(1);
        System.out.println(sb.toString());
    }

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        selected = new int[M + 1];
    }

    static void recFunc(int k){
        if (k == M + 1) {
            for(int i = 1; i <= M; i++){
                sb.append(selected[i]).append(' ');
            }
            sb.append('\n');
        }else{
            for(int cand = selected[k - 1] + 1; cand <= N; cand++){
                selected[k] = cand;
                recFunc(k + 1);
                selected[k] = 0;
            }
        }
    }
}
