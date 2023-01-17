package sort.quick;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 9, 4, 6, 5, 3, 8, 4, 6, 7, 3, 8, 11, 79, 0, 458, 74};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSortProxy(arr);
        System.out.println(Arrays.toString(arr));
    }
}
