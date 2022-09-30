package baekjoon.aba;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class l2_string1 {
    static String word;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        input();
        solve();
    }


    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        word = br.readLine();

        arr = new int[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        br.close();
    }

    static void solve(){
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if(arr[ch - 'a'] == -1){
                arr[ch - 'a'] = i;
            }
        }

        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}
