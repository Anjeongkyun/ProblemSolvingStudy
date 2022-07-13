package lectureStudy.Recursion;

public class Fibonacci_DP {
    public static void main(String[] args) {

        System.out.println(dp(9));
    }

    private static int dp(int n){
        int[] cache = new int[n + 1];
        cache[0] = 0;
        cache[1] = 1;
        for(int i = 2; i< n + 1; i++){
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[n];
    }
}
