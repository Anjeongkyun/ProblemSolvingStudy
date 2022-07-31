package baekjoon.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        list = list.stream().distinct().collect(Collectors.toList());
        Collections.sort(list);
        
        for (int i = 0; i < N; i++) {
            System.out.println(list.get(i));
        }
    }
}
