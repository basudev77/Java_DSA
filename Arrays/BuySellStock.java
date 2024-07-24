package JAVA_DSA.Arrays;

public class BuySellStock {

    public static int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int op = 0;
        int currPro = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            }
            currPro = prices[i] - buy;
            if (currPro > op) {
                op = currPro;
            }
        }

        return op;
    }
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        
        System.err.println(maxProfit(arr));
    }

}
