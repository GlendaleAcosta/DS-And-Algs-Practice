package ds.Hashing.CheckDupsWithinK;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        int[] a = {13, 15, 2, 65, 36, 83, 25, 573, 35, 2, 41, 25, 24, 85, 71};
        boolean hasDuplicates = checkDuplicatesWithinK(a, 9);
        System.out.println(hasDuplicates);
    }

    public static boolean checkDuplicatesWithinK(int[] a, int k) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                System.out.println(a[i] + " is a duplicate.");
                return true;
            }
            set.add(a[i]);
            if (i >= k) {
                set.remove(a[i-k]);
            }
        }
        return false;
    }
}
