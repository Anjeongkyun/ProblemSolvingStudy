package baekjoon.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        int[] oneArr = new int[N];

        for (int i = 0; i < N; i++) {
            oneArr[i] = Integer.parseInt(st.nextToken());
        }


        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine()," ");
        int[] twoArr = new int[M];

        for (int i = 0; i < M; i++) {
            twoArr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            for(int j = 0; i< N; j++){
                if(Arrays.asList(twoArr).contains(oneArr[j])){
                    sb.append(1).append(' ');
                }else{
                    sb.append(0).append(' ');
                }
            }
        }

    }
}
