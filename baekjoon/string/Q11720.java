package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11720 {
    static int N;
    static char[] chars;
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        input();
        solve();
        close();
    }
    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        chars = new char[N];
        st = new StringTokenizer(br.readLine());
        chars = st.nextToken().toCharArray();
    }

    static void solve() throws IOException {
        int sum = 0 ;
        for (int i = 0; i < N; i++) {
            sum += Character.getNumericValue(chars[i]);
        }
        System.out.println(sum);
    }

    private static void close() throws IOException {
        br.close();
    }
}
