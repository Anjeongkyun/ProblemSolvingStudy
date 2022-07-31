package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2908 {
    static int N,M;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

    }

    static void solve(){
        int num1 = Integer.parseInt(sb.append(N).reverse().toString());

        sb = new StringBuilder();
        int num2 = Integer.parseInt(sb.append(M).reverse().toString());

        if(num1 > num2)
            System.out.println(num1);
        else
            System.out.println(num2);

    }
}
