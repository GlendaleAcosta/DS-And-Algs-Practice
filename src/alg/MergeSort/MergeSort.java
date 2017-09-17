package alg.MergeSort;

public class MergeSort {
    public void mergeSort(int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        mergeSort(a, lo, hi);
    }

    public void mergeSort(int[] a, int lo, int hi) {
        if (lo < hi) {
            int mid = (lo + hi) / 2;
            mergeSort(a, lo, mid);
            mergeSort(a, mid + 1, hi);
            merge(a, lo, mid, hi);
        }
    }

    private void merge(int [] a, int lo, int mid, int hi) {
        int n1 = mid - lo + 1;
        int n2 = hi - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i = 0; i < n1; i++) {
            L[i] = a[lo + i];
        }
        for(int j = 0; j < n2; j++) {
            R[j] = a[mid + j + 1];
        }

        int i = 0;
        int j = 0;
        int k = lo;
        while(i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
            k++;
        }

        while(i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }
        while(j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
    }
}
