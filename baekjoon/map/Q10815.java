package baekjoon.map;

import com.sun.deploy.util.ArrayUtil;

import java.io.*;
import java.util.*;


public class Q10815 {
    static BufferedReader br;
    static BufferedWriter bw;
    static StringBuilder sb;
    static StringTokenizer st;
    static int[] oneArr;
    static int[] twoArr;
    static int N, M;


    public static void main(String[] args) throws IOException {
        input();

    }
    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        oneArr = new int[N];
        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < N; i++) {
            oneArr[i] = Integer.parseInt(st.nextToken());
        }

        M = Integer.parseInt(br.readLine());
        twoArr = new int[M];
        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < M; i++) {
            twoArr[i] = Integer.parseInt(st.nextToken());
        }

        br.close();
    }
    static boolean searchFunc(int[] arr, int searchItem){
        Arrays.sort(oneArr);

        return false;
    }
}
