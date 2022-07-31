package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1157 {
    static BufferedReader br;
    static String inputStr;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        inputStr = br.readLine();
        arr = new int[26];
        br.close();
    }

    static void solve() {
        for (int i = 0; i < inputStr.length(); i++) {
            if ('a' <= inputStr.charAt(i) && inputStr.charAt(i) <= 'z') {
                arr[inputStr.charAt(i) - 97]++;
            }else{
                arr[inputStr.charAt(i) - 65]++;
            }
        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            } else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
