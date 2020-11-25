package stockSell;

public class BestTimeToSellStockOneTransactionOnePass implements BestTimeToSellStock {
    @Override
    public int maxProfit(int[] prices) {
        //two factors --- lowest and possible highest margin sale,
        // if we find lowest, reassign lowest cost price,
        // look for selling prices, that yields more profit that previous,
        // if found reassign the profit value
        // continue untill done

        int netProfit = 0;
        int lowest_cp_position = 0;
        for (int j = 1; j < prices.length; j++) {
            if (isLowestPrice(lowest_cp_position, j, prices)) {
                lowest_cp_position = j;
                continue;
            }
            if ((prices[j] - prices[lowest_cp_position]) > netProfit) {
                netProfit = prices[j] - prices[lowest_cp_position];
            }
        }
        return netProfit;
    }

    private boolean isLowestPrice(int lowest_cp_position, int currentPricePosition, int[] prices) {
        return prices[currentPricePosition] < prices[lowest_cp_position];
    }
}
