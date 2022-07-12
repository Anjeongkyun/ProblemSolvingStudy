package mergesort;
import java.util.ArrayList;
import java.util.List;

// 중간 사이즈 구하기
public class Split {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<7; i++)
            list.add(i,(int)(Math.random() * 100));

        split(list);
    }

    private static void split(ArrayList<Integer> list){
        if(list.size() <=1)
            return;

        int mediumSize = list.size() / 2;

        List<Integer> leftArray = list.subList(0, mediumSize);
        List<Integer> rightArray = list.subList(mediumSize, list.size() - 1);

        System.out.println(leftArray);
        System.out.println(rightArray);
    }
}
