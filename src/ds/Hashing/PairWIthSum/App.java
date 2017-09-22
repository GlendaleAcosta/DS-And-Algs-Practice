package ds.Hashing.PairWIthSum;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        int A[] = {1, 4, 45, 6, 10, -8};
        boolean hasPairWIthSum = hasPairWIthSum(A, 5);
        System.out.println(hasPairWIthSum);
    }

    public static boolean hasPairWIthSum(int[] a, int x) {
        HashSet<Integer> hash = new HashSet<>();
        int compliment;
        for(int i = 0; i < a.length; i++) {
            if (!hash.contains(a[i]))
                hash.add(a[i]);
            compliment = x - a[i];
            if(hash.contains(compliment)) {
                System.out.println(a[i] + " + " + compliment + " = " + x);
                return true;
            }
        }

        return false;
    }
}
