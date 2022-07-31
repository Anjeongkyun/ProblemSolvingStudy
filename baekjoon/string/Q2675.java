package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q2675 {

    static int N, M;
    static String word;
    static StringBuilder sb;
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
    }

    static void solve() throws IOException {

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            M = Integer.parseInt(st.nextToken());
            word = st.nextToken();

            for (int k = 0; k < word.length(); k++) {
                for (int j = 0; j < M; j++) {
                    sb.append(word.charAt(k));
                }
            }
            sb.append('\n');
        }

        System.out.println(sb.toString());
    }
}
