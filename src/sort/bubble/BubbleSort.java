package sort.bubble;

public class BubbleSort {

    public void bubbleSort(int[] arr) {
        int count = 0;
        boolean swapped = true;
        while (swapped) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    i = -1;
                }
                count++;
            }
        }

        System.out.println(count);
    }

}
