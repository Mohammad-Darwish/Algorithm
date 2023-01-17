package sort.merge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 9, 4, 6, 5, 3, 8, 4};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr, arr.length);
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
