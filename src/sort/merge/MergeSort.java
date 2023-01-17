package sort.merge;

public class MergeSort {

    public void mergeSort(int[] array, int n) {
        if (n < 2) {
            return;
        }

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = array[i];
        }

        mergeSort(l, l.length);
        mergeSort(r, r.length);

        merge(array, l, r, mid, n - mid);
    }

    private void merge(
        int[] array,
        int[] l,
        int[] r,
        int liftLength,
        int rightLength) {

        int i = 0, j = 0, k = 0;

        while (i < liftLength && j < rightLength) {
            if (l[i] <= r[j]) {
                array[k] = l[i];
                i++;
            } else {
                array[k] = r[j];
                j++;
            }
            k++;
        }

        while (i < liftLength) {
            array[k] = l[i];
            i++;
            k++;
        }
        while (j < rightLength) {
            array[k] = r[j];
            k++;
            j++;
        }
    }
}
