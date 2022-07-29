package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q2798 {

    static int N, M;
    static int[] inputArr;


    public static void main(String[] args) throws IOException {
        input();
        solve();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine()," ");

        N = Integer.parseInt(token.nextToken());
        M = Integer.parseInt(token.nextToken());
        inputArr = new int[N];

        token = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < N; i++) {
            inputArr[i] = Integer.parseInt(token.nextToken());
        }

        br.close();
    }

    static void solve() {
        List<Integer> list = new ArrayList<Integer>();
        int answer = -1;

        for (int i = 0; i < N - 2; i++) {
            if(inputArr[i] >= M) continue;
            for(int j = i+ 1; j < N -1; j++){
                if(inputArr[i] + inputArr[j] >= M) continue;
                for(int k = j + 1; k < N; k++){
                    int sum = (inputArr[i] + inputArr[j] + inputArr[k]);
                    if(M == sum){
                        answer = M;
                    }

                    if(answer < sum && sum < M){
                        answer = sum;
                    }
                }
            }
        }
        System.out.println(answer);

    }
}
