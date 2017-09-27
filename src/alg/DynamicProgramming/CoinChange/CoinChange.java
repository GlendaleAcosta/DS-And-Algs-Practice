package alg.DynamicProgramming.CoinChange;

public class CoinChange {

    // exponential running time O(2^N)
    public int recursiveCoinChange(int M, int[] v, int index) {
        if (M < 0) return 0;
        if (M == 1) return 1;

        if (v.length == index) return 0;

        return recursiveCoinChange(M - v[index], v, index) + recursiveCoinChange(M, v, index + 1);
    }

    public void DpCoinChange(int[] v, int M) {
        int[][] dpTable = new int[v.length+1][M+1];

        for(int i = 0; i <= v.length; i++) {
            dpTable[i][0] = 1;
        }

        for(int i = 1; i <= M; i++) {
            dpTable[0][i] = 0;
        }

        // O(V*M)
        for(int i = 1; i <= v.length; i++) {
            for(int j = 1; j <= M; j++) {
                if(v[i-1] <= j) {
                    dpTable[i][j] = dpTable[i-1][j] + dpTable[i][j-v[i-1]];
                } else {
                    dpTable[i][j] = dpTable[i-1][j];
                }
            }
            System.out.println("Solution: " + dpTable[v.length][M]);
        }
    }
}
