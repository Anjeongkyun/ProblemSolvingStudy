package baekjoon.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q7795먹을것인가먹힐것인가 {

    static int T,N,M;
    static BufferedReader br;
    static StringTokenizer st;

    static int[] nList;
    static int[] mList;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            input();
            solve();
        }
    }

    static void input() throws IOException {
        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        nList = new int[N+1];
        mList = new int[M+1];

        for (int i = 1; i <= N; i++) {
            nList[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= M; i++) {
            mList[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void solve(){
        Arrays.sort(mList, 1, M+1);

        int ans = 0;
        for (int i = 0; i <= N; i++) {
            ans += lowerBound(nList, 1, M, nList[i]);
        }
        System.out.println(ans);
    }

    static int lowerBound(int[] nList, int L, int R, int X){
        int res = L - 1;
        while(L <= R){
            int mid = (L + R) / 2;
            if(nList[mid] < X){
                res = mid;
                L = mid + 1;
            }else {
                R = mid - 1;
            }
        }
        return res;
    }
}
