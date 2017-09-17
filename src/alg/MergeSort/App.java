package alg.MergeSort;

public class App {
    public static void main(String[] args) {
        int[] a = {0, 5, 3, 2, 7, 8, 1, 10, 4, 6, 9};
        MergeSort sorter = new MergeSort();
        sorter.mergeSort(a);

        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
