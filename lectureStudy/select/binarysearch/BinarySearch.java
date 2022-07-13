package lectureStudy.select.binarysearch;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++)
            list.add(i);

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(searchFunc(list, num));
    }

    private static boolean searchFunc(ArrayList<Integer> list, int searchItem) {

        //사이즈가 1이고, 그 하나가 찾는 값과 같을 경우 -> True
        if (list.size() == 1 && searchItem == list.get(0)) {
            return true;
        }

        //사이즈가 1이고, 그 하나가 찾는 값과 다를 경우 -> False
        if (list.size() == 1 && searchItem != list.get(0)) {
            return false;
        }

        //리스트 사이즈가 0일 경우 -> False
        if (list.size() == 0) {
            return false;
        }

        int mediumSize = list.size() / 2;

        if (searchItem == list.get(mediumSize)) {
            return true;
        } else {
            if (searchItem < list.get(mediumSize)) {
                return searchFunc(new ArrayList<Integer>(list.subList(0, mediumSize)), searchItem);
            } else if (searchItem > list.get(mediumSize)) {
                return searchFunc(new ArrayList<Integer>(list.subList(mediumSize, list.size())), searchItem);
            }
        }

        return false;
    }
}
