package practice;

import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        int[] digits = { 9, 9, 9};
//        printAlg(plusOne(digits));
//        System.out.println(reverse(123));
        System.out.println(isIsomorphic("ab", "aa"));

    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;

        return newNumber;
    }

    public static void printAlg(int[] digits) {
        for(int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }

    public static int reverse(int x) {

            int result = 0;
            int cnt = 0;
            while (x != 0)
            {
                int tail = x % 10;
                System.out.println( ++cnt + " " + tail);

                int newResult = result * 10 + tail;
                if ((newResult - tail) / 10 != result)
                { return 0; }
                result = newResult;
                x = x / 10;
            }

            return result;

    }

    public static boolean isIsomorphic(String s, String t) {
        int n = s.length();
        HashMap<Character, Character> map = new HashMap<>();
        char c1;
        char c2;
        for(int i = 0; i < n; i++) {
            c1 = s.charAt(i);
            c2 = t.charAt(i);
            if (!map.containsKey(c1))
                map.put(c1, c2);
            else
                if (map.get(c1) != c2)
                    return false;
        }
        return true;
    }
}
