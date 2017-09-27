package alg.DynamicProgramming.KnapSack;

public class KnapSack {
    private int numOfItems;
    private int capacityOfKnapSack;
    private int[][] knapSackTable;
    private int totalBenefit;
    private int[] weights;
    private int[] values;

    public KnapSack(int numOfItems, int capacityOfKnapSack, int[] weights, int[] values) {
        this.numOfItems = numOfItems;
        this.capacityOfKnapSack = capacityOfKnapSack;
        this.weights = weights;
        this.values = values;
        this.knapSackTable = new int [numOfItems+1][capacityOfKnapSack + 1];
    }

    public void solve() {

        // time complexity: O(N * W)
        for(int i = 1; i < numOfItems + 1; i++) {
            for(int w = 1; w < capacityOfKnapSack + 1; w++) {
                int notTakingItem = knapSackTable[ i - 1][w];
                int takingItem = 0;

                if (weights[i] <= w) {
                    takingItem = values[i] + knapSackTable[i - 1][w - weights[i]];
                }

                knapSackTable[i][w] = Math.max(notTakingItem, takingItem);
            }
        }
        totalBenefit = knapSackTable[numOfItems][capacityOfKnapSack];
    }

    public void showResult() {
        System.out.println("Total Benefit: " + totalBenefit);
        for(int n = numOfItems, w = capacityOfKnapSack; n > 0; n--) {
            if (knapSackTable[n][w] != 0 && knapSackTable[n][w] != knapSackTable[n-1][w]) {
                System.out.println("We take item : #" + n );
                w = w - weights[n];
            }
        }
    }
}
