package alg.SelectionSort;
// Worst Case: O(n^2)
// Best Case: O(n^2)

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 3, 15, 6, 19, 40, 4, 5, 99, 1000, 17, 36, 35, 34, 67, 78, 89, 91, 24, 72 };

        int[] newArray =  SelectionSort(arr);
        for(int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }

    public static int[] SelectionSort(int[] arr) {
        int length = arr.length;

        for(int i = 0; i < length; i++) {
            int min = i;
            for(int j = i + 1; j < length; j++ ) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
}
