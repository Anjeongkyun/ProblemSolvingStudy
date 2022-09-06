package codility;

public class L5_PassingCars {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1};

        int chkCnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) continue;

            for (int j = i; j < arr.length; j++) {
                if(arr[j] == 1)
                    chkCnt++;

            }
        }
        System.out.println(chkCnt);
    }
}
