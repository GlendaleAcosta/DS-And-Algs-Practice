package alg.BinarySearch;
// Worst Case: O(log(n))

public class BinarySearch {

    public static void main(String[] args) {
        int arr[]={1, 3, 5, 10, 12, 30, 45, 60, 61, 64, 69, 78, 88, 89, 92, 100, 102};
        System.out.println(binarySearch(60, arr));
    }

    public static int binarySearch(int x, int[] arr){
        int first = 0;
        int last = arr.length - 1;
        int mid;

        while(first <= last) {
            mid = ((first + last) / 2);

            if (arr[mid] > x) {
                last = mid - 1;
            } else if (arr[mid] < x) {
                first = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
