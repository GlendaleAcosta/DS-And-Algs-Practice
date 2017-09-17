package alg.QuickSort;

public class QuickSort {

    public void quickSort(int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        quickSort(a, lo, hi);
    }

    public void quickSort(int[] a, int lo, int hi) {
        if (lo < hi) {
            int q = partition(a, lo, hi);
            quickSort(a, lo, q - 1);
            quickSort(a, q + 1, hi);
        }
    }

    public int partition(int[] a, int lo, int hi) {
        int i = lo - 1;
        int pivot = a[hi];
        for(int j = lo; j <= hi - 1; j++) {
            if (a[j] <= pivot) {
                i++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        int ival = a[i+1];
        a[hi] = ival;
        a[i+1] = pivot;
        return i + 1;
    }
}
