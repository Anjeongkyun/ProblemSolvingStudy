package programmers.hash;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class phoneBook {
    public static void main(String[] args) {
        String[] case1 = {"119", "97674223", "1195524421"};
        String[] case2 = {"12", "567", "123", "1235", "88"};
        String[] case3 = {"123","456","789"};

        System.out.println(solve(case1));
        System.out.println(solve(case2));
        System.out.println(solve(case3));
    }

    private static boolean solve(String[] phoneBooks) {
        Arrays.sort(phoneBooks);
        return IntStream.range(0, phoneBooks.length -1)
            .noneMatch(
                idx -> phoneBooks[idx + 1].startsWith(phoneBooks[idx])
            );
    }
}
