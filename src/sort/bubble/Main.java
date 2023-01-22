package sort.bubble;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 9, 4, 6, 5, 3, 8, 4};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
