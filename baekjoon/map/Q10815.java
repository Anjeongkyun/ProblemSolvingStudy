package baekjoon.map;

import java.io.*;
import java.util.*;


public class Q10815 {
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
            if(searchFunc(num))
                bw.write("1 ");
            else
                bw.write("0 ");
        }
    }

    static boolean searchFunc(int searchItem){
        int leftIdx = 0;
        int rightIdx = N - 1;

        while (leftIdx <= rightIdx) {
            int mIdx = (leftIdx + rightIdx) / 2;
            int mVal = oneArr.get(mIdx);

            if(searchItem < mVal)
                rightIdx = mIdx - 1;
            else if(searchItem > mVal)
                leftIdx = mIdx + 1;
            else
                return true;
        }
        return false;
    }

    static void close() throws IOException {
        br.close();
        bw.close();
    }
}
