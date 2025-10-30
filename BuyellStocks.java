    // You are given an array prices where prices[i] is the price of a given stock on the ith day.
// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
// Example 1:
// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
public class BuyellStocks {
    public int maxProfit(int[] prices) {
        int buyprice=Integer.MAX_VALUE;    //for first iteration use track minimizer
        int maxprofit=0;     //if no profit is found 

        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){
                
                int profit=prices[i]-buyprice;
                maxprofit=Math.max(profit,maxprofit);
                
            }else{
                buyprice=prices[i];
            }
        }return maxprofit;
        
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        //profit=sellprice-buyprice
        BuyellStocks sol=new BuyellStocks();
        System.out.println(sol.maxProfit(prices));
    }
}
//  Iteration 0 (i = 0)
// sellingprice[i] = 7

// buyprice < sellingprice[i]?
// → Integer.MAX_VALUE < 7 →  False

// So we update buyprice = 7

//  Now:
// buyprice = 7, maxprofit = 0

//  Iteration 1 (i = 1)
// sellingprice[i] = 1

// buyprice < sellingprice[i]?
// → 7 < 1 →  False

// So we update buyprice = 1

// 🔹 Now:
// buyprice = 1, maxprofit = 0

// 📍 Iteration 2 (i = 2)
// sellingprice[i] = 5

// buyprice < sellingprice[i]?
// → 1 < 5 → ✅ True

// profit = 5 - 1 = 4

// maxprofit = max(4, 0) = 4

// 🔹 Now:
// buyprice = 1, maxprofit = 4

// 📍 Iteration 3 (i = 3)
// sellingprice[i] = 3

// buyprice < sellingprice[i]?
// → 1 < 3 → ✅ True

// profit = 3 - 1 = 2

// maxprofit = max(2, 4) = 4 (no change)

// 🔹 Now:
// buyprice = 1, maxprofit = 4

// 📍 Iteration 4 (i = 4)
// sellingprice[i] = 6

// buyprice < sellingprice[i]?
// → 1 < 6 → ✅ True

// profit = 6 - 1 = 5

// maxprofit = max(5, 4) = 5

// 🔹 Now:
// buyprice = 1, maxprofit = 5
