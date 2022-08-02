package baekjoon.map;

import com.sun.deploy.util.ArrayUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Q10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] oneArr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < N; i++) {
            oneArr[i] = Integer.parseInt(st.nextToken());
        }


        int M = Integer.parseInt(br.readLine());
        int[] twoArr = new int[M];

        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < M; i++) {
            twoArr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            boolean isCheck = false;
            for (int j = 0; j < N; j++) {
                if (twoArr[i] == oneArr[j]) {
                    isCheck = true;
                    break;
                }
            }

            if(isCheck){
                sb.append(1).append(' ');
            }else{
                sb.append(0).append(' ');
            }
        }
        System.out.println(sb.toString());

    }
}
