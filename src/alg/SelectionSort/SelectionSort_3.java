package alg.SelectionSort;

public class SelectionSort_3 {
    public static void main(String[] args) {
        int[] arr = { 3, 15, 6, 19, 40, 4, 5, 99, 1000, 17, 36, 35, 34, 67, 78, 89, 91, 24, 72, 72, 72, 72 };

        int[] newArray =  SelectionSort_3(arr);
        for(int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }

    public static int[] SelectionSort_3 (int[] a) {
        for(int i = 0; i < a.length; i++) {
            int minIndex = i;
            for(int j = i; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }

        return a;
    }
}
