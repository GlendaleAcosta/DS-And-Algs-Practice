package alg.SelectionSort;

public class SelectionSort_2 {
    public static void main(String[] args) {
        int[] arr = {3, 15, 6, 19, 40, 4, 5, 99, 1000, 17, 36, 35, 34, 67, 78, 89, 91, 24, 72};
        int[] newArray = SelectionSort(arr);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }

    public static int[] SelectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int min = 9999999;
            int minIndex = -1;
            for(int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            arr[minIndex] = arr[i];
            arr[i] = min;
        }
        return arr;
    }
}
