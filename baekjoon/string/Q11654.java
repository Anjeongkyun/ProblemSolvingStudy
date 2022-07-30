package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11654 {

    static int N;
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        input();
        solve();
        close();
    }
    static void solve() throws IOException {
        char ch = br.readLine().charAt(0);
        System.out.println((int) ch);
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    private static void close() throws IOException {
        br.close();
    }
}
