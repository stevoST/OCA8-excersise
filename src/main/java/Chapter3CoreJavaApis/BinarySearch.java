package Chapter3CoreJavaApis;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {2, 4, 6, 8, 10, 12};
        int[] unsortedArray = {7, 6, 9, 3, 8, 2, 9, 5};
        for (int i = 0; i <= 15; i++) {
            System.out.println(Arrays.binarySearch(sortedArray, i));
        }
        System.out.println("unsorted: " + Arrays.binarySearch(unsortedArray, 6));

    }
}
