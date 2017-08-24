package alg.InsertionSort;

public class InsertionSort_2 {
    public static void main(String[] args) {
        int myArray[] = InsertionSort_2(new int[] {9,8,99,110,8,87,637,8,3,13,89,12,99});

        for(int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    public static int[] InsertionSort_2(int[] a) {
        for(int i = 1; i < a.length; i++) {
            int element = a[i];
            int j = i;

            while(j > 0 && a[j] < a[j-1]) {
                a[j] = a[j-1];
                a[j-1] = element;
                j--;
            }
        }
        return a;
    }
}
