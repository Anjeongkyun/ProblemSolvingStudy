package baekjoon.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q7795먹을것인가먹힐것인가 {

    static int T,N,M;
    static BufferedReader br;
    static StringTokenizer st;

    static List<Integer> nmList;
    static List<Integer> nList;
    static List<Integer> mList;

    public static void main(String[] args) throws IOException {
        input();
        solve();
        close();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        nmList = new ArrayList<>();
        nList = new ArrayList<>();
        mList = new ArrayList<>();

        T = Integer.parseInt(br.readLine());
    }

    static void solve() throws IOException {
        for (int i = 0; i < T; i++) {
            int cnt = 0;
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 2; j++) {
                nmList.add(Integer.parseInt(st.nextToken()));
            }

            N = nmList.get(0);
            M = nmList.get(1);

            st = new StringTokenizer(br.readLine(), " ");
            for (int k = 0; k < N; k++) {
                nList.add(Integer.parseInt(st.nextToken()));
            }

            st = new StringTokenizer(br.readLine(), " ");
            for (int k = 0; k < M; k++) {
                mList.add(Integer.parseInt(st.nextToken()));
            }

            Collections.sort(nList);
            int midIdx = mList.size() / 2;
            for (int l = 0; l < mList.size(); l++) {
                if(nList.get(l) <= mList.get(midIdx))
                    continue;
                else if (nList.get(l) > mList.get(midIdx))
                    cnt ++;
            }

            System.out.println(cnt);
        }
    }

    static void close() throws IOException {
        br.close();
    }
}
