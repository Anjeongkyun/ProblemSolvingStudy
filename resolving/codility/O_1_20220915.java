package resolving.codility;

public class O_1_20220915 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1};
        solve(arr);
    }

    private static int solve(int[] A){
        int zeroCnt = 0;
        int pairCnt = 0;
        for(int n : A){
            if (n == 0) {
                zeroCnt++;
            } else if (n == 1) {
                pairCnt += zeroCnt;
            }
        }
        if(pairCnt > 1000000000 || pairCnt < 0)
            return -1;

        return pairCnt;
    }
}
