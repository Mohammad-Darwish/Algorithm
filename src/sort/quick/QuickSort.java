package sort.quick;

public class QuickSort {

    public void quickSortProxy(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int partitionIndex = partition(array, lowIndex, highIndex);
            quickSort(array, lowIndex, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, highIndex);
        }
    }

    private int partition(int[] array, int lowIndex, int highIndex) {
        int pivot = array[highIndex];
        int i = lowIndex - 1;

        for (int j = lowIndex; j < highIndex; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }

        array[highIndex] = array[i + 1];
        array[i + 1] = pivot;

        return i + 1;
    }
}
