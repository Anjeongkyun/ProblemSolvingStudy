package resolving.Q15650;

import java.util.Scanner;

// no solving
public class X_2_20220720 {

    static int N, M;
    static StringBuilder sb = new StringBuilder();
    static int[] selected;

    public static void main(String[] args) {

        input();
        recFunc(1);
        System.out.println(sb.toString());
    }

    private static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        selected = new int[M + 1];
    }
    private static void recFunc(int k){

        if (k == M + 1) {
            for(int i = 1; i <= M; i++){
                sb.append(selected[i]).append(' ');
            }
            sb.append('\n');
        } else {
            for (int cand = 1; cand <= N; cand++) {
                selected[k] = cand;
                recFunc(k + 1);
                selected[k] = 0;
            }
        }
    }
}

