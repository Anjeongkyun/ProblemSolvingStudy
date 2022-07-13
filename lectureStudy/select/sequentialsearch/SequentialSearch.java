package lectureStudy.select.sequentialsearch;

import java.util.ArrayList;
import java.util.Scanner;

public class SequentialSearch {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<20; i++)
            list.add(i);

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(searchFunc(list, num));
    }

    private static int searchFunc(ArrayList<Integer> list, int searchItem){

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == searchItem)
                return i;
        }
        return -1;
    }
}
