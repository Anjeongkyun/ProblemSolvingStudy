package cmpn.itpk;

public class Q00 {
    public static void main(String[] args) {

        solve(11);
    }

    static int solve(int n){
        int quotient_2 = 0;
        int quotient_3 = 0;
        int quotient_6 = 0;

        quotient_2 = n / 2;
        quotient_3 = n / 3;
        quotient_6 = n / 6;


        System.out.println(n - (quotient_2 + quotient_3 - quotient_6));
        return n - (quotient_2 + quotient_3 - quotient_6);
    }
}
