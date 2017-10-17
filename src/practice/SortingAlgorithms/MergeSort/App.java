package practice.SortingAlgorithms.MergeSort;

public class App {
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        MergeSort sorter = new MergeSort();
        sorter.mergeSort(arr);
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " - ");

    }
}
