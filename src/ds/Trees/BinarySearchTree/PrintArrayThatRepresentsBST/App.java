package ds.Trees.BinarySearchTree.PrintArrayThatRepresentsBST;

// An array represents a BST. Print the array in order

public class App {
    public static void main(String[] args) {
        int arr[] = {4, 2, 5, 1, 3};
        printSorted(arr, 0, arr.length-1);
    }

    public static void printSorted(int[] a, int start, int end) {
        if (start > end) return;

        printSorted(a, (2 * start + 1), end);
        System.out.print(a[start] + " ");
        printSorted(a, (2 * start + 2), end);
    }
}
