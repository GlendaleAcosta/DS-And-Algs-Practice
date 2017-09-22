package ds.Hashing.ArraySubsetOfArray;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        int arr1[] = {11, 1, 13, 21, 3, 7};
        int arr2[] = {11, 3, 7, 1};

        boolean isArr2SubsetOf1 = isSubset(arr1, arr2);
        boolean isArr1SubsetOf2 = isSubset(arr2, arr1);

        System.out.println(isArr2SubsetOf1);
        System.out.println(isArr1SubsetOf2);

    }

    public static boolean isSubset(int[] a1, int[] a2) {
        HashSet<Integer> hash = new HashSet<>();
        int m = a1.length;
        int n = a2.length;
        for(int i = 0; i < m; i++) {
            if(!hash.contains(a1[i]))
                hash.add(a1[i]);
        }

        for(int i = 0; i < n; i++) {
            if (!hash.contains(a2[i]))
                return false;
        }
        return true;
    }
}
