package stockSell;

public class BestTimeToSellStockOneTransactionBruteForce implements BestTimeToSellStock {
    @Override
    public int maxProfit(int[] prices) {
        int netProfit = 0;

        for(int i = 0; i < prices.length;i++){
            for(int j = i+1; j< prices.length;j++){
                if((prices[j] - prices[i]) > netProfit ){
                    netProfit = prices[j] - prices[i];
                }
            }
        }
        return netProfit;
    }
}
