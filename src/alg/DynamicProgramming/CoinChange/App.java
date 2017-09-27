package alg.DynamicProgramming.CoinChange;

public class App {
    public static void main(String[] args) {
        int[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int M = 4000;

        CoinChange change = new CoinChange();
//        System.out.println("Number of ways: " + change.recursiveCoinChange(M, v, 0));
        change.DpCoinChange(v, M);
    }
}