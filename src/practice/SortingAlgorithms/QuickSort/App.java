package practice.SortingAlgorithms.QuickSort;

public class App {
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        QuickSort sorter = new QuickSort();
        sorter.QuickSort(arr);
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
