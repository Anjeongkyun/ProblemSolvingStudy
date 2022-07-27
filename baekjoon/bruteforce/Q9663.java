package baekjoon.bruteforce;

import java.util.Scanner;

public class Q9663 {
    static int N, ans;
    static int[] col;

    public static void main(String[] args) {
        input();
        recFunc(1);
        System.out.println(ans);

    }

    static void input(){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        col = new int[N + 1];
    }

    static void recFunc(int row){
        if(row == N +1){
            if(validationCheck()){
                ans++;
            }
        }else{
            for(int c =1; c <=N; c++){
                col[row] = c;
                recFunc(  row + 1);
                col[row] = 0;
            }
        }
    }

    private static boolean validationCheck() {
        for(int i=1; i<=N; i++) {
            for (int j = 1; j < i; j++) {
                if (attackable(i, col[i], j, col[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean attackable(int r1, int c1, int r2, int c2){
            if (c1 == c2) return true;
            if (r1 - c1 == r2 - c2) return true;
            if (r1 + c1 == r2 + c2) return true;
            return false;

    }
}
