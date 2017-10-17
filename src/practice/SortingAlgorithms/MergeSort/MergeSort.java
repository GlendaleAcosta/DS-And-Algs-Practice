package practice.SortingAlgorithms.MergeSort;

public class MergeSort {

    public void mergeSort(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        mergeSort(arr, start, end);
    }

    private void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end )/ 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    private void merge(int[] arr, int start, int mid, int end) {
        int[] n1 = new int[mid - start + 1];
        int[] n2 = new int[end - mid];

        for(int i = 0; i < n1.length; i++)
            n1[i] = arr[start + i];

        for(int i = 0; i < n2.length; i++)
            n2[i] = arr[mid + i + 1];

        int i = 0;
        int j = 0;
        int k = start;

        while(i < n1.length && j < n2.length) {
            if (n1[i] <= n2[j]) {
                arr[k] = n1[i];
                i++;
            } else {
                arr[k] = n2[j];
                j++;
            }
            k++;
        }

        while(i < n1.length) {
            arr[k] = n1[i];
            i++;
            k++;
        }
        while(j < n2.length) {
            arr[k] = n2[j];
            j++;
            k++;
        }

    }
}
