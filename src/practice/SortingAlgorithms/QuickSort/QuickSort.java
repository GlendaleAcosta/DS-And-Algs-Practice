package practice.SortingAlgorithms.QuickSort;

public class QuickSort {

    public void QuickSort(int[] a) {
        int start = 0;
        int end = a.length - 1;
        QuickSort(a, start, end);
    }

    private void QuickSort(int[] a, int start, int end) {
        if (end > start) {
            int p = partition(a, start, end);

            QuickSort(a, start, p - 1);
            QuickSort(a, p + 1, end);

        }
    }

    private int partition(int[] a, int start, int end) {
        int i = start -1;
        for(int j = start; j < end; j++) {
            if (a[j] <= a[end]) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        int temp = a[end];
        a[end] = a[i];
        a[i] = temp;
        return i;
    }
}
