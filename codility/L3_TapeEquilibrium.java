package codility;

public class L3_TapeEquilibrium {
    public static void main(String[] args) {
        int[] candArr = {3, 1, 2, 4, 3};

        int sumAllVal = 0;
        for(int cand : candArr)
            sumAllVal += cand;

        int minDiff = Integer.MAX_VALUE;
        int currentDiff = Integer.MAX_VALUE;
        int sumLeftVal = 0;
        int sumRightVal = 0;
        for (int i = 0; i < candArr.length - 1; i++) {
            sumLeftVal += candArr[i];
            sumRightVal = sumAllVal - sumLeftVal;
            currentDiff = Math.abs(sumLeftVal - sumRightVal);
            minDiff = Math.min(currentDiff, minDiff);
        }
        System.out.println(minDiff);
    }
}
