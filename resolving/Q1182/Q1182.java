package resolving.Q1182;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1182 {

    static FastReader scan = new FastReader();
    static int N, S, answer;
    static int[] inputArr;

    public static void main(String[] args) {
        input();
        solve(1,0);

        if(S == 0){
            answer--;
        }

        System.out.println(answer);

    }

    static void input(){
        N = scan.nextInt();
        S = scan.nextInt();
        inputArr = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            inputArr[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(inputArr));

    }

    static void solve(int k , int value){
        if(k == N + 1){

            if(value == S)
                answer ++;

        }else{
            //include
            solve(k + 1, value + inputArr[k]);

            //not include
            solve(k +1, value);
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
