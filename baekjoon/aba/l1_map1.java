package baekjoon.aba;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class l1_map1 {
    static BufferedReader br;
    static BufferedWriter bw;
    static StringTokenizer st;
    static List<Integer> oneArr;
    static int N, M;


    public static void main(String[] args) throws IOException {
        input();
        solve();
        close();
    }
    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        oneArr = new ArrayList<Integer>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            oneArr.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(oneArr);

        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

    }

    static void solve() throws IOException {
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            searchFunc(num);
        }
    }

    static int searchFunc(int searchItem){
        int leftIdx = 0;
        int rightIdx = N - 1;
        int num = 0;

        while (leftIdx <= rightIdx) {
            int mIdx = (leftIdx + rightIdx) / 2;
            int mVal = oneArr.get(mIdx);

            if(mVal < oneArr.get(mIdx-1) && mVal > oneArr.get(mIdx-1)){
                if(mVal < oneArr.get(mIdx-1)){
                    rightIdx = mIdx - 1;
                    num ++;
                }else if (mVal > oneArr.get(mIdx-1)){
                    leftIdx = mIdx + 1;
                    num ++;
                }
            }else{

            }
        }

        return num;
    }

    static void close() throws IOException {
        br.close();
        bw.close();
    }
}
