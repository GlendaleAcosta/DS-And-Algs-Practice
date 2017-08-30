package alg.MergeSort;

public class MergeSort {
    public static void sort(int a[]) {
        sort(a, 0, a.length - 1);
    }

    public static void sort(int a[], int start, int end) {
        if (end <= start) {
            return;
        }
        int mid = (start + end) / 2;
        sort(a, start, mid);
        sort(a, mid + 1, end);
        merge(a, start, mid, end);
    }

    public static void merge(int[] a, int start, int mid, int end) {
        int tempArr[] = new int[end - start + 1];
        int leftSlot = start; // index counter for left side of array
        int rightSlot = mid + 1; // index counter for right side of array
        int k = 0;

        while(leftSlot <= mid && rightSlot <= end) {
            if(a[leftSlot] < a[rightSlot]) {
                tempArr[k] = a[leftSlot];
                leftSlot++;
            } else {
                tempArr[k] = a[rightSlot];
                rightSlot++;
            }
            k++;
        }

        if(leftSlot <= mid) {
            while(leftSlot <= mid) {
                tempArr[k] = a[leftSlot];
                leftSlot++;
                k++;
            }
        } else if (rightSlot <= end) {
            while(rightSlot <= end) {
                tempArr[k] = a[rightSlot];
                rightSlot++;
                k++;
            }
        }

        for(int i = 0; i < tempArr.length; i++) {
            a[start + i] = tempArr[i];
        }
    }
}
