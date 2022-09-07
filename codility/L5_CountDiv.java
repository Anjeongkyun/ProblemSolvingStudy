package codility;

public class L5_CountDiv {
    public static void main(String[] args) {
        int A = 6;
        int B = 11;
        int K = 2;
        solve(A, B, K);
    }

    private static int solve(int A, int B, int K){

        int chkCnt = 0;
        chkCnt = (B / K) - (A / K);

        if(A % K == 0)
            chkCnt++;

        System.out.println(chkCnt);
        return chkCnt;
    }
}
