package cmpn.onest;

public class Q01 {
    public static void main(String[] args) {

        int N = 100000;
        solve(N);
    }

    private static int solve(int N){
        int sum = elementSum(N);
        int answer = 0;

        if(sum == 1)
            return N * 10;

        while(true){
            N++;
            if(sum == elementSum(N)){
                answer = N;
                break;
            }
        }

        System.out.println(answer);
        return answer;
    }

    private static int elementSum(int N){
        int sum = 0;
        while(N > 0){
            sum += N%10;
            N/=10;
        }
        return sum;
    }
}
