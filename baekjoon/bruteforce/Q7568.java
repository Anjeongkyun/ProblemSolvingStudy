package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q7568 {

    static int N;
    static int[][] inputArr;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        input();
        solve();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine()," ");

        N = Integer.parseInt(token.nextToken());
        inputArr = new int[N][2];


        for (int i = 0; i < N; i++) {
            token = new StringTokenizer(br.readLine()," ");
            for(int j =0; j < 2; j++){
                inputArr[i][j] = Integer.parseInt(token.nextToken());
            }
        }
        br.close();
    }

    static void solve() {

        for (int i = 0; i < N; i++) {
            int rank = 1;

            for (int j = 0; j < N; j++) {
                if(i == j) continue;
                if(inputArr[i][0] < inputArr[j][0] && inputArr[i][1] < inputArr[j][1])
                    rank ++;
            }
            sb.append(rank).append(' ');
        }

        System.out.println(sb.toString());
    }
}
