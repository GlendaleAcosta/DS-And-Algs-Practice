package practice.BinarySearch;

public class App2 {
    public static void main(String[] args) {
        int [] arr = {1, 3, 5, 13, 15, 17, 21, 24, 29, 31, 41, 45, 47, 51, 53, 58, 61, 69, 73, 81, 87, 96, 99, 100};
        binarySearch(arr, 5);

    }

    public static int binarySearch(int arr[], int val) {
        int end = arr.length;
        int start = 0;
        return binarySearch(arr, start, end, val);
    }

    public static int binarySearch(int arr[], int start, int end, int val) {
        if (end >= start) {
            int mid = (start + end) / 2;
            if (arr[mid] == val) {
                System.out.println(val + " is at index " + mid);
                return mid;
            } else if (val > arr[mid]) {
                return binarySearch(arr, mid + 1, end, val);
            } else if (val < arr[mid]) {
                return binarySearch(arr, start, mid - 1, val);
            }
        }
        System.out.println("Value could not be found.");
        return -1;
    }
}
