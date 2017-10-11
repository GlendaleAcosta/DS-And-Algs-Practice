//package practice.BinarySearch;
//
//public class App {
//    public static void main(String[] args) {
//        int [] nums = {3, 9, 17, 24, 35, 46, 69, 71, 78, 83, 94, 99};
//        int index = binarySearch(nums, 71);
//        System.out.println(index);
//    }
//
//    public static int binarySearch(int nums[], int val) {
//        int start = 0;
//        int end = nums.length - 1;
//        return binarySearch(nums, val, start, end);
//    }
//
//    public static int binarySearch(int nums[], int val, int start, int end) {
//        if (end >= start) {
//            int mid = (start + end) / 2;
//            if (val == nums[mid]) {
//                return mid;
//            } else if (val > nums[mid]) {
//                return binarySearch(nums, val, mid++, end);
//            } else
//                return binarySearch(nums, val, start, mid++);
//        }
//        return -1;
//    }
//}