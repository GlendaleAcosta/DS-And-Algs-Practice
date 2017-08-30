package alg.MergeSort;

public class App {
    public static void main(String[] args) {
        int[] a = {9,7,3,1,6,3,2,6,8,9,2,3,0};
        MergeSort sorter = new MergeSort();
        sorter.sort(a);

        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
