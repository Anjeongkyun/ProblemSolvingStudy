package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1018 {

    static int N,M;
    static boolean[][] inputArr;
    static int minVal = 64;
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        input();
        solve();
        close();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        inputArr = new boolean[N][M];

    }
    static void close() throws IOException {
        br.close();
    }
    static void solve() throws IOException {
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                if(str.charAt(j) == 'W')
                    inputArr[i][j] = true;
                else
                    inputArr[i][j] = false;
            }
        }

        int row = N - 7;
        int col = M - 7;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                find(i, j);
            }
        }
        System.out.println(minVal);
    }

    static void find(int x, int y) {
        int endX = x + 8;
        int endY = y + 8;
        int cnt = 0;

        boolean TF = inputArr[x][y];

        for (int i = x; i < endX; i++) {
            for (int j = y; j < endY; j++) {

                if (inputArr[i][j] != TF)
                    cnt++;

                TF = !TF;
            }

            TF = !TF;
        }
        cnt = Math.min(cnt, 64 - cnt);
        minVal = Math.min(minVal, cnt);
    }
}
